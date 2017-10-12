package epam.com.test.api.tests;

import epam.com.test.api.support.model.GeneralInfo;
import epam.com.test.api.support.utils.constants.ProjectConstants;
import okhttp3.Request;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneralRequestTest extends BaseTest {

	private static final int FIRST_ITEM = 0;

	@Test
	public void generalRequestTest() {

		List<GeneralInfo> list = Collections.synchronizedList(new ArrayList<GeneralInfo>());
		List<Integer> idList = serviceHelper.idList();

		int characterId = serviceHelper.getCharacterId(FIRST_ITEM);
		Request request = serviceHelper.getCharacterRequest(characterId);

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(request.method().equals(ProjectConstants.GET_METHOD),
				String.format("Method should be %s", ProjectConstants.GET_METHOD));

		softAssert.assertEquals(request.url().host(), ProjectConstants.MAIN_HOST,
				String.format("Request is not correct. Host should be as %s", ProjectConstants.MAIN_HOST));

		serviceHelper.executeGetCharacterRequest(idList, list);
		softAssert.assertTrue(list.size() == idList.size(), "All Id should be related to certain characters.");

		softAssert.assertAll();
	}
}
