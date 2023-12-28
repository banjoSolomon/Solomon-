import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LargestNumberTest{

	@Test
	public void testIfThisCanGetHighestInt(){
	LargestNumber newArray = new LargestNumber();
	int[] letsCheck = {463, 582, 508, 392, 472, 382};
	int result = newArray.largestIntElement(letsCheck);
	assertEquals(582, result);

	int[] checkAgain = {-432, -345, 467, -123, 980 };
	int result2 = newArray.largestIntElement(checkAgain);
	assertEquals(980, result2);

	int[] checkSec = { -345, -235, -23, -56, -123, -98 };
	int result3 = newArray.largestIntElement(checkSec);
	assertEquals(-23, result3);

        }

	@Test
	public void testIfThisCanGetHighestDouble(;){
	LargestNumber anotherArray = new LargestNumber();
	double[] letsView = { 33.2, 66.2, 21.5, 76.3, 67.9 };
	double result4 = anotherArray.largestDoubleElement(letsView);
	assertEquals(76.3, result4); 


     }







}