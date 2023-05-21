package com.itheima.pojo;

public class school {
    Integer id;
    String schoolname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    @Override
    public String toString() {
        return "school{" +
                "id=" + id +
                ", schoolname='" + schoolname + '\'' +
                '}';
    }
}
