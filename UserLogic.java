package ApplicationThree;
import java.util.Scanner;

public class UserLogic{

	
	static int i = 0;
	UserDetails[] UserArray = new UserDetails[2];
	
	void addUser() {
		Scanner sc = new Scanner(System.in);
		
		UserDetails ud = new UserDetails();
		
		System.out.print("Enter First Name - ");
		
		String FirstName = sc.next();
		
		System.out.print("Enter Last Name - ");
		
		String LastName = sc.next();
		
		System.out.print("Enter age - ");
		
		int Age = sc.nextInt();
		
		System.out.print(" Enter gender - " );
		
		String gender = sc.next();
		
		
		ud.setFname(FirstName);
		ud.setLname(LastName);
		ud.setAge(Age);
		ud.setGender(gender);
		
		ud.UserID = FirstName + Age;
		ud.pwd = ud.UserID;
		UserArray[i] = ud; 
		i++;
		if(UserArray[i] != null ) {System.out.println("User Added successfully!! ");
		sc.close();}
		
	}
	
	void ViewDetails(String userid) {
		for(UserDetails A:UserArray) {
			if(A.UserID == userid) 
			{
			System.out.print("First Name: " + A.getFname()
			+ "\n LastName: "+ A.getLname()
			+"\n Age: "+ A.getAge()
			+"\n Gender: "+ A.getGender());
			}
			else 
			{
				System.out.println("Cannot find your details, please login again");
			}
		}
	}
	
	void UpdatePwd(String userid) 
	{
		for(UserDetails A:UserArray) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Curernt pwd");
			String Current = sc.nextLine();
			if(A.UserID == userid && A.pwd == Current) {
				System.out.print(" Enter new pwd:  ");
				String newp = sc.nextLine();
				System.out.println("Confirm Pwd: ");
				String confirm = sc.nextLine();
				if(confirm == newp) {
					A.setPwd(confirm);
					System.out.print("Password changed Successfully");					
				}
				else 
					System.out.print("Try again in 30 mins");
					
				sc.close();
			}
		}
	}
	
	void LoginMenu(String id,String pwd) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.nextInt() != 4) 
		{
		System.out.println("1.Update Password . ");
		System.out.println("2.View my Details . ");
		System.out.println("3.Update my details.");
		System.out.println("4.Logout ");
		int choice = sc.nextInt();
		switch(choice) 
		{
			case 1: UpdatePwd(id);
			case 2: ViewDetails(id);
			case 3: UpdateDetails(id);
			case 4: 
				System.out.print("Logging out");
				break;
		}
		}
		sc.close();
		}
	
	void UpdateDetails(String id) {
		Scanner sc = new Scanner(System.in);
		for(UserDetails A:UserArray) 
		{
			if(A.UserID == id) 
			{
			System.out.print("Enter First Name - ");
			String newFirstName = sc.nextLine();
			System.out.print("Enter Last Name - ");
			String newLastName = sc.nextLine();
			System.out.print("Enter age - ");
			int newAge = sc.nextInt();
			System.out.print(" Enter gender - " );
			String newgender = sc.nextLine();
			
			
			UserArray[i].setFname(newFirstName);
			UserArray[i].setLname(newLastName);
			UserArray[i].setAge(newAge);
			UserArray[i].setGender(newgender);
			
			
			System.out.print("Details Updated Successfully");
			}
		}
	}
}

