/**
 * 
 */
package taxcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTaxCalculatorTest {
	
	@Test
	public void testCalculateItemTax() {
		System.out.println("CalculateItemTax method");
		ItemTaxCalculator instance = new ItemTaxCalculator();
		double itemPrice = 50.0;
		double taxPercent = 1.0;
		double expectedResult = 5.0;
		double result = instance.CalculateItemTax(itemPrice, taxPercent);
		assertEquals(expectedResult, result, 1.0);
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
