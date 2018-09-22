import java.io.Serializable;

/**
 * @author zxx
 * @date 2018/9/22 15:08
 */
public class Student implements Serializable {
    private String stuNo;
    private String stuName;
    private String sex;
    private String cource;
    private Long grade;

    public Student(){}

    public Student(String stuNo,String stuName){
        this.stuName=stuName;
        this.stuNo=stuNo;
    }

    public Student(String stuNo,String stuName,String sex,String cource,Long grade){
        this.stuName=stuName;
        this.stuNo=stuNo;
        this.cource=cource;
        this.sex=sex;
        this.grade=grade;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }
}
