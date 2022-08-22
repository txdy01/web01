package cn.edu.hbut.manage.permission.entity;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


import javax.persistence.OneToMany;
import java.util.List;

@Table(name = "user")
public class User {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @OneToMany(mappedBy = "user")
    private List<Permission> permissions;

}
