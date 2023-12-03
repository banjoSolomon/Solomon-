import java.util.Scanner;
public class Solve{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter Numbers: ");
int num = input.nextInt();

int num1 = 0;
int positiveCount = 0;
int negetiveCount = 0;
int zero = 0;

do{
System.out.print("Enter Your Number: ");
int enterYourNumber = input.nextInt();
if(enterYourNumber <= -1)
	countNegetive++;

if(enterYourNumber >= 1)
	countNegetive++;

if(enterYourNumber == 0)
	zero++;
num1++;
num = num1++;
}

System.out.printf("Positive numbers is: %d%n Negetive number is: %d%n Number of zero is:%d", positiveCount,negetiveCount, zero);
}


}