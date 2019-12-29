package social;

import java.util.Scanner;
import java.util.Vector;


public class User {
	
	public String Name;
    public String Gender;
    public String Email;
    public String Password;
    public String Birth_Date;
    public String Type = "Normal";
    public int CreditCard_num = -1;
    public int CreditCard_Value = -1;
    public int subYears = 0;
    int age;
    public Vector<User> vec = new Vector<User>();
    boolean login_Check = false;
    Group[] group;
    Page[] page;
    Post[] post;
    
    public void Join_Group(Group g)
    {
        
    }
    public void Like_Page(Page p)
    {
        
    }

    public void Get_Creation_request(String type)
    {
        
    }
    Boolean  Get_Creation_Confirm()
    {
        return true;
    }
    public Boolean  Accept_Friend_Request(User u)
    {
    	int check;
    	System.out.println("Hi, " + u.Name +" Has sent a friend request , to accept insert: 1");
    	Scanner in = new Scanner(System.in);
    	System.out.print("Your Choice: ");
    	check = in.nextInt();
    	if(check == 1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}

    }
    
    

}
