package javaconfig.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	private sortAlgorithm sortAlgorithm;
	
	public boolean binarySearch(int[] numbers, int target) {
		
		System.out.println(sortAlgorithm);
		
		return true;
		
	}

}
