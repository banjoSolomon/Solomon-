import java.util.Scanner;

public class High{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of student:" );
int studentNum = input.nextInt();

int highestScore = 0;
String studentWithHighestScore = "";


for (int b = 0; b < studentNum; b++){
System.out.print("Enter name of student " + (b+1) + ": ");
String name = input.next();
System.out.print("Enter score of student " + (b+1) + ": ");
int score = input.nextInt();

if(score > highestScore){
highestScore = score;
studentWithHighestScore = name;

 }
}
System.out.println("The student with highest scores is:" + studentWithHighestScore);



 }
}





