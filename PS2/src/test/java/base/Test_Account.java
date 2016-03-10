package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_Account {
	
	Account testAccount;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		testAccount = new Account(1122,20000);
		testAccount.setAnnualInterestRate(.045);
		testAccount.getDateCreated();
	}

	@After
	public void tearDown() throws Exception {
		testAccount = null;
	}

	@Test
	public void testAccount() {
		Account a = new Account();
		assertEquals(a.getId(), 0);
		assertTrue(a.getBalance() == 0);
		assertTrue(a.getAnnualInterestRate() == 0);
		assertFalse(a.getBalance() == 1);
		assertFalse(a.getAnnualInterestRate() == 1);
		
		a.setBalance(45);
		a.setId(23);
		a.setAnnualInterestRate(.08);
		
	}
	@Test 
	public void testAccountArgTwo() throws InsufficientFundsException{
		assertEquals(testAccount.getId(), 1122);
		assertTrue(testAccount.getBalance() == 20000);
		assertTrue(testAccount.getAnnualInterestRate() == .045);
		
		testAccount.withdraw(2500);
		testAccount.deposit(3000);
		assertTrue(testAccount.getBalance() == 20500);
		System.out.println("The balance is $"+testAccount.getBalance()+ ", the monthly interest is"+testAccount.getMonthlyInterestRate()+
				", the day the account was created is "+testAccount.getDateCreated());
	}

}
