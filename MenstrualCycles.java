import java.util.*;
public class MenstrualCycles {

    private static final Scanner input = new Scanner(System.in);
    private static final int DAYS_IN_CYCLE  = 35;
    public static void main(String[] args){
        myMenu();

    }

    public static void myMenu(){
        String name = getName();

        int dateOfBirth = getDateOfBirth();
        int age = getValidAge();
        int cycleLength = getValidCycleLength();

        displayMensturalInfo(name, age, cycleLength);
        int date = getValidDate();
        calculateAndDisplayResults(cycleLength, date);

    }

    private static String getName(){
        System.out.print("What is your name: ");
        String name = input.nextLine();
        return name;

    }

    private static int getDateOfBirth(){
        System.out.print("Enter your date of birth: ");
        int dateOfBirth = input.nextInt();
        return dateOfBirth;
    }

    private static int getValidAge(){
        System.out.print("How old are you: ");
        int age = input.nextInt();
        while(age < 0 || age > 100){
            System.out.print("Invalid age. Please enter a valid age: ");
            age = input.nextInt();

        }
        return age;

    }

    private static int getValidCycleLength(){
        System.out.print("Enter the length of your menstrual cycle: ");
        int cycleLength = input. nextInt();

        while(cycleLength < 0 || cycleLength > 50){
            System.out.print("Invalid cycle length. Please enter a valid cycle length: ");
            cycleLength = input. nextInt();
        }
        return cycleLength;
    }

    private static void displayMensturalInfo(String name, int age, int cycleLength){
        System.out.println("*****************************");
        System.out.println("*Menstrual Information: ");
        System.out.println("*Name: " + name);
        System.out.println("*Age: " + age);
        System.out.println("*Menstrual Cycle Length: " + cycleLength);
        System.out.println("*******************************");
    }

    private static int getValidDate(){
        System.out.print("What date did you see your period: ");
        int date = input.nextInt();
        return date;

    }

    private static void calculateAndDisplayResults(int cycleLength, int date){
        int dayOfYourPeriod = date + cycleLength;
        int ovulationDay = dayOfYourPeriod - DAYS_IN_CYCLE ;
        int safePeriod =  ovulationDay - 14;
        int notSafePeriod = dayOfYourPeriod - 11;


        System.out.printf("The day you should be expecting your next period is in %d%ndays%n", dayOfYourPeriod);
        System.out.printf("You are likely to ovulate around the day %d of your cycle%n", ovulationDay);
        System.out.printf("Your safe period should be  around the day%d%n",safePeriod);
        System.out.printf("Your unsafe period should be around the day %d%n",notSafePeriod);



    }


