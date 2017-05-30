package xml.entity;

import javax.persistence.*;
import java.util.Date;

public class Parent {

    private int parentId;
    private String email;

    private String fname;

    private String lname;

    private Date dob;

    private String phone;

    private String mobile;

    private boolean status;

    private Date lastLoginDate;

    private String lastLoginID;

    public Parent(String email, String fname, String lname, Date dob, String phone, String mobile, boolean status, Date lastLoginDate, String lastLoginID) {
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.phone = phone;
        this.mobile = mobile;
        this.status = status;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginID = lastLoginID;
    }

    public Parent() {
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public boolean isStatus() {
        return status;
    }
}
