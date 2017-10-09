package epam.com.test.api.tests;



import epam.com.test.api.support.utils.ServiceHelper;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public ServiceHelper serviceHelper;

	@BeforeTest
	public void setup() {
		serviceHelper = new ServiceHelper();
	}
}
