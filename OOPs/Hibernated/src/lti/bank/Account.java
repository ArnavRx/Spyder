package lti.bank;

import java.util.HashSet;
import java.util.Set;

public class Account {
	private double amount;
	private int accno;
	private String name;
	private Set<Transaction> transaction = new HashSet<Transaction>();
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int id) {
		this.accno = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
