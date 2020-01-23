package a.Package;

public class aBean {

	private String usernameA = "Penny", passwordA = "Penny12";
	private String usernameB = "Test", passwordB = "Test12";

	private String inUsername;
	private String inPassword;


	/* Compare Username and password */
	public String getName() {
		if (inPassword.contentEquals(passwordA) && (inUsername.contentEquals(usernameA))) {
			return UserA.getFirstName();
		}

		else if (inPassword.contentEquals(passwordB) && (inUsername.contentEquals(usernameB))) {
			return UserB.getFirstName();
		}
		return "";
	}

	public void setName(String name) {
		this.usernameA = name;
	}

	public String getPassword() {
		return passwordA;
	}

	public void setPassword(String password) {
		this.passwordA = password;
	}

	public String getNameb() {
		if (inPassword.contentEquals(passwordB) || (inUsername.contentEquals(usernameB))) {
			return "nameb";
		}

		return "";
	}

	public boolean validate() {
		if (inPassword.contentEquals(passwordA) && (inUsername.contentEquals(usernameA))
				|| (inPassword.contentEquals(passwordB)) && (inUsername.contentEquals(usernameB))) {
			return true;
		} else {
			return false;
		}
	}

	public void setNameb(String name) {
		this.usernameB = name;
	}

	public String getPasswordb() {
		return passwordB;
	}

	public void setPasswordb(String password) {
		this.passwordB = password;
	}

	public String getInPassword() {
		return inPassword;
	}

	public void setInPassword(String inPassword) {
		this.inPassword = inPassword;
	}

	public String getInUsername() {
		return inUsername;
	}

	public void setInUsername(String inUsername) {
		this.inUsername = inUsername;
	}
	
	
	public String getImg() {
		if (inPassword.contentEquals(passwordA) && (inUsername.contentEquals(usernameA))) {
			return "wolf";
		}

		else if (inPassword.contentEquals(passwordB) && (inUsername.contentEquals(usernameB))) {
			return "giraffe";
		}
		return "";
	}
	

}
