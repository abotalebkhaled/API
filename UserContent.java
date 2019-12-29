package social;	

import java.util.Vector;

public class UserContent {
	
	 public  Vector<User> Users = new Vector<User>();
     public void Add_User(User u)
     {
         Users.add(u);
     }

}
