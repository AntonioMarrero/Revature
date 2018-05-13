package bootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bootdemo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findUserByUsername(String username);
	public User findUserByEmail(String email);
	public User findUserByUsernameAndPassword(String username, String password);
	
	/*@Modifying
	@Query("UPDATE User u SET u = :updatedUser WHERE u.userId = :userId")
	public int updateUserById(@Param("userId") Long userId, @Param("updatedUser") User updatedUser);*/

}
