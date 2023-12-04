import java.util.Scanner;

public class Nokia2{

public static void main void(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("MENU");
System.out.println("1. Phone Book (Select 1 to check phonebook: ");
System.out.println("2. Message (Select 2 to check Messages: ");
System.out.println("3. Chat (Select 3 to check Chat: ");
System.out.println("4. Call Register (Select 4 to check Register: ");
System.out.println("5. Settings (Select 6 to check Settings: ");
System.out.println("6. Tones (Select 5 to check Tones: ");
System.out.println("7. Call Divert (Select 7 to check Call Divert: ");
System.out.println("8. Games (Select 8 to check Games: ");
System.out.println("9. Calculator (Select 9 to check Calculator: ");
System.out.println("10. Reminders (Select 10 to check Reminders: ");
System.out.println("11. Clock (Select 11 to check Clock: ");
System.out.println("12. SIM services (Select 12 to check SIM services: ");
System.out.println("Select option 1 -13: ");

int menu = input.nextInt();

if(menu == 1)
	System.out.println("PHONE BOOK");
	System.out.println("1. Serch (Select 1 to check Search: ");
	System.out.println("2. Service number (Select 2 to see Service number: ");
	System.out.println("3. Add Name (Select 3 to Add Name: ");
	System.out.println("4. Erase (Select 4 to Erase: ");
	System.out.println("5. Edit (Select 5 to Edit: ");
	System.out.println("6. Assign tone (Select 6 to Assign tone: ");
	System.out.println("7. Options (Select 7 to select from Options ");
	System.out.println("8. Speed dials (Select 8 to check Speed dials: ");
	System.out.println("9: Voice tags (Select 9 to check Voice tags: ");
	input phoneBook = input.nextInt();

		if(phoneBook == 1)
			System.out.println("Search");
		if(phoneBook == 2)
			System.out.println("Service No");
		if(phoneBook == 3)
			System.out.println("Add names");
		if(phoneBook == 4)
			System.out.println("Erase");
		if(phoneBook == 5)
			System.out.println("Edidt");
		if(phoneBook == 6)
			System.out.println("Assign tone");
		if(phoneBook == 7)
			System.ot.println("Send card");
		if(phoneBook == 8){
			System.out.println("Options");
			System.out.println("1. Type of view");
			System.out.println("2. Memory Status");
			int options = input.nextInt();
				if (options == 1)
					System.out.println("Type of view");
				if(options == 2)
					System.out.println("Memory Status");
	}
		
	if(phoneBook == 9)
		System.out.println("Speed dials");
	if(phoneBook == 10)
		System.out.println("Voice tags");
	else
		System.out.println("Choose again");

} 





}