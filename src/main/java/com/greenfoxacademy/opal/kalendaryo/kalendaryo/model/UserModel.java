package com.greenfoxacademy.opal.kalendaryo.kalendaryo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    List<AuthModel> authModelList;

    public UserModel() {
    }

    public UserModel(List<AuthModel> authModelList) {
        this.authModelList = authModelList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<AuthModel> getAuthModelList() {
        return authModelList;
    }

    public void setAuthModelList(List<AuthModel> authModelList) {
        this.authModelList = authModelList;
    }
}
