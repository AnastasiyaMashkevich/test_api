package epam.com.test.api.support.utils;

import epam.com.test.api.support.model.GeneralInfo;
import epam.com.test.api.support.model.Result;
import epam.com.test.api.support.service.Service;
import epam.com.test.api.support.service.wrapper.ServiceWrapper;
import epam.com.test.api.support.utils.constants.ProjectConstants;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ServiceHelper {
	private Service service;
	private String ts = ProjectConstants.TS;
	private String publicKey = ProjectConstants.PUBLIC_KEY;
	private String hash = ProjectConstants.HASH;

	public ServiceHelper() {
		service = ServiceWrapper.getInstance();
	}

	private Call<ResponseBody> getCharactersListCall() {
		return service.getCharactersList(ts, publicKey, hash);
	}

	private Call<ResponseBody> getComicsListCall() {
		return service.getComicsList(ts, publicKey, hash);
	}

	public Response getComicsListResponse() {
		try {
			return getComicsListCall().execute();
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public Request getCharacterRequest(int characterId) {
		return service.getCharacter(characterId, ts, publicKey, hash).request();
	}

	public GeneralInfo getCharactersListObject() {
		String body;
		try {
			body = new String(getCharactersListCall().execute().body().bytes());
			return JsonHelper.fromJson(body, GeneralInfo.class);
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public int getCharacterId(int index) {
		return getCharactersListObject().getData().getResults().get(index).getId();
	}

	public List<Integer> getCharactersIdsList() {
		return getCharactersListObject().getData().getResults().stream().map(Result::getId)
				.collect(Collectors.toList());
	}

	public void executeGetCharacterRequest(List<Integer> IdList, List<GeneralInfo> actual) {
		Set<Callable<String>> setCalls = new HashSet<Callable<String>>();
		for (int id : IdList) {

			setCalls.add(new Callable<String>() {
				@Override
				public String call() throws Exception {
					GeneralInfo generalInfo = null;
					Service service = ServiceWrapper.getInstance();
					try {
						String responseString = new String(service.getCharacter(id, ProjectConstants.TS, ProjectConstants.PUBLIC_KEY,
										ProjectConstants.HASH).execute().body().bytes());
						generalInfo = JsonHelper.fromJson(responseString, GeneralInfo.class);
					} catch (Exception e) {
						throw new RuntimeException(e.getMessage(), e);
					}
					if (generalInfo != null) {
						actual.add(generalInfo);
					}
					return "";
				}

			});
		}
		ExecutorService executorService = Executors.newFixedThreadPool(ProjectConstants.THREADS_NUMBER);
		try {
			executorService.invokeAll(setCalls);
		} catch (InterruptedException e) {
			throw new RuntimeException(e.getLocalizedMessage());
		}
		executorService.shutdown();
	}

}
