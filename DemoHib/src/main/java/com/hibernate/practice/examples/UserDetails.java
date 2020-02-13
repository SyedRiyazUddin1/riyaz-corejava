//model class
package com.hibernate.practice.examples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "student_details")
public class UserDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "student_id")
    private int userId;
    @Column(name = "student_name")
    private String userName;

    public String getUserBranch() {
        return userBranch;
    }

    public void setUserBranch(String userBranch) {
        this.userBranch = userBranch;
    }

    @Column(name = "student_branch")
    private String userBranch;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
