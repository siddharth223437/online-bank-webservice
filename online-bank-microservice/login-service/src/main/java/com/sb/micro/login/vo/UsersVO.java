package com.sb.micro.login.vo;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UsersVO
{
	@Id
	int userId;
	String firstName,lastName,mobileNumber,createdBy;
	Time lastUpdated;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Time getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Time lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
}
