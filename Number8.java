import java.util.Scanner;
public class Number8{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
int num1 = input.nextInt();

System.out.print("Enter secound number: ");
int num2 = input.nextInt();

int result = 1;
for(int b=1;b<=num2;b++){
result = result * num1;

  }
System.out.println("The raised to power is : " + result);



}



}