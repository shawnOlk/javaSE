package io;

import java.util.Date;

/**
 * Created by sunlei on 2018/3/7.
 */
public class Member {
    private int id;
    private String name;
    private int age;
    private Date date;

    public Member(int id, String name, int age, Date date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
