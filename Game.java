import java.util.Scanner;
public class Game{
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);	
	Scanner input1 = new Scanner(System.in);

	System.out.print("Enter player1 name :" );
	String name1 = input.nextLine();

	System.out.print("Enter player2 name :" );
	String name2 = input.nextLine();

	int scissors = 0;
	int rock = 1;
	int paper = 2;

	int num1 = userInput1.nexInt();
	System.out.printf("player1: %s %s", name1, " play your game");
	int num2 = userInput1.nexInt();
	System.out.printf("player2: %s %s", name2, " play your game");
	
if(num1 == scissors && num2 == rock) System.out.print(name1 + " :  winner");
if(num1 == rock && num2 == scissors) System.out.print(name2 + " :  winner");


	

	
	






}









}