package com.test;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author zxx
 * @date 2018/9/22 21:52
 */
@Entity
@Table(name = "student_info", schema = "student", catalog = "")
public class StudentInfoEntity {
    private String userName;
    private int id;
    private byte[] image;
    private String moeny;

    @Basic
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Image")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Basic
    @Column(name = "moeny")
    public String getMoeny() {
        return moeny;
    }

    public void setMoeny(String moeny) {
        this.moeny = moeny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StudentInfoEntity that = (StudentInfoEntity) o;
        return id == that.id &&
                Objects.equals(userName, that.userName) &&
                Arrays.equals(image, that.image) &&
                Objects.equals(moeny, that.moeny);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(userName, id, moeny);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }
}
