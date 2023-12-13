import java.util.Scanner;
public class Acceleration{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Velocity1");
double Velocity1 = input.nextDouble();
System.out.print("Velocity2");
double Velocity2 = input.nextDouble();
System.out.print("timespan");
double acceleration = input.nextDouble();
double difference = (Velocity1-Velocity2);
double averageAcceleration = (difference/acceleration);
System.out.printf("the Acceleration is%.3f" , averageAcceleration);






}





}
