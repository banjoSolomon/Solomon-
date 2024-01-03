public class ReverseList{
	 public int[] ReverseIntElement(int[] numbers){
	int[] newIndex = new int[numbers.length];
	int count = 0;
	
	for(int i = numbers.length - 1; i >= 0; i--){
	 newIndex[count] = numbers[i];
		count++;
	
       }
	

	return newIndex;
    }


		


}
