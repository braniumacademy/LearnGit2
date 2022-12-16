package net.braniumacademy.learngit;

public class Test {
    private int age;
    private String fullName;
    private String job;
    private String address;

    public Test(int age) {
        this.age = age;
    }

    public Test(int age, String fullName, String job, String address) {
        this.age = age;
        this.fullName = fullName;
        this.job = job;
        this.address = address;
    }
}
