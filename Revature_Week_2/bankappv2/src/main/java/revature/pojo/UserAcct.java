/*********************************************************************** 
Program Name: Bank App v2
Author: Antonio Marrero Bonilla
Contributors: Zachary Vaughn, Dennis Park
Company: Revature
Week Iteration: Week 2
Program Description: Bank application where the user can register,
login and perform transactions with their money such as: deposit,
withdrawals, and check balances. Requirements for users to register
are to provide a username and password. 
***********************************************************************/

package revature.pojo;

import java.text.DecimalFormat;

public class UserAcct {
	
	// private variables for Account Class
	private int user_acct_id;
	private double balance;
	
	// Account Constructors
	public UserAcct(){
		
	}
	
	public UserAcct(int user_acct_id, double balance) {
		super();
		this.user_acct_id = user_acct_id;
		this.balance = balance;
	}

	
	// Getters and Setters
	public int  getuser_acct_id() {
		return user_acct_id;
	}

	public void setAcctId(int user_acct_id) {
		this.user_acct_id = user_acct_id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + user_acct_id;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAcct other = (UserAcct) obj;
		if (user_acct_id != other.user_acct_id)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	// toString() method to get the user accountId and balance as a decimal.
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#0.00");
		return user_acct_id + " $" + format.format(balance);
	}
	
	
	

}
