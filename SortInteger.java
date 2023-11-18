import java.util.Scanner;
public class SortInteger{
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
System.out.print("Enter first integer:");
int firstInteger = input.nextInt();

System.out.print("Enter second integer:");
int secondInteger = input.nextInt();

System.out.print("Enter third integer:");
int thirdInteger = input.nextInt();

if(firstInteger >=secondInteger && firstInteger >= thirdInteger){
System.out.print(firstInteger + " "+ secondInteger +" "+ thirdInteger);
}else if(secondInteger >= firstInteger){
System.out.print( firstInteger + " " + secondInteger + " "+ thirdInteger);
}else if(secondInteger>=firstInteger && secondInteger>=thirdInteger){
System.out.print( secondInteger + " " + firstInteger + " "+ thirdInteger);
}else if(firstInteger>=secondInteger){
System.out.print( thirdInteger + " " + secondInteger + " "+firstInteger);
}else if(thirdInteger>=secondInteger && thirdInteger >= firstInteger){
System.out.print( thirdInteger + " " + firstInteger + " "+secondInteger);
}else if(firstInteger>=thirdInteger){
System.out.print( thirdInteger + " " + secondInteger + " "+firstInteger);

}

  }
	
}