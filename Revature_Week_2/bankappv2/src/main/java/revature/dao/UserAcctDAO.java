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

package revature.dao;

import revature.pojo.UserAcct;

public interface UserAcctDAO {
	
	// Interface methods to be used by the UserAcctDAOImp class.
	public UserAcct getBalanceById(int id);
	
	public UserAcct updateBalance(UserAcct newBalance);
	
	
}
