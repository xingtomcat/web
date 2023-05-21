package test;


import com.itheima.mapper.courseMapper;
import com.itheima.pojo.course2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class coursetest2 {
    @Test
    public void testcourse02() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession =sqlSessionFactory.openSession();
        courseMapper courseMapper1=  sqlSession.getMapper(courseMapper.class);

        List<course2> courses=courseMapper1.select02();

        System.out.println(courses);

        sqlSession.close();
    }
}
