package mapping.onetoOne.OTOmapdemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo  extends JpaRepository<User, Long>{

	 @Query("SELECT p FROM Profile p WHERE p.user.id = :userId")
	    List<Profile> findProfileByUserId(@Param("userId") Long userId);
	 
	 
	
	
}
