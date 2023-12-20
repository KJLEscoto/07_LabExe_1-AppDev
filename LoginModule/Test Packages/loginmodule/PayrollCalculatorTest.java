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


class PayrollCalculatorTest {
	
	PayrollCalculator toCalculate = new PayrollCalculator();
	
	@Test
	public void testGetTotalSalary() {
        double hourlyRate = 10.0;
        double hours = 40.0;
        double overtime = 5.0;
        
        double expectedTotalSalary = (hours * hourlyRate) + ((hourlyRate * 1.5) * overtime);
        double actualTotalSalary = toCalculate.getTotalSalary(hourlyRate, hours, overtime);
        
        assertEquals(expectedTotalSalary, actualTotalSalary, 0.001);
    }
	
    @Test
    public void testGetRegularPay() {
        double hourlyRate = 10.0;
        double hours = 40.0;
        
        double expectedRegularPay = hours * hourlyRate;
        toCalculate.getTotalSalary(hourlyRate, hours, 0);
        
        assertEquals(expectedRegularPay, toCalculate.getRegularPay(), 0.001);
    }

    @Test
    public void testGetOverTimePay() {
        double hourlyRate = 10.0;
        double overtime = 5.0;
        
        double expectedOvertimePay = (hourlyRate * 1.5) * overtime;
        toCalculate.getTotalSalary(hourlyRate, 0, overtime);
        
        assertEquals(expectedOvertimePay, toCalculate.getOverTimePay(), 0.001);
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
