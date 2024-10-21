package mapping.onetoOne.OTOmapdemo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String Username;
	
	 // Many-to-many mapping with Profile
    @ManyToMany
    @JoinTable(
        name = "user_profile", // Name of the join table
        joinColumns = @JoinColumn(name = "user_id"), // Foreign key for User
        inverseJoinColumns = @JoinColumn(name = "profile_id") // Foreign key for Profile
    )
    private List<Profile> profiles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}
	
	
	/*
	 * // one to many ( i.e one user with multiple profiles)
	 
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval = true)
	private List<Profile> profiles;

	// Getter nad Setter methods
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}
*/
	/************
	 * one to One Mapping // relation mapping for profile
	 * 
	 * @OneToOne(cascade = CascadeType.ALL) // it gives more info about forign key
	 * @JoinColumn(name = "profile_id", referencedColumnName = "id") private Profile
	 *                  profile;
	 * 
	 *                  public Long getId() { return id; }
	 * 
	 *                  public void setId(Long id) { this.id = id; }
	 * 
	 *                  public String getUsername() { return Username; }
	 * 
	 *                  public void setUsername(String username) { Username =
	 *                  username; }
	 * 
	 *                  public Profile getProfile() { return profile; }
	 * 
	 *                  public void setProfile(Profile profile) { this.profile =
	 *                  profile; }
	 */

}
