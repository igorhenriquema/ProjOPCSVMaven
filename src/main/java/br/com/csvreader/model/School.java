package br.com.csvreader.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="school_spring")
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	private String SchoolCode;
	private String SchoolName;
	private String Address;
	private String City;
	private String StateCode;
	private String ZipCode;
	private String Province;
	private String Country;
	private String PostalCode;
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getSchoolCode() {
		return SchoolCode;
	}
	
	public void setSchoolCode(String SchoolCode) {
		this.SchoolCode = SchoolCode;
	}
	
	public String getSchoolName() {
		return SchoolName;
	}
	
	public void setSchoolName(String SchoolName) {
		this.SchoolName = SchoolName;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getCity() {
		return City;
	}
	
	public void setCity(String City) {
		this.City = City;
	}
	
	public String getStateCode() {
		return StateCode;
	}
	
	public void setStateCode(String StateCode) {
		this.StateCode = StateCode;
	}
	
	public String getZipCode() {
		return ZipCode;
	}
	
	public void setZipCode(String ZipCode) {
		this.ZipCode = ZipCode;
	}
	
	public String getProvince() {
		return Province;
	}
	
	public void setProvince(String Province) {
		this.Province = Province;
	}
	
	public String getCountry() {
		return Country;
	}
	
	public void setCountry(String Country) {
		this.Country = Country;
	}
	
	public String getPostalCode() {
		return PostalCode;
	}
	
	public void setPostalCode(String PostalCode) {
		this.PostalCode = PostalCode;
	}
	
	public String toJson() {
		String json = "";
		
		json += "{";
		json += "\"ID\":" + this.ID + ",";
		json += "\"SchoolCode\":\"" + this.SchoolCode + "\",";
		json += "\"SchoolName\":\"" + this.SchoolName + "\",";
		json += "\"Address\":\"" + this.Address + "\",";
		json += "\"City\":\"" + this.City + "\",";
		json += "\"StateCode\":\"" + this.StateCode + "\",";
		json += "\"ZipCode\":\"" + this.ZipCode + "\",";
		json += "\"Province\":\"" + this.Province + "\",";
		json += "\"Country\":\"" + this.Country + "\",";
		json += "\"PostalCode\":\"" + this.PostalCode + "\"";
		json += "}";
		
		return json;
	}
	
	@Override
	public String toString() {
		String text = "";
		
		text += this.ID;
		text += "#" + this.SchoolCode;
		text += "#" + this.SchoolName;
		text += "#" + this.Address;
		text += "#" + this.City;
		text += "#" + this.StateCode;
		text += "#" + this.ZipCode;
		text += "#" + this.Province;
		text += "#" + this.Country;
		text += "#" + this.PostalCode;
		
		return text;
}
}
