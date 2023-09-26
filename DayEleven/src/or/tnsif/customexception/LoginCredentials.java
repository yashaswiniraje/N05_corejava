package or.tnsif.customexception;
import java.util.*;
class LoginCredentials extends Exception {
//private data member 
private String str;
//Parameterized constructor
public LoginCredentials(String str) {
	super();
	this.str = str;
}
@Override
public String toString() {
	return "LoginCredentials [str=" + str + "]";
}
public class CustomExceptionExecutor{
	public static void main(String[]args) throws LoginCredentials {
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		String Password=sc.nextLine();
		try {
		if(email.equals("yashaswini@gmail.com")&& Password.equals("yashu2002")) {
			System.out.println("credential match");
		}
		else {
throw new LoginCredentials("invalid credential");
	}
		}
		catch(LoginCredentials e) {
			System.out.println(e);
		}
}



}
}
