package xml.entity;

import javax.persistence.*;
import java.util.Date;


public class Teacher {
    private int teacherId;
    private String email;

    private String password;

    private String fname;

    private String lname;

    private Date dob;

    private String phone;

    private String mobile;

    private boolean status;

    private Date lastLoginDate;

    private String lastLoginID;


    public Teacher(String email, String password, String fname, String lname, Date dob, String phone, String mobile, boolean status, Date lastLoginDate, String lastLoginID) {
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.phone = phone;
        this.mobile = mobile;
        this.status = status;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginID = lastLoginID;
    }

    public Teacher() {
    }


    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public boolean isStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginID() {
        return lastLoginID;
    }

    public void setLastLoginID(String lastLoginID) {
        this.lastLoginID = lastLoginID;
    }

}
