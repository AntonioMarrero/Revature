package javaconfig.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("insertion")
public class BubbleSortAlgorithm implements sortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		
		return null;
	}

}
