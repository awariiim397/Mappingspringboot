package mapping.onetoOne.OTOmapdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProfileRepo extends JpaRepository<Profile, Long> {

}
