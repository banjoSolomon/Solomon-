import java.util.*;
public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contact> contactsList = new ArrayList<>();
        Contact contact1 = new Contact("Dayo", "08145783126", "TemiDayo@gmail.com", "24 Sabo Yaba Lagos");
        Contact contact2 = new Contact("Ken", "09036785489", "KenDon@Gmail.com", "7 Adebare Street Lagos");
        Contact contact3 = new Contact("Solomon", "08164556912", "Ayomidebanjo02@gmail.com", "21 Ogudu road Lagos");
        Contact contact4 = new Contact("Kelly", "08145457812", "Kellytem@gmail.com", "12 Gbagada lagos");
        Contact contact5 = new Contact("Mr Chibuzor", "09065790643", "IAM@gmail.com", "15 lasa Lagos");

        contactsList.add(contact1);
        contactsList.add(contact2);
        contactsList.add(contact3);
        contactsList.add(contact4);
        contactsList.add(contact5);
        System.out.print("Welcome to your PHONE BOOK. Enter YES to view your PHONEBOOK: ");
        String option = input.nextLine();
        while (!option.equalsIgnoreCase("Yes")) {
            System.out.print("INVALID INPUT.please enter YES to view your PHONEBOOK: ");
            option = input.nextLine();
        }

        System.out.println("These are your PHONEBOOK LIST: ");
        for (Contact contact : contactsList) {
            System.out.println("-----------------------------");
            System.out.println("Name: " + contact.getName());
            System.out.println("Number: " + contact.getNumber());
            System.out.println("Address: " + contact.getAddress());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("-----------------------------");


        }
        String addMore = "YES";
        while(addMore.equalsIgnoreCase("YES")){
            System.out.print("Would you like to add another contact?(YES/NO): ");
            addMore = input.nextLine();

            if(addMore.equalsIgnoreCase("YES")){
                System.out.print("Enter name: ");
                String name = input.nextLine();

                System.out.print("Enter phone number: ");
                String  number = input.nextLine();

                System.out.print("Enter Address: ");
                String address = input.nextLine();

                System.out.print("Enter Email: ");
                String email = input.nextLine();
                Contact myContact = new Contact(name,number,address,email);
                contactsList.add(myContact);

                System.out.println("Your New  PHONEBOOK LIST: ");
                for (Contact contact : contactsList) {
                    System.out.println("-----------------------------");
                    System.out.println("Name: " + contact.getName());
                    System.out.println("Number: " + contact.getNumber());
                    System.out.println("Address: " + contact.getAddress());
                    System.out.println("Email: " + contact.getEmail());
                    System.out.println("-----------------------------");
                }
                }else if(addMore.equalsIgnoreCase("NO")){
                System.out.println("Thank you for using the PHONEBOOK");
                break;
            }else{
                System.out.print("INVALID input. please enter YES or No.");
            }

        }
    }
