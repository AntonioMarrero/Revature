package javaconfig.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class InsertionSortAlgorithm implements sortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		
		return numbers;
	}

}
