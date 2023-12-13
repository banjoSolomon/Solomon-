import java.util.Scanner;
public class Multiple{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first Integer:");
 	int integer1 = input.nextInt();
	System.out.print("Enter second Integer:");
	int integer2 = input.nextInt();

int doubleInteger2 = integer2 * integer2; 
int tripleInteger1 = integer1 * integer1 * integer1;
int tota = tripleInteger1 % doubleInteger2;

System.out.println(tripleInteger1);
System.out.println(doubleInteger2);



if(tota == 0){
System.out.printf("%d cube is multiple of %d double",integer1, integer2);
}
if(tota !=0){
System.out.printf("%d triple is not multiple of %d double",integer1, integer2);
}



}










}