package basics;

import java.util.*;

public class RationCard {
	

	
	


/*public void createRationCard()
	{
		String family = Family Details;
		System.out.println("Family Details : "+family);
	}*/
public static void main(String[] args) 
{
	Family familyOne=new Family();
	familyOne.setRationCardid(143);
	
	FamilyMembers familyMembersOne=new FamilyMembers();
	familyMembersOne.setName("Vinay");
	familyMembersOne.setAge(21);
	familyMembersOne.setGender("male");
	familyMembersOne.setDob("10/05/1998");
	

	FamilyMembers familyMembersTwo=new FamilyMembers();
	familyMembersTwo.setName("Aravind");
	familyMembersTwo.setAge(21);
	familyMembersTwo.setGender("male");
	familyMembersTwo.setDob("10/05/1997");
	

	List<FamilyMembers> familyMembersList=new ArrayList();
	familyMembersList.add(familyMembersOne);
	familyMembersList.add(familyMembersTwo);
	
	familyOne.setFamilyMembers(familyMembersList);
	familyOne.setEconomyLevel("Rich");
	
	
	Address address = new Address();
	address.setDoorNo(563);
	address.setStreetName("Rajivnagar");
	address.setCityName("Hosur");
	address.setPinCode(635124);
	
	familyOne.setAddress(address);
	
	System.out.println(familyOne.toString());
	}
}