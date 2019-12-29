/*
 
 */
package social;

import java.util.Scanner;
import java.util.Vector;

public class Social 
{
    
    public static void main(String[] args) {
    	Vector<User>  u = new Vector<User>();
    	boolean login_Check = false;
    	String Name = "" , Password , Email , Birthday_Date, Gender;
    	int Age;
    	Scanner in = new Scanner(System.in);
    	Scanner in1 = new Scanner(System.in);
    	UserContent userInfo = new UserContent();
    	Account_Manger manger = new Account_Manger();
    	while(true)
    	{
    		User p = new User();
    		System.out.println("Enter User Info");
        	System.out.print("Name:");
        	Name=in.nextLine();
        	if(Name.equals("00"))
        	{
        		break;
        	}
        	System.out.print("Email: ");
        	Email = in.nextLine();
        	System.out.print("Password: ");
        	Password = in.nextLine();
        	System.out.print("Age: ");
        	Age = in1.nextInt();
        	System.out.print("Gender: ");
        	Gender = in.nextLine();
        	System.out.print("Birthday: ");
        	Birthday_Date=in.nextLine();
        	p.Name = Name;
        	p.age = Age;
        	p.Birth_Date = Birthday_Date;
        	p.Email = Email;
        	p.Gender = Gender;
        	p.Password = Password;
        	u.add(p);
    	}
    	
    	for(int i = 0 ; i < u.size() ; i++)
    	{
    		manger.SignUp(u.get(i).Password, u.get(i).Name, u.get(i).Email, u.get(i).Birth_Date, u.get(i).age, userInfo.Users);
    	    manger.Login(u.get(i).Password, u.get(i).Email, userInfo.Users);
    	}
    	
    	manger.Login("3", "3", userInfo.Users); // to test not registered 
    	manger.add(u.get(0), u.get(1)); // First user sends request to the second user
    	manger.upgradeToPremium(u.get(0));
    }
    
    
}
