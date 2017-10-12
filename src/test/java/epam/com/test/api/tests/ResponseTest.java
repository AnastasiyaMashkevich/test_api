package epam.com.test.api.tests;

import epam.com.test.api.support.utils.constants.ProjectConstants;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import retrofit2.Response;

public class ResponseTest extends BaseTest {

	@Test
	public void generalResponceTest() {

		Response response = serviceHelper.getComicsListResponse();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(response.code(), ProjectConstants.SUCCESS_STATUS_CODE, "Status code is not correct. ");
		softAssert.assertTrue(response.isSuccessful(), "Response error.");
		softAssert.assertEquals(response.raw().message(), ProjectConstants.SUCCESS_STATUS_MESSAGE,
				"Status message is not correct. ");

		softAssert.assertTrue(response.raw().protocol().toString().contains(ProjectConstants.PROTOCOL),
				"Protocol is not correct. ");
		softAssert.assertTrue(response.headers().size() != 0, "Header values are not present.");
		softAssert.assertAll();
	}
}
