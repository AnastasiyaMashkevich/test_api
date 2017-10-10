package epam.com.test.api.support.utils;

import epam.com.test.api.support.model.GeneralInfo;
import epam.com.test.api.support.service.Service;
import epam.com.test.api.support.service.wrapper.ServiceWrapper;
import epam.com.test.api.support.utils.constants.ProjectConstants;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

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

	public Response getComicsListResponse() {
		try {
			return getComicsListCall().execute();
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public Call getComicsListCall(){
		return service.getComicsList(ts, publicKey, hash);
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

}
