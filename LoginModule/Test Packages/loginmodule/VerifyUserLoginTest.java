/**
 * 
 */
package loginmodule;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class VerifyUserLoginTest {

	@Test
	public void testVerifyLoginCredentials() {
		System.out.println("VerifyLoginCredentials");
		VerifyUserLogin toVerify = new VerifyUserLogin();
		String inputUserName = "kent";
		String inputPassword = "123";
		boolean expectedResult = true;
		boolean result = toVerify.verifyUserLoginCredentials(inputUserName, inputPassword);
		assertEquals(expectedResult, result);
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
}
