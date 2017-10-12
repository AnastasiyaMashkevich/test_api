package epam.com.test.api.tests;

import epam.com.test.api.support.utils.ServiceHelper;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	protected ServiceHelper serviceHelper;

	@BeforeMethod
	public void setup() {
		serviceHelper = new ServiceHelper();
	}
}
