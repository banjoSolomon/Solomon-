import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a postive number: ");
	int userInput = input.nextInt();

	//int number = 0;
 	int prime = 0;
	for(int count = 1; count <= userInput; count++){
	if(userInput % count == 0){
		  prime++;

	}

	}
	
	if(prime == 2){
	System.out.println("Is a prime number");
       }
	else{
	System.out.print("not a prime number");

         }

      


  }




}

