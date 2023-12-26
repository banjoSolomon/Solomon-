public class ArrayLargest{
	public static void main(String[] args){
	
	int [] numbers = {3, 34, 12, 65, 23, 45, 18, 90, };

	int max = 0;

	for(int i = 0; i < numbers.length; i ++){
	if(numbers[i] > numbers[max]) max = i;
	
         }
	System.out.print("Elements are : ");

	for(int i = 0; i < numbers.length; i ++){
	System.out.print(numbers[i] + " ");
        }
	System.out.println();

	System.out.println("Largest value is : " + numbers[max]);

  }



}