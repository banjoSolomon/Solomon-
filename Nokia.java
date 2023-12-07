import java.util.Scanner;

public class Nokia{

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
			
		System.out.println("MENU");
		System.out.println("1. Phone Book (Select 1 to check phonebook: ");
		System.out.println("2. Messages (Select 2 to check Messages: ");
		System.out.println("3. Chat (Select 3 to check Chat: ");
		System.out.println("4. Call Register (Select 4 to check Register: ");
		System.out.println("5. Tones (Select 5 to check Tones: ");
		System.out.println("6. Settings (Select 6 to check Settings: ");
		System.out.println("7. Call Divert (Select 7 to check Call Divert: ");
		System.out.println("8. Games (Select 8 to check Games: ");
		System.out.println("9. Calculator (Select 9 to check Calculator: ");
		System.out.println("10. Reminders (Select 10 to check Reminders: ");
		System.out.println("11. Clock (Select 11 to check Clock: ");
		System.out.println("12. Profiles (Select 12 to check Profiles: ");
		System.out.println("13. SIM services (Select 12 to check SIM services: ");
		System.out.println("Select option 1 -13: ");
			int menu = input.nextInt();

				if (menu == 1) 
					System.out.println("PHONE BOOK");
					System.out.println("1. Search (Select 1 to check Search: ");
					System.out.println("2. Service number (Select 2 to see Service number: ");
					System.out.println("3. Add Name (Select 3 to Add Name: ");
					System.out.println("4. Erase (Select 4 to Erase : ");
					System.out.println("5. Edit (Select 5 to Edit: ");
					System.out.println("6. Assign tone (Select 6 to Assign tone: ");
					System.out.println("7. Send b'card (Select 7 to Send b'card: ");
					System.out.println("8. Options (Select 8 to select from Options: ");
					System.out.println("9. Speed dials (Select 9 to check Speed dials: ");
					System.out.println("10. Voice tags (Select 10 to check Voice tags: ");
					int phoneBook  = input.nextInt();
						if (phoneBook == 1) 
							System.out.println("Search");

						if (phoneBook == 2) 
							System.out.println("Service Nos");

						if (phoneBook == 3) 
							System.out.println("Add name");

						if (phoneBook == 4) 
							System.out.println("Erase");

						if (phoneBook == 5) 
							System.out.println("Edit");

						if (phoneBook == 6) 
							System.out.println("Assign tone");

						if (phoneBook == 7) 
							System.out.println("Send b'card");

						if (phoneBook == 8) {
							System.out.println("Options");
								System.out.println("1. Type of view");
								System.out.println("2. Memory Status");
								int options  = input.nextInt();
									if (options == 1) 
										System.out.println("Type of view");
									if (options == 2) 
										System.out.println("Memory Status");
								}

						if (phoneBook == 9) 
							System.out.println("Speed dials");

						if (phoneBook == 10) 
							System.out.println("Voice tags");
						else 
							System.out.println("choose again");
					

				if (menu == 2) 
					System.out.println("MESSAGES");
					System.out.println("1. Write messages(Select 1 to Write messages: ");
					System.out.println("2. Inbox (Select 2 to see Inbox: ");
					System.out.println("3. Outbox (Select 3 to check Outbox: ");
					System.out.println("4. Picture messages (Select 4 to see Picture messages : ");
					System.out.println("5. Templates (Select 5 to see Templates: ");
					System.out.println("6. Smileys (Select 6 for Smileys: ");
					System.out.println("7. Message settings (Select 7 for message settings: ");
					System.out.println("8. Info services (Select 8 for info services: ");
					System.out.println("9. Voice mailbox number (Select 9 for Voice mailbox number: ");
					System.out.println("10. Services Command editor (Select 10 for Services Command editor: ");
					int messages = input.nextInt();
						if (messages == 1) 
							System.out.println("Write messages");
						if (messages == 2) 
							System.out.println("Inbox");
						if (messages == 3) 
							System.out.println("Outbox");
						if (messages == 4) 
							System.out.println("Picture messages");
						if (messages == 5) 
							System.out.println("Templates");
						if (messages == 6) 
							System.out.println("Smileys");
						if (messages == 7) {
							System.out.println("Message settings");
							System.out.println("1. Set 1");
							System.out.println("2. Common");
								int messageSettings = input.nextInt();
									if (messageSettings == 1) {
										System.out.println("Message center number");
										System.out.println("Messages sent as");
										System.out.println("Message validity");
										}
									if (messageSettings == 2) {
										System.out.println("COMMON");
										System.out.println("Delivery reports");
										System.out.println("Reply via same centre");
										System.out.println("Character support");
										}
									
								}

																								
						if (messages == 8) 
							System.out.println("Info Services");
						if (messages == 9) 
							System.out.println("Voice mailbox number");
						if (messages == 10) 
							System.out.println("Service Command editor");
					

				if (menu == 3) 
					System.out.println("CHAT");
					int chat = input.nextInt();
						if (chat == 1)
							System.out.println("chat");
					
				if (menu == 4) 
					System.out.println("CALL REGISTER");
					System.out.println("1. Last Missed Calls (Select 1 to check Last Missed Calls: ");
					System.out.println("2. Received calls (Select 2 to see All  Received calls: ");
					System.out.println("3. Dialled numbers (Select 3 for Dialled numbers: ");
					System.out.println("4. Erase recent call lists (Select 4 to Erase recent call lists : ");
					System.out.println("5. Show call duration (Select 5 to Show call duration : ");
					System.out.println("6. Show Call cost (Select 6 to Show Call cost: ");
					System.out.println("7. Call cost settings (Select 7 for  Call cost settings: ");
					System.out.println("8. Prepaid Credit (Select 8 for Prepaid Credit: ");
					int callRegister = input.nextInt();
						if (callRegister == 1) 
							System.out.println("Missed Calls");
						if (callRegister == 2) 
							System.out.println("Recieved calls");
						if (callRegister == 3) 
							System.out.println("Dialled numbers");
						if (callRegister == 4) 
							System.out.println("Erase recent call lists");
						if (callRegister == 5) {
							System.out.println("show call duration");
								int showCall = input.nextInt();
									if (showCall == 1)
										System.out.println("last call duration");
										System.out.println("All call's duration");
										System.out.println("Received calls");
										System.out.println("Dialled calls duration");
										System.out.println("clear Timer");
										}
						if (callRegister == 6) {
							System.out.println("       Show call cost");
							System.out.println("1. Last call cost");
							System.out.println("1. All calls' cost");
							System.out.println("1. Clear counters");
							}


						if (callRegister == 7) {
							System.out.println("   Call cost settings");
							System.out.println("1. Call cost limits");
							System.out.println("2. Show costs in");
							int costSettings = input.nextInt();
									if (costSettings == 1)
										System.out.println("Call cost limit");
									if (costSettings == 2)
										System.out.println("Show costs in");
									
								}

																								
						if (callRegister == 8) {
							System.out.println("Prepaid Credit");
					




				if (menu == 5) 
					System.out.println("TONES");
					System.out.println("1. Ringing tones (Select 1 to check Ringing tones: ");
					System.out.println("2. Ringing Volume (Select 2 to see Ringing Volume: ");
					System.out.println("3. Incoming call alert (Select 3 for Incoming call alert: ");
					System.out.println("4. Composer (Select 4 for Composer : ");
					System.out.println("5. Message Alert tone (Select 5 for Message Alert tone: ");
					System.out.println("6. Keypad tones (Select 6 for  Keypad tones: ");
					System.out.println("7. Warning and game tones (Select 7 for Warning and game tones: ");
					System.out.println("8. Vibrating alert (Select 8 for Vibrating alert: ");
					System.out.println("9. Screen saver(Select 9 for Screen saver: ");
					int tones = input.nextInt();
						if (tones == 1) 
							System.out.println("Ringing tones");

						if (tones == 2) 
							System.out.println("Ringing Volume");

						if (tones == 3) 
							System.out.println("Incoming call alert");

						if (tones == 4) 
							System.out.println("Composer");

						if (tones == 5) 
							System.out.println("Message Alert tone");

						if (tones == 6) 
							System.out.println("Keypad tones");

						if (tones == 7) 
							System.out.println("Warning and game tones ");

						if (tones == 8) 
							System.out.println("Vibrating alert");

						if (tones == 9) 
							System.out.println("Screen saver");
					


				if (menu == 6)
					System.out.println("SETTINGS");
					System.out.println("1. Call settings (Select 1 to check Call settings: ");
					System.out.println("2. Phone settings (Select 2 to see Phone settings: ");
					System.out.println("3. Security Settings (Select 3 for Security Settings: ");
					System.out.println("4. Restore factory settings (Select 4 to Restore factory settings: ");
					int settings = input.nextInt();
						if (settings == 1) {
							System.out.println("Call settings");
								System.out.println("1. Automatic redial ");
								System.out.println("2. Speed dialling ");
								System.out.println("3. Call waitng options: ");
								System.out.println("4. Own number sending: ");
								System.out.println("5. Phone line in use: ");
								System.out.println("6. Automatic answer: ");
								}
						if (settings == 2){ 
							System.out.println("Phone settings");
								System.out.println("1.Language: ");
								System.out.println("2. Cell info display: ");
								System.out.println("3. Welcome note ");
								System.out.println("4. Network selections ");
								System.out.println("5. lights");
								System.out.println("6. Confirm Sim service actions ");
								}
						if (settings == 3) {
							System.out.println("Security Settings");
								System.out.println("1. PIN code request");
								System.out.println("2. Call barring service");
								System.out.println("3.Fixed dialling");
								System.out.println("4. Closed user group ");
								System.out.println("5. Phone security ");
								System.out.println("6. Change access codes");
								}
						if (settings == 4) 
							System.out.println("Restore factory settings");

					


				if (menu == 7)
					System.out.println("CALL DIVERT");
					int callDivert = input.nextInt();
						if (callDivert == 1) 
							System.out.println("Call divert");


				if (menu == 8)
					System.out.println("GAMES");
					int games = input.nextInt();
						if (callDivert == 1) 
							System.out.println("Games");

				if (menu == 9)
					System.out.println("CALCULATOR");
					int calculator = input.nextInt();
						if (calculator == 1) 
							System.out.println("Calculator");



				if (menu == 10)
					System.out.println("REMINDERS");
					int reminders = input.nextInt();
						if (reminders == 1) 
							System.out.println("reminders");


				if (menu == 11)
					System.out.println("CLOCK");
					System.out.println("1. Alarm Clock (Select 1 to check Alarm Clock: ");
					System.out.println("2. Clock settings (Select 2 to see Clock settings: ");
					System.out.println("3. Date settings (Select 3 to Date settings: ");
					System.out.println("4. Stop Watch (Select 4 to Stop Watch : ");
					System.out.println("5. Count down timer (Select 5 for Count down timer: ");
					System.out.println("6. Auto update of date and time (Select 6 for Auto update of date and time: ");
					int clock = input.nextInt();
						if (clock == 1) 
							System.out.println("Alarm Clock");

						if (clock == 2) 
							System.out.println("Clock settings");

						if (clock == 3) 
							System.out.println("Date settings");

						if (clock == 4) 
							System.out.println("Stop Watch");

						if (clock == 5) 
							System.out.println("Count down timer");

						if (clock == 6) 
							System.out.println("Auto update of date and time");
					




				if (menu == 12)
					System.out.println("PROFILES");
					int profiles = input.nextInt();
						if (profiles == 1) 
							System.out.println("Profiles");
					

				if (menu == 13)
					System.out.println("SIM SERVICES");
					int simServices = input.nextInt();
						if (simServices == 1) 
							System.out.println("sim services");
					



	}



}

}


