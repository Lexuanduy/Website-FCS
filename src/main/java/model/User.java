package model;

import java.util.Date;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class User {

	@Id
	private String id;
	@Index
	private String fullName;
	private Date birthDay;
	private String emai;
	private String passWord;
	private String securityCode;
	private String presenterName;
	private String presenterLink;
	
	public User() {
	}

	public User(String id, String fullName, Date birthDay, String emai, String passWord, String securityCode,
			String presenterName, String presenterLink) {
		this.id = id;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.emai = emai;
		this.passWord = passWord;
		this.securityCode = securityCode;
		this.presenterName = presenterName;
		this.presenterLink = presenterLink;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getPresenterName() {
		return presenterName;
	}

	public void setPresenterName(String presenterName) {
		this.presenterName = presenterName;
	}

	public String getPresenterLink() {
		return presenterLink;
	}

	public void setPresenterLink(String presenterLink) {
		this.presenterLink = presenterLink;
	}
}
