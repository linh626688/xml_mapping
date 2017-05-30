package xml.entity;

import javax.persistence.*;

public class ClassRoomStudent  {

    private int classRoomStudentId;

    private ClassRoom classRoom;

    private Student student;

    public int getClassRoomStudentId() {
        return classRoomStudentId;
    }

    public void setClassRoomStudentId(int classRoomStudentId) {
        this.classRoomStudentId = classRoomStudentId;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
