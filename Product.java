import java.util.Scanner;
public class Product{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Product: ");
String iteam = input.nextLine();
System.out.print("Price: ");
double price = input.nextDouble();
System.out.print("Enter discount: ");
double discount = input.nextDouble();
double totalDiscount = (price - (price * discount * 0.01));

System.out.print("totalDiscount is :" + totalDiscount);
}
}