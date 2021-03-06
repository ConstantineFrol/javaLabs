/**
 * 
 */
package Practicing2ndYear;

import java.util.Scanner;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 */
public class Sort2StringsAlphabetically {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		String 	user1FirstName,
				user1LastName,
				user2FirstName,
				user2LastName;
		
		System.out.println("Name of user 1? ");
		
		user1FirstName = userInput.next();
		
		user1LastName = userInput.next();
		
		System.out.println("Name of user 2?");
		
		user2FirstName = userInput.next();
		
		user2LastName = userInput.next();
		
		if(user1FirstName.compareToIgnoreCase(user2FirstName) > 0)
		{
			System.out.println(user2LastName + ", " + user2FirstName + "\n" + user1LastName + ", " + user1FirstName);
		}
		else if(user1FirstName.compareToIgnoreCase(user2FirstName) < 0)
		{
			System.out.println(user1LastName + ", " + user1FirstName + "\n" + user2LastName + ", " + user2FirstName);
		}
		else
		{
			if(user1LastName.compareToIgnoreCase(user2LastName) > 0)
			{
				System.out.println(user2LastName + ", " + user2FirstName + "\n" + user1LastName + ", " + user1FirstName);
			}
			else if(user1LastName.compareToIgnoreCase(user2LastName) < 0)
			{
				System.out.println(user1LastName + ", " + user1FirstName + "\n" + user2LastName + ", " + user2FirstName);
			}
			else
			{
				System.out.println(user1LastName + ", " + user1FirstName + "\n" + user2LastName + ", " + user2FirstName);
			}
		}

		userInput.close();
	}

}
