package java_task.encapsulation_task;

import java.util.Date;

public class User {
    int current_date = 30;
    int current_month = 11;
    public int current_year = 2021;
    public int DOB_year = 1998;

    private int user_id = 1;
    private String user_name;
    private String password;
    private String address;


    void age(int current_year, int DOB_year){
        int year = current_year - DOB_year;
//        return  year;
    }
//    private Date DOB;




//    public int getAge() {
//        return age;
//    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setDOB(int DOB) {
//        this.DOB = DOB;
//    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


