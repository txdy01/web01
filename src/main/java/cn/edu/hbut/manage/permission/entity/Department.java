package cn.edu.hbut.manage.permission.entity;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class Department {
    private String name;
    private long id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
