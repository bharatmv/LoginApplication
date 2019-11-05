package ApplicationThree;

public class UserValidate {
	
	

	
	boolean validateName(String name) {
		if(name.length() > 20) {return false;}
		else {return true;}
	}
	
	boolean validateAge(int age) {
		if(age > 120 && age < 1) {return false;}
		else { return true;}
	}
	
	boolean validateGender(String gender) {
		if(gender != "M" || gender != "N") {return false;}
		else {return true;}
	}
	
}
