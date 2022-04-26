import java.util.Scanner;

public class CLIUserIdPassword {
	String UserId;
	String Password;
	
	public CLIUserIdPassword(String Username,String Pwd) {
		UserId = new String(Username);
		Password = new String(Pwd);
	}
	
	void ValidateCredentials() {
		for (int i = 1; i < 4; i++) {
			System.out.println("Enter UserId :");
			Scanner scanner = new Scanner(System.in);
			String CLI_userid = scanner.next();
			
			if (CLI_userid.equals(UserId)) {
				System.out.println("Enter Password :");
				Scanner scanner1 = new Scanner(System.in);
				String CLI_pwd = scanner1.next();
				
				if (CLI_pwd.equals(Password)) {
					System.out.println("Welcome " + CLI_userid);
					break;
				}
				else {
					if (i == 3) {
					    System.out.println("Contact Admin");
					}
				}
			}
			else {
				if (i == 3) {
				    System.out.println("Contact Admin");
				}
			}
		}
		
	}

}
