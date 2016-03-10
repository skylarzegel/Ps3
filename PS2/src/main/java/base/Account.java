package base;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = dateCreated;

	}

	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		double monthlyInterest = (getAnnualInterestRate() / 12);
		return monthlyInterest;
	}

	public double withdraw(double wAmount) throws InsufficientFundsException {
		double nBalance = this.getBalance();
		if (nBalance - wAmount >= 0) {
			this.balance = nBalance - wAmount;
		} else {
			throw new InsufficientFundsException();
		}
		return this.balance;
	}

	public double deposit(double dAmount) {
		double nBalance = this.getBalance();
		this.balance = nBalance + dAmount;
		return this.balance;
	}
}
