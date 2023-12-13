import java.util.Scanner;
public class MonthYear10{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter month:");
	int month = input.nextInt();

	System.out.print("Enter year:");

	int year = input.nextInt();
if (year%4 == 0 )  {
System.out.println("febuary" + year + " has 29 days");
	
}
else if(month == 2){
System.out.println("febuary" + year + " has 28 days");
}

if(month == 1){
System.out.println("january" + year + " has 31 days");
}

if(month == 3){
System.out.println("march" + year + " has 31 days");
}

if(month == 4){
System.out.println("april" + year + " has 30 days");
}

if(month == 5){
System.out.println("may" + year + " has 31 days");
}

if(month == 6){
System.out.println("june" + year + " has 30 days");
}

if(month == 7){
System.out.println("july" + year + " has 31 days");
}

if(month == 8){
System.out.println("august" + year + " has 30 days");
}

if(month == 9){
System.out.println("september" + year + " has 30 days");
}

if(month == 10){
System.out.println("october" + year + " has 31 days");
}

if(month == 11){
System.out.println("november" + year + " has 30 days");
}

if(month == 12){
System.out.println("december" + year + " has 31 days");
}

}

}























