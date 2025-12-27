/*
-Design a User class where:
User() - creates a guest user.
User(String username) - creates a registered user.
UseR(String username, boolean isAdmin) - creates an admin
*/

package Notes.Constructor;

public class User {
    private String username;
    private boolean isAdmin;

    //our primary constructor
    //should always use the parameters.
    public User(String username, boolean isAdmin){
        this.username = username;
        this.isAdmin = isAdmin;
    }

    //secondary constructors
    public User(){
        this("New Guest");
    }
    public User(String username){
        this(username, false);
    }

    @Override
    public String toString(){
        return "Name: " + username + ", isAdmin: " + isAdmin;
    }

    public static void main(String args[]){
        User user1 = new User("Janet", true);
        User user2 = new User("Michael");
        User user3 = new User();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }

    
}
