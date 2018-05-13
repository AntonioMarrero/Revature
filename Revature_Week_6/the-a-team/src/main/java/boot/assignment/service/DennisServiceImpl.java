package boot.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boot.assignment.models.Dennis;
import boot.assignment.repositories.DennisRepository;

@Service
@Transactional
public class DennisServiceImpl implements DennisService{

	@Autowired
	DennisRepository dennisRepo;
	
	@Override
	public Dennis addDennis(Dennis newDennis) {
		return dennisRepo.save(newDennis);
	}

	@Override
	public List<Dennis> findAllDenniss() {
		return dennisRepo.findAll();
	}

	@Override
	public Dennis findDennisById(Long id) {
		return dennisRepo.getOne(id);
	}

	@Override
	public Dennis findDennisByAge(Long age) {
		return dennisRepo.findDennisByAge(age);
	}

	@Override
	public Dennis updateDennisById(Dennis d) {
		return dennisRepo.save(d);
	}

	@Override
	public Dennis findDennisByCraziness(String craziness) {
		return dennisRepo.findDennisByCraziness(craziness);
	}

	@Override
	public void deleteDennisById(Dennis d) {
		dennisRepo.delete(d);
		return;
	}
	

}
