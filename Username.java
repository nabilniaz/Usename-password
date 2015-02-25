import java.util.Scanner;
public class Username {
	public static void main(String [] args) {
		Scanner usernames = new Scanner(System.in); // Assigns usernames to input
		System.out.println("Enter your username");
		String username = usernames.next(); // Assigns username to input from usernames
	
	System.out.println("Enter your password"); 
	Scanner passwords= new Scanner (System.in); // takes input for password
	String password = passwords.next(); // assigns password vairable to above input

	System.out.println("What is your username?");
	Scanner usernamestest = new Scanner(System.in); // Asks user to input username again to cekc
	String enterusername = usernamestest.next(); // assigns to variable
	
if (enterusername.equals(username)) {  // This checks to see if input is equal to first inputted username
		System.out.println("That is the correct username \n");
}
else {
	System.out.println("That is the wrong username!");
}
	
	System.out.println("What is your password?");
	Scanner passwordtest = new Scanner(System.in); // user inputs password again
	String enterpassword = passwordtest.next(); // assigns password to new vairable

if (enterpassword.equals(password)) { // tests to see if inputted password again is equal to first password
	System.out.println("That is the correct password");
}
else { 
	System.out.println("That is the wrong password!");
}

}
}		
