package book.ch2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TestEmployee {
    private SqlSession sqlSession=null;
    private SqlSessionFactory sqlSessionFactory=null;

    @Before
    public void init(){
        String file="mybatis.xml";
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(file);
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
            sqlSession=sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
@Test
    public void t1(){
        List<Employee> list=sqlSession.selectList("book.ch2.EmployeeMapper.findByID",1);
        for(Employee e:list){
            System.out.println(e);
        }

       // boolean insert1=sqlSession.insert("book.ch2.EmployeeMapper.insertID","dasd",30,"DASD");
       // System.out.println(insert1);
    }
    @Test
    public void t2(){
        sqlSession=MybatisUtil.getSession();
        List<Employee> list=sqlSession.selectList("book.ch2.EmployeeMapper.findByID",2);
        for(Employee e:list){
            System.out.println(e);
        }
    }
}
