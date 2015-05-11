package rchambers;

public class UtilTest {

	private Util fixture;

	@Before
	public void setUp() throws Exception {
		fixture = new Util();
	}

	@Test
	public void testReturnTrueIfNull_true() {
		Assert.assertTrue(fixture.returnTrueIfNull(null));
	}
}