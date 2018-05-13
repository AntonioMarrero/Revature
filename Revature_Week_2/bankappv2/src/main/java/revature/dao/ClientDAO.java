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

import java.util.ArrayList;
import revature.pojo.Client;

public interface ClientDAO {
	
	public ArrayList<Client> getAllClient();
	public boolean addClient(String[] newClient);
	public Client getClientById(int id);
	public boolean updateClient(Client newName);
	public Client loginByUserName(String un, String pw);

}
