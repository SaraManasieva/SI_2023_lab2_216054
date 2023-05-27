import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyBranchTest() {
        //Test case 1
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //Test case 2
        List<User> allUsers2=new ArrayList<User>();
        allUsers2.add(new User("email@gmail.com","password1" ,"email@gmail.com"));
        allUsers2.add(new User("username2","password2" ,"email2@gmail.com"));
        allUsers2.add(new User("username3","password3" ,"email3@gmail.com"));
        User user2=new User(null,"password" ,"email@gmail.com");

        assertEquals(false,SILab2.function(user2,allUsers2));

        //Test case 3
        List<User> allUsers3=new ArrayList<User>();
        allUsers3.add(new User("username1","password1" ,"email1@gmail.com"));
        allUsers3.add(new User("username2","password2" ,"email2@gmail.com"));
        allUsers3.add(new User("username3","password3" ,"email3@gmail.com"));
        User user3=new User("username","p@assword" ,"emailgmail.com");

        assertEquals(false,SILab2.function(user3,allUsers3));

        //Test case 4
        List<User> allUsers4=new ArrayList<User>();
        allUsers4.add(new User("username1","password1" ,"email1@gmail.com"));
        allUsers4.add(new User("username2","password2" ,"email2@gmail.com"));
        allUsers4.add(new User("username3","password3" ,"email3@gmail.com"));
        User user4=new User("username","pasword" ,"email@gmail.com");

        assertEquals(false,SILab2.function(user4,allUsers4));

        //Test case 5
        List<User> allUsers5=new ArrayList<User>();
        allUsers5.add(new User("username1","password1" ,"email1@gmail.com"));
        allUsers5.add(new User("username2","password2" ,"email2@gmail.com"));
        allUsers5.add(new User("username3","password3" ,"email3@gmail.com"));
        User user5=new User("username","pas sword" ,"email@gmail.com");

        assertEquals(false,SILab2.function(user5,allUsers5));

    }

    @Test
    void multipleConditionTest(){
        //if (user==null || user.getPassword()==null || user.getEmail()==null).
        //T || X || X
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        //F || T || X
        User user1=new User("username",null ,"email@gmail.com");
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user1,new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        //F || F || T
        User user2=new User("username","password" ,null);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user2,new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        //F || F || F
        User user3=new User("username","password" ,"email@gmail.com");
        assertEquals(false,SILab2.function(user3,new ArrayList<>()));
    }

}