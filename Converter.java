import java.util.Scanner;

public class Converter{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter exchange rate : ");
double exchangerate = input.nextDouble();

System.out.print("Enter 0 to convert dollar to RMB and 1 vise : ");
int userChoice = input.nextInt();

if (userChoice == 0){
System.out.print("Enter the amount of dollar : ");
double dollar = input.nextDouble();
double dollartoRMB = dollar * exchangerate;
System.out.printf("$%.1f to RMB is %.1f yuan", dollar,dollartoRMB);

}

if(userChoice == 1){
System.out.print("Enter amount of RMB : ");
double RMB = input.nextDouble();
double RMBtodollar = RMB/exchangerate;
System.out.printf("%.1f to Dollar is $%.2f", RMB,RMBtodollar);




}



}








}














