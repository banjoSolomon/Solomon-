package BankApp;

import Bank.Account;
import Bank.MyBank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BankAppTest {
    private Account accountSending;
    private Account  accountReceiving;
    private MyBank bank;
    private Account account;


    @BeforeEach
    public void setUp(){
        bank = new MyBank();
        account = new Account("Account1");
        accountSending = new Account("AccountSending");
        accountReceiving = new Account("AccountReceiving");
        bank.addAccount(account);
        bank.addAccount(accountSending);
        bank.addAccount(accountReceiving);

    }

    @Test
    public  void testThatBankApp_HasAName(){
        String expectedName = "MyBank";
        bank.setName(expectedName);
        String actualName = bank.getName();
        assertEquals(expectedName, actualName);


    }
    @Test
    public void testAccountsIsInAList(){
        account = new Account("Account1");
        bank.addAccount(account);
        List<Account> accounts = bank.getAccounts();
        assertTrue(accounts.contains(account));


    }

    @Test
    public void testAccountBalanceIsZero(){
        assertEquals(0.0, account.getBalance());

    }

    @Test
    public void testThatBankCanDeposit(){
        int initialBalance = account.getBalance();
        int depositAmount = 10_000;
        bank.deposit(account,depositAmount);

        int expectedBalance = initialBalance  + depositAmount;
        assertEquals(expectedBalance,account.getBalance());


    }
    @Test
    public void testBankCanTransfer(){
        int initialSenderBalance = accountSending.getBalance();
        int initialReceiverBalance = accountReceiving.getBalance();

        int transferAmount =Math.min(500, initialSenderBalance);
        bank.transfer(accountSending, accountReceiving, transferAmount);

        int expectedSenderBalance = initialSenderBalance - transferAmount;
        int expectedReceiverBalance = initialReceiverBalance + transferAmount;
        assertEquals(expectedSenderBalance, accountSending.getBalance());
        assertEquals(expectedReceiverBalance, accountReceiving.getBalance());


    }
    @Test
    public void testCheckBalance(){
        int initialBalance = 10_000;
        account.deposit(initialBalance);
        assertEquals(initialBalance,account.getBalance());


    }
    @Test
    public void testRegisterCustomer(){
        String firstName = "Sam";
        String lastName = "Thomas";
        bank.registerCustomer(firstName,lastName);

        assertEquals(1, bank.getCustomerCount());


    }
    @Test
    public void testRemoveAccount(){
        Account solomonAccount = new Account("SolomonAccount");
        bank.addAccount(solomonAccount);
        bank.removeAccount(solomonAccount);

        List<Account> accounts = bank.getAccounts();
        assertFalse(accounts.contains(solomonAccount));


    }
    @Test
    public void testToFindAccount(){
        Account kimAccount = new Account("KimAccount");
        bank.addAccount(kimAccount);
        Account foundAccount = bank.findAccount(kimAccount.getName());

        assertNotNull(foundAccount);
        assertEquals(kimAccount,foundAccount);

    }
    @Test
    public void testForWithdraw(){
        Account myAccount = new Account("myAccount");
        int initialBalance = 10000;
        myAccount.deposit(initialBalance);
        bank.addAccount(myAccount);

        int withdrawalAmount = 500;
        bank.withdraw(myAccount,withdrawalAmount);

        int expectedBalance = initialBalance - withdrawalAmount;
        assertEquals(expectedBalance, myAccount.getBalance());



    }


}
