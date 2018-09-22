package com.test;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author zxx
 * @date 2018/9/22 15:22
 */
@Entity
@Table(name = "student", schema = "student", catalog = "")
public class StudentEntity {
    private String stuno;
    private String stunam;
    private String sex;
    private String cource;
    private int grade;

    @Id
    @Column(name = "STUNO")
    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    @Basic
    @Column(name = "STUNAM")
    public String getStunam() {
        return stunam;
    }

    public void setStunam(String stunam) {
        this.stunam = stunam;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "COURCE")
    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    @Basic
    @Column(name = "GRADE")
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        StudentEntity that = (StudentEntity) o;
        return grade == that.grade &&
                Objects.equals(stuno, that.stuno) &&
                Objects.equals(stunam, that.stunam) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(cource, that.cource);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stuno, stunam, sex, cource, grade);
    }
}
