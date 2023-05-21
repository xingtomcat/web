package com.itheima.pojo;

public class course2 extends  course{
       String schoolname;

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    @Override
    public String toString() {
        return "course2{" +
                "schoolname='" + schoolname + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", sid=" + sid +
                '}';
    }
}
