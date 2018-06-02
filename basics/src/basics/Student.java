package basics;

public class Student{
	public static void main(String[] args) {
		StudentReport studentOne=new StudentReport();
		studentOne.setStudentid(9876);
		studentOne.setFirstName("Vinay");
		studentOne.setSecondName("Virat");
		studentOne.setGender("male");
		studentOne.setBranch("BE");
		studentOne.setDept("ECE");
		System.out.println(studentOne.toString());
		
		StudentReport studentTwo=new StudentReport();
		studentTwo.setStudentid(9876);
		studentTwo.setFirstName("Aravind");
		studentTwo.setSecondName("Virat");
		studentTwo.setGender("male");
		studentTwo.setBranch("BTech");
		studentTwo.setDept("IT");
		System.out.println(studentTwo.toString());
		
        
        
		
		
		
		
	}

	
	}
	

