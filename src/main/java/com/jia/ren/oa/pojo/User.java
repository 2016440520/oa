package com.jia.ren.oa.pojo;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String  name;
    private String sex;
    private Integer age;
    private Date birthDay;
    private double worktime;
    private String email;
    private String place;


    private String hometown;
    private String selfintro;

    public User(Integer id, String username, String password, String name, String sex, Integer age, Date birthDay, double worktime, String email, String place, String hometown, String selfintro) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthDay = birthDay;
        this.worktime = worktime;
        this.email = email;
        this.place = place;
        this.hometown = hometown;
        this.selfintro = selfintro;
    }

    public User(String username, String password, String name, String sex, Integer age, Date birthDay, double worktime, String email, String place, String hometown, String selfintro) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthDay = birthDay;
        this.worktime = worktime;
        this.email = email;
        this.place = place;
        this.hometown = hometown;
        this.selfintro = selfintro;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public double getWorktime() {
        return worktime;
    }

    public void setWorktime(double worktime) {
        this.worktime = worktime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getSelfintro() {
        return selfintro;
    }

    public void setSelfintro(String selfintro) {
        this.selfintro = selfintro;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                ", worktime=" + worktime +
                ", email='" + email + '\'' +
                ", place='" + place + '\'' +
                ", hometown='" + hometown + '\'' +
                ", selfintro='" + selfintro + '\'' +
                '}';
    }

}
