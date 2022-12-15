package net.braniumacademy.learngit;

import java.util.Date;
import java.util.Objects;

public class Student {
    private String studentId;
    private String fullName;
    private float gpa;
    private Date birthDate;

    public Student() {

    }

    public Student(String studentId, String fullName, float gpa, Date birthDate) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gpa = gpa;
        this.birthDate = birthDate;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public float getGpa() {
        return gpa;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gpa=" + gpa +
                ", birthDate=" + birthDate +
                '}';
    }
}