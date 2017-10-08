package cn.happy.test;

import cn.happy.dao.IUserInfo;
import cn.happy.entity.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by adminastrator on 2017/9/21.
 */
public class MyTest {

    @Test
    public void islong() throws Exception{
        InputStream is= Resources.getResourceAsStream("mybatis-cofing.xml");
        SqlSessionFactory sql=new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sql.openSession();
        UserInfo u=new UserInfo();
        u.setUserName("hh");
        u.setUserPassword("1");
        UserInfo login = session.getMapper(IUserInfo.class).isLogin(u);
        System.out.println(login.getUserName());
    }
}
