package bootdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bootdemo.models.User;
import bootdemo.repositories.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User addUser(User newUser) {
		
		for(User user : findAllUsers()) {
			
			if(user.getUsername().equals(newUser.getUsername())) {
				return null;
			}
			
			if(user.getEmail().equals(newUser.getEmail())) {
				return null;
			}
		}
		
		return userRepo.save(newUser);
	}

	@Override
	public List<User> findAllUsers() {
		return userRepo.findAll();
	}
	
	@Override
	public User findUserById(Long id) {
		return userRepo.getOne(id);
	}

	@Override
	public User findUserByUsername(String username) {
		return userRepo.findUserByUsername(username);
	}

	@Override
	public User findUserByEmail(String email) {
		return userRepo.findUserByEmail(email);
	}

	@Override
	public User updateUserById(User u) {
		return userRepo.save(u);
	}

	@Override
	public User loginUser(User u) {
		return userRepo.findUserByUsernameAndPassword(u.getUsername(), u.getPassword());
	}

}
