package com.itheima.mapper;


import com.itheima.pojo.course;
import com.itheima.pojo.course2;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface courseMapper {
    public List<course>   select01();


    List<course2>  select02();


    void updata(@Param("id") int id, @Param("hours") int hours);
    void updatainsert(course course);

    List<course2> select05();

}
