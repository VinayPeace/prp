package basics;

import java.util.*;

public class Family {
	private int rationCardid;
	private List<FamilyMembers> familyMembers;
	private String economyLevel;
	private Address address;
	public int getRationCardid() {
		return rationCardid;
	}
	public void setRationCardid(int rationCardid) {
		this.rationCardid = rationCardid;
	}
	public List<FamilyMembers> getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(List<FamilyMembers> familyMembers) {
		this.familyMembers = familyMembers;
	}
	public String getEconomyLevel() {
		return economyLevel;
	}
	public void setEconomyLevel(String economyLevel) {
		this.economyLevel = economyLevel;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Family [rationCardid=" + rationCardid + ", familyMembers=" + familyMembers + ", economyLevel="
				+ economyLevel + ", address=" + address + "]";
	}
	
	
}
