package boot.assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import boot.assignment.models.Dennis;

public interface DennisRepository extends JpaRepository<Dennis, Long>{
	
	public Dennis findDennisByCraziness(String craziness);
	public Dennis findDennisByAge(Long age);
	

}
