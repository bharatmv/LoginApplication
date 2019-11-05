package ApplicationThree;
import java.util.Scanner;
public class UserMain {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		int mainchoice = sc.nextInt();
		while(mainchoice < 3) 
		{
		System.out.println("Hello, Please Select the options :");
		
		System.out.print("1. Login \n2.Register ");
		
		
		UserLogic u1 = new UserLogic();
		
		switch(mainchoice){
		case 1: 
			System.out.print("Enter User Name : -" );
			String uid = sc.nextLine();
			System.out.print("Enter pwd : - ");
			String pwd = sc.nextLine();
			
			u1.LoginMenu(uid, pwd);
			
		case 2: 
			u1.addUser();
			break;
		case 3: 
			break;
		}
	}
		}

}
