package com.sasha.sandbox.jsonbTest.model;

import com.sasha.sandbox.jsonbTest.MyJson;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jsonb_test_user")
@TypeDef(name = "jsonbType",typeClass = JsonBinaryType.class)
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Type(type = "jsonbType")
    @Column(name = "role", columnDefinition = "jsonb")
    private List<Role> roles;

    public void addRoleToUser(Role role) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        roles.add(role);
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roles=" + roles +
                '}';
    }

}
