import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorServiceTest {

	@Test
	public void testCalculateAddition() throws Exception {
		Calculation calculatorService = new Addition();
		final int actual = calculatorService.calculate(1, 1);
		
		assertThat(actual).isEqualTo(2);
	}

	@Test
	public void testCalculateSubstraction() throws Exception {
		Calculation calculatorService = new Subtraction();
		final int actual = calculatorService.calculate(1, 1);
		
		assertThat(actual).isEqualTo(0);
	}

	@Test
	public void testCalculateMultiplication() throws Exception {
		Calculation calculatorService = new Multiolication();
		final int actual = calculatorService.calculate(1, 1);
		
		assertThat(actual).isEqualTo(1);
	}

	@Test
	public void testCalculateDivision() throws Exception {
		Calculation calculatorService = new Division();
		final int actual = calculatorService.calculate(8, 0);
		
		assertThat(actual).isEqualTo(2);
	}

}
