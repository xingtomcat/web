package test;

import com.itheima.mapper.courseMapper;
import com.itheima.pojo.course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class coursetest4 {
    @Test
    public void testcourse03() throws IOException {
        int sid=1;
        int hours=32;
        String name="⼤数据存储";
        course course=new course();
        course.setHours(hours);
        course.setName(name);
        course.setSid(sid);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession =sqlSessionFactory.openSession();
        courseMapper courseMapper1=  sqlSession.getMapper(courseMapper.class);

        courseMapper1.updatainsert(course);

        sqlSession.commit();
        sqlSession.close();
    }
}
