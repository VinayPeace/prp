package basics;

import java.util.*;

public class Address {
	private int doorNo;
    private String streetName;
    public String cityName;
    private int pinCode;
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", cityName=" + cityName + ", pinCode="
				+ pinCode + "]";
	}
   
}
