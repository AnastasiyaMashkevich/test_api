package epam.com.test.api.tests;

import epam.com.test.api.support.model.GeneralInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResponseBodyTest extends BaseTest {

	@Test
	public void responseBodyTest() {
		GeneralInfo generalInfo = serviceHelper.getCharactersListObject();

		Assert.assertNotNull(generalInfo,
				"Object was not received from request. ");
		Assert.assertTrue(generalInfo.getData().getResults().size() != 0,
				"Results list should be more then zero.");
	}
}
