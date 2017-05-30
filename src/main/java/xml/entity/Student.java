package xml.entity;

import java.util.Date;

public class Student {

    private int studentId;

    private String email;

    private String password;

    private String fname;

    private String lname;

    private Date dob;

    private String phone;

    private String mobile;

    private int studentcol;

    private Date dateOfJoin;

    private boolean status;

    private Date lastLoginDate;

    private String lastLoginID;

    private Parent parent;

    public Student(String email, String password, String fname, String lname, Date dob,
                   String phone, String mobile, Parent parent, Date dateOfJoin,
                   boolean status, Date lastLoginDate, String lastLoginID, int studentcol) {
        this.studentId = studentId;
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.phone = phone;
        this.mobile = mobile;
        this.studentcol = studentcol;
        this.dateOfJoin = dateOfJoin;
        this.status = status;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginID = lastLoginID;
        this.parent = parent;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getStudentcol() {
        return studentcol;
    }

    public void setStudentcol(int studentcol) {
        this.studentcol = studentcol;
    }

    public Date getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(Date dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public boolean isStatus() {
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

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", dob=" + dob +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", studentcol=" + studentcol +
                ", dateOfJoin=" + dateOfJoin +
                ", status=" + status +
                ", lastLoginDate=" + lastLoginDate +
                ", lastLoginID='" + lastLoginID + '\'' +
                ", parent=" + parent +
                '}';
    }

}
