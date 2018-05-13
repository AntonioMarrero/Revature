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

// This class holds the clients information
// it has the constructors, getters and setters
public class Client {

	
	private int acctId;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	
	// Array that holds the clients information
	//ArrayList<String> clientList = new ArrayList<String>();
	
	// Constructors
	public Client() {
		
	}
	
	public Client(String userName, String firstName, String lastName, String password, 
			int acctId) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		//this.clientList = clientList;
		this.acctId = acctId;
	}
	
//	// Getter and Setters for my variables
//	public int getUserId() {
//		return acctId;
//	}

	public int getAcctId() {
		return acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

//	public void setUserId(int userId) {
//		this.acctId = userId;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + acctId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		Client other = (Client) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (acctId != other.acctId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	// override toString() method for my variables
	@Override
	public String toString() {
		return  acctId + userName + firstName + lastName + password;
	}


	
}
