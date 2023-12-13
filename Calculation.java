import java.util.Scanner;
public class Calculation{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number:");
int num = input.nextInt();
int count = 1;
if (num > 12 || num <1){
	System.out.print("INVALID THEM SUPPOSE BEAT U !!!!");
}
else{

while (count <=12){
	int result = num * count;	
	System.out.printf("%d * %d = %d%n", num,count,result);
	count = count +1;
}

}	
}

}











