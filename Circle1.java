import java.util.Scanner;
public class Circle1{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Radius: ");
int radius = input.nextInt();
double pi = 3.14159;

int diameter = 2 * radius;
double circumfrence = 2 * pi * radius;
double area = pi * radius * radius;
System.out.printf("diameter  is %d%n",diameter);
System.out.printf("circumfrence  is %.2f%n", circumfrence);
System.out.printf("area is %.2f", area);









}










}