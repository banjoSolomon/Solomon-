public class CreditCard{

private String creditCardNumber;

	public void setCreditCardNumber(String creditCardNumber){
	this.creditCardNumber = creditCardNumber;

  }
	public String getCreditCardNumber(){
		return creditCardNumber;
       }
	public long[] creditCardLongNumberArray(){
	long creditCardLong = Long.parseLong(creditCardNumber);

	long[] creditCards = new long[creditCardNumber.length()];
 	int index = creditCardNumber.length()-1;

	for(int i = 0; i < creditCardNumber.length(); i++){
	creditCards[index] = creditCardLong %10;
	
	creditCardLong = creditCardLong /10;
	index--;
       }

	return creditCards;
    }
	public long longEvenNumbers(long[] creditCardLongNumberArray){
	int index = creditCardLongNumberArray.length-2;
	long total = 0;
	for(; index >= 0; index -=2){
	long doubleNumber = creditCardLongNumberArray[index] * 2;
		if(doubleNumber > 9){
		doubleNumber = (doubleNumber % 10) + 1;
                }
		total += doubleNumber;
         }
		return total;
	
      }
	
	public long longOddNumbers(long[] creditCardLongNumberArray){
	int index = creditCardLongNumberArray.length-1;
	long total = 0;
	for(; index >= 0; index -= 2){ 
	total += creditCardLongNumberArray[index];
        }
		return total;
    }
	public String creditCardValidity( long total1, long total2){
	long sumTotal = total1 + total2;
	String validityStatus = "INVALID";

	if(sumTotal %10 == 0){
	validityStatus = "Valid";
        }
		return validityStatus;
     }
	public int lengthOfCard(){
	int lengthOfCard = creditCardNumber.length();
		return lengthOfCard;
       }

	public String typeOfCard(long[] creditCard){
	String cardType = "INVALID CARD";
	if(creditCard[0] == 4) cardType = "Visa Cards";
	if(creditCard[0] == 5) cardType = "Master Card";
	if(creditCard[0] == 6) cardType = "Discover Cards";
	if(creditCard[0] == 3 && creditCard[1] == 7) cardType = "American Express";
	return cardType;
     }
	

}