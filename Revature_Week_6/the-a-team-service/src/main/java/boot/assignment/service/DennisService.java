package boot.assignment.service;

import java.util.List;

import boot.assignment.models.Dennis;


public interface DennisService {
	public Dennis addDennis(Dennis newDennis);
	public List<Dennis> findAllDenniss();
	public Dennis findDennisById(Long id);
	public Dennis findDennisByCraziness(String craziness);
	public Dennis findDennisByAge(Long age);
	public Dennis updateDennisById(Dennis d);
	public void deleteDennisById(Long id);
	
}
