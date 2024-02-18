package BankApp;

import Bank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp(){
        account = new Account("Banjo Solomon");

    }

    @Test
    public void testTheNameOfTheAccount(){
        assertEquals("Banjo Solomon", account.getName());

    }
    @Test
    public void testToCheckBalance(){
        int initialBalance = 10_000;
        account.deposit(initialBalance);

        assertEquals(initialBalance,account.getBalance());
    }
    @Test
    public void testAccountPin(){
        String expectedPin = "4321";
        account.setPin(expectedPin);
        String actualPin = account.getPin();

        assertEquals(expectedPin, actualPin);

    }

    @Test
    public void testAccountNumber(){
        Account checkAccount = new Account("checkAccount");
        int accountNumber = checkAccount.getAccountNumber();

        assertNotEquals(0,accountNumber);

    }
    @Test
    public void testAccountCanDeposit(){
        Account myAccount = new Account("myAccount");
        int initialBalance = myAccount.getBalance();
        int depositAmount = 5000;
        myAccount.deposit(depositAmount);

        int expectedBalance = initialBalance + depositAmount;
        assertEquals(expectedBalance,myAccount.getBalance());


    }
    @Test
    public void testAccountCanWithdraw(){
        Account  myAccount = new Account("myAccount");
        int initialBalance = 10000;
        myAccount.deposit(initialBalance);
        int withdrawalAmount = 500;
        myAccount.withdraw(withdrawalAmount);

        int expectedBalance = initialBalance - withdrawalAmount;
        assertEquals(expectedBalance,myAccount.getBalance());


    }
    @Test
    public void testToCheckAccountBalance(){
        int initialBalance = 10_000;
        account.deposit(initialBalance);
        assertEquals(initialBalance,account.getBalance());

    }
    @Test
    public void testInvalidWithdrawalAmount(){
        assertThrows(IllegalArgumentException.class, () ->account.withdraw(-500));

        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0));

        assertThrows(IllegalArgumentException.class, () -> account.withdraw(Integer.parseInt("egf")));
    }



}
