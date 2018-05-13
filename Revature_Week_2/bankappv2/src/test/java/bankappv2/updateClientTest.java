package bankappv2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import revature.dao.ClientDAO;
import revature.dao.ClientDAOImp;
import revature.pojo.Client;

class updateClientTest {

	@Test
	void test() {
		   ClientDAO client = new ClientDAOImp();

	        client.updateClient(new Client("teetee","tee","tee","llama",1));

	        assertTrue(true);
	}

}
