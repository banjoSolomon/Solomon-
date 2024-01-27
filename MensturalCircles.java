import java.util.*;


public class MensturalCircles {


    public static void main(String[] args) {
        myMenu();
    }

    public static void myMenu(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.next();

        System.out.print("What is your date of birth: ");
        int dateOfBirth = input.nextInt();
        input.nextLine();

        System.out.print("How old are you: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Is your menstrual cycle regular? Yes or No : ");
        String firstOption = input.next();
        input.nextLine();


        if(firstOption.equalsIgnoreCase("Yes")){
            System.out.print("You are in a good state");
            input.nextLine();
        }
        else if(firstOption.equalsIgnoreCase("No")){
            System.out.print("Your menstrual cycle is not regular seek help!!");
            input.nextLine();
        }

        else{
            System.out.print("INVALID INPUT!!");
        }

        System.out.print("Does your period start unexpectedly? Yes or No?: ");
        String secondOption = input.next();
        input.nextLine();

        if(secondOption.equalsIgnoreCase("Yes")){
            System.out.print("We can recommend a medication for you");
            input.nextLine();
        }
        else if(secondOption.equalsIgnoreCase("No")){
           System.out.print("You are good");
           input.nextLine();

        }
        System.out.print("Have you ever experienced menstrual cramps? Yes or No: ");
        String thirdOption = input.next();
        input.nextLine();
        if(thirdOption.equalsIgnoreCase("Yes")){
            System.out.print("It is normal to have cramps during your period");
            input.nextLine();
        }
        if(thirdOption.equalsIgnoreCase("No")){
            System.out.print("You have a serious problem");
            input.nextLine();
        }

        System.out.print("What date did u see your period: ");
        int date = input.nextInt();
            int dayOfYourPeriod = date + 28;
            System.out.printf("The day u should be expecting your next period is %d%n",dayOfYourPeriod);









        }

}
