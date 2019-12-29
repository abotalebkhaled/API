package social;

import java.util.Scanner;
import java.util.Vector;

public class Account_Manger {
	
	public  User User;

    
    public void Login(String Password,String Email , Vector<User> v)
    {
    	boolean check = false;
        for(int i = 0 ; i < v.size() ; i++)
        {
     	   if(v.get(i).Password.equals(Password) && v.get(i).Email.equals(Email))
     	   {
     		   System.out.println("Welcome: " + v.get(i).Name +"Logged in successfully");
     		   check = true;
     		   v.get(i).login_Check = true;
     		   
     	   }
        }
        if (!check)
        {
        	System.out.println("This user is not Registered ");
        }
    }
    public void SignUp(String Password,String Name,String Email,String Birth,int age ,Vector<User> v)
    {
        User obj = new User();
        obj.age = age;
        obj.Password = Password;
        obj.Name = Name;
        obj.Email = Email;
        obj.Birth_Date = Birth;
        v.add(obj);
    }
  
    public Boolean confirm_SignUp()
    {
        return true;
    }
    public void add(User u1,User u2)
    {
    	boolean check;
    	check = u2.Accept_Friend_Request(u1);
    	if(check)
    	{
    		System.out.println(u2.Name + " Has accepted your friend request");
    		u1.vec.add(u2);
    		u2.vec.add(u1);
    	}
    	else
    	{
    		System.out.println(u2.Name + " Has Rejected your friend request");
    	}
        
    }
    
    public Boolean  Check_Credit(User u)
    {    	
    	if(u.CreditCard_Value >= 99)
    	{
           u.subYears++;
           u.CreditCard_Value-=99;
    	    return true;
    	}
    	else
    	{
    		return false;
    	}

    }

    public void upgradeToPremium(User u)
        {
          	Scanner in = new Scanner(System.in);
        	int check;
        	System.out.println("How are you willing to pay ? Cash or CreditCard");
        	System.out.print("For CreditCard insert 1 , for Cash insert 2: ");
        	check = in.nextInt();
        	if(check == 1)
        	{
        		int card_number;
              	int amount;
              	System.out.println("Hi, " + u.Name +" please enter your card number");
    	    	System.out.print("enter card number: ");
    	    	card_number = in.nextInt();
    	        System.out.print("enter the amount that you will pay for subcribtion (99$) for one year : ");
    	    	amount = in.nextInt();
    	    	u.CreditCard_num = card_number;
    	    	u.CreditCard_Value = amount;
    	        if(Check_Credit(u))
    	        {
    	        	u.Type = "Premium";
    	            System.out.println("Congratulations "+ u.Name + " you became a Premium user ");
    	            
    	        }
    	        else
    	        {
    	        	System.out.println("Not enough money ");
    	        }
        	}
        	else if(check == 2)
        	{
        		int amount;
        		while(true)
        		{
        			System.out.print("Enter your Amount of money: ");
            		amount = in.nextInt();
            		if(amount >= 99 )
            		{
            			u.Type = "Premium";
            			u.subYears++;
            			int change = amount-99;
            			System.out.println("Now you are a premium user for 1 year and here is your change = " + change );
            			break;
            		}
            		else
            		{
            			System.out.println("The lowest price is 99$/year. No less money will be accepted. Try Again");
            		}
        		}

        	}       
       }
}
