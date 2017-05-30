package xml.entity;

import javax.persistence.*;
import java.util.Date;


public class Attendance {
    private int attendanceId;

    private Date date;

    private Boolean status;

    private String remark;

    private Student student;

    public Attendance(int attendanceId, Date date, Boolean status, String remark, Student student) {
        this.attendanceId = attendanceId;
        this.date = date;
        this.status = status;
        this.remark = remark;
        this.student = student;
    }

    public Attendance() {
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
