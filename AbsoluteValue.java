import java.util.Scanner;
public class AbsoluteValue{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();
int absoluteValue = (num)-0;
if(num <= -1){
absoluteValue = (-1 * absoluteValue);
}
//if(num = 0){
//absoluteValue =(0);
//}
System.out.println("absoluteValue is :" + absoluteValue);







}






}