package cn.edu.hbut.manage.permission.entity;


import cn.edu.hbut.manage.permission.enumtype.PermissionType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Permission {
    private long id;

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private  User user;
    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;

    private PermissionType permissionType;
}
