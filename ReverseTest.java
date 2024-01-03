import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseTest{

	@Test
	public void testIfTheNumberIsReverseInt(){
	ReverseList newNumber = new ReverseList();
	int[] letsCheck = { 4, 8, 22, 45, 12, 30, 16};
	int[] array = {16, 30, 12, 45, 22, 8, 4,};
	int[] result = newNumber.ReverseIntElement(letsCheck);
	assertArrayEquals(array, result);
	


     }





}
