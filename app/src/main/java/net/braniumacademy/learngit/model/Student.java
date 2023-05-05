package net.braniumacademy.learngit.model;

import java.util.Date;
import java.util.Objects;

public class Student {
    private String studentId;
    private String fullName;
    private float gpa;
    private Date birthDate;

    private String major;

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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId.equals(student.studentId);
    }

    public String getFirst() {
        String regex = "\\s+";
        String[] names = fullName.split(regex);
        if(names.length == 0) {
            return "";
        }
        return names[names.length - 1];
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
// git add