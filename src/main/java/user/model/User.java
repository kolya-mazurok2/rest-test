package user.model;

import org.springframework.data.annotation.Id;


public class User {

    @Id
    public String id;
    
    private String login, firstName, lastName, email, password;

    public User() {}

    public User(String login, String firstName, String lastName, String email, String password) {
        this.login = login;
    	this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, login='%s', firstName='%s', lastName='%s', email='%s', password='%s']",
                id, login, firstName, lastName, email, password);
    }
    
    public String getId() {
    	return id;
    }
    
    public void setId(String id) {
    	this.id = id;
    }

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}