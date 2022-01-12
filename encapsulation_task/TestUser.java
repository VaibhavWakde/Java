package java_task.encapsulation_task;

public class TestUser {

    public static void main(String[] args) {




        User user = new User();

        user.setUser_id(2);
        user.setUser_name("Vaibhav");
        user.setAddress("Chandrapur");
        user.setPassword("Pass@123");
//        user.setDOB();

        System.out.println("User Id is : "+user.getUser_id());
        System.out.println("User Name is : "+user.getUser_name());
        System.out.println("Adress : "+user.getAddress());

    }
}
