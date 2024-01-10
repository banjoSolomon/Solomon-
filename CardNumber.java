import java.util.Scanner;
import java.util.Arrays;
public class CardNumber{
	public static void main(String[] args){
	CreditCard creditCard = new CreditCard();
	Scanner input = new Scanner(System.in);

	System.out.println("Enter Your Credit Card Number: ");
	String creditCardNumber = input.nextLine();

	while(creditCardNumber.length() < 13 || creditCardNumber.length() > 16){
	System.out.println("Enter Your Credit Card Number");
	 creditCardNumber = input.nextLine();
        }
	
	creditCard.setCreditCardNumber(creditCardNumber);
	creditCard.getCreditCardNumber();

	int cardLength = creditCard.lengthOfCard();
	long[] cardNumber = creditCard.creditCardLongNumberArray();
	String card = creditCard.typeOfCard(cardNumber);

	long evenNumber = creditCard.longEvenNumbers(cardNumber);
	long oddNumber = creditCard.longOddNumbers(cardNumber);

	String validNumber = creditCard.creditCardValidity(evenNumber,oddNumber);
	

	System.out.println("***********************************************");
	System.out.println("**Credit Card Type: " + card);
	System.out.println("**Credit Card Number: " + creditCard.getCreditCardNumber());
	System.out.println("**Credit Card Digit Length: " + cardLength);
	System.out.println("**Credit Card Validity Status: " + validNumber);
	System.out.println("*************************************************");
	
 }


}