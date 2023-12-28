import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RunningArrayTest{

	@Test
	public void testIfThisCanGetRunningTotalInt(){

	RunningArray newArray = new RunningArray();
	int[] letsCheck = {6, 9, 8, 23, 67, 98 };
	int total = newArray.totalIntElement(letsCheck);
	assertEquals(211, total);
	
	
	int[] checkAgain = {7, 67, -45, -3, 23, 80 };
	int total2 = newArray.totalIntElement(checkAgain);
	assertEquals(129, total2);
	}

	@Test
	public void testIfThisCanGetTotalDouble(){

	RunningArray myArray = new RunningArray();
	double[] letsView = {23.2, 33.1, 66.2, 12.3, 2.1, 1.2};
	double total3 = myArray.totalDoubleElement(letsView);
	assertEquals(138.1, total3);    

       }


}