package mapping.onetoOne.OTOmapdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	ProfileRepo profileRepo;

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	public User createUser(User user) {
		// this for loop only for the  one to many
        // Set the user reference in each profile
      

		return userRepo.save(user);
	}

	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElse(null);
	}

	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);

	}
	
	
	
    public List<Profile> getProfilesByUserId(Long userId) {
        return userRepo.findProfileByUserId(userId);
    }
	
	
	
	

}
