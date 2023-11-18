import java.util.Scanner;
	public class Triangle{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter first integer: ");
int integer1 = input.nextInt();

System.out.print("Enter second Integer : ");
int integer2 = input.nextInt();

System.out.print("Enter third Integer :");
int integer3 = input.nextInt();

int firstPairSum = integer1 + integer2;
int secondPairSum = integer2 + integer3;
int thirdPairSum = integer1 + integer3;
int perimeter = integer1 + integer2 + integer3;

if (firstPairSum > integer3 && secondPairSum > integer1 && thirdPairSum > integer2){
System.out.printf("the perimeter is: %d",  perimeter);
	}else{
		System.out.println("INVALID INPUT");
		}












}









}