package com.sb.micro.login.vo;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class UsersVO
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int userId;
	String firstName,lastName,mobileNumber,createdBy;
	boolean isAvailable;
	@UpdateTimestamp
	LocalDateTime lastUpdated;
	@OneToMany (mappedBy="userVO")
	private List<AddressVO> addressVO; 

	public List<AddressVO> getAddressVO() {
		return addressVO;
	}
	public void setAddressVO(List<AddressVO> addressVO) {
		this.addressVO = addressVO;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
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
}
