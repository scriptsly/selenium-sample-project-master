package rchambers;

import java.util.List;

public class ValidationIntegrationTest {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	@Test
	public void testFormsIntegration() throws Exception {
		driver.get("http://localhost/validation.html");
		assertPageIsLoaded();
		List<WebElement> failedElements = driver.findElements(By.xpath("//span[@class='fail']"));
		Assert.assertEquals(0, failedElements.size());
	}

	private void assertPageIsLoaded() {
		driver.findElement(By.id("qunit-header"));
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}