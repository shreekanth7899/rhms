package com.example.rhms;

public class Credentials {

    private String eemail ;
    private String epassword;

    Credentials(String Eemail,String Epassword){
        this.eemail = Eemail;
        this.epassword = Epassword;

    }

    public Credentials(String username, String password, String conformPassword) {
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

    public String getEpassword() {
        return epassword;
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword;
    }
}
