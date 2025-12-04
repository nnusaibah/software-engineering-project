package studysmart;

import java.util.ArrayList;
import java.util.List;

public class User {
 
    public int userId;

 
    public String name;

 
    public String email;

 
    private String password;

 
    public List<Course> course = new ArrayList<Course> ();

 
    public List<Task> task = new ArrayList<Task> ();

 
    public List<Reminder> reminder = new ArrayList<Reminder> ();

 
    public List<Badge> badge = new ArrayList<Badge> ();

 
    public boolean login(String email, String password) {
        if (email == null || password == null) {
            return false;
        }    
        return this.email.equals(email) && this.password.equals(password);
    }

 
    public void updateProfile(final String name, final String email) {
    }

}
