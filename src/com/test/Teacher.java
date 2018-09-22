package com.test;

/**
 * @author zxx
 * @date 2018/9/22 20:43
 */
public class Teacher {
    private String TeacherId;
    private String TeacherName;
    private String TeachCource;

    public Teacher(){

    }

    public String getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(String teacherId) {
        TeacherId = teacherId;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getTeachCource() {
        return TeachCource;
    }

    public void setTeachCource(String teachCource) {
        TeachCource = teachCource;
    }
}
