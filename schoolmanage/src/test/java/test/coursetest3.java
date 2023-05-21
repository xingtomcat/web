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
import java.util.List;

public class coursetest3 {
    @Test
    public void testcourse03() throws IOException {
        int id=4;
        int hours=40;

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession =sqlSessionFactory.openSession();
        courseMapper courseMapper1=  sqlSession.getMapper(courseMapper.class);

        courseMapper1.updata(id,hours);

        sqlSession.commit();
        sqlSession.close();
    }

}
