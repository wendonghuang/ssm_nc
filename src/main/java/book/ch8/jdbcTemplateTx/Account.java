package book.ch8.jdbcTemplateTx;

import java.io.Serializable;

public class Account implements Serializable{
	private int id;
	private String username;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", balance=" + balance + "]";
	}
	public Account(int id, String username, double balance) {
		super();
		this.id = id;
		this.username = username;
		this.balance = balance;
	}
	public Account() {
		super();
	}



}
