package com.lyx.mybatis.pojo;

/**
 * @ClassName User
 * @Descrition TODO()
 * @Author LYX
 * @Date 2018-10-05 23:11
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }
}
