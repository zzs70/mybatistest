import cn.bdqn.tangcco.entity.Tbuser;
import cn.bdqn.tangcco.mapper.TbuserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.Date;


/**
 * Created by hasee on 2017/5/17.
 */
public class Testuser
{
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private TbuserMapper tbuserMapper;

    @Before
    public void init(){
        try {
            this.sqlSessionFactory = new SqlSessionFactoryBuilder( )
                    .build(Resources.getResourceAsStream("config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.sqlSession = this.sqlSessionFactory.openSession();
        this.tbuserMapper = this.sqlSession.getMapper(TbuserMapper.class);
    }


    @Test
    public void testQueryAllUser(){
        for (Tbuser users:this.tbuserMapper.queryAllUser()) {
            System.out.println(users);
        }
    }


    @Test
    public void testLogin(){
        System.out.println(this.tbuserMapper.login(new Tbuser("zzs","zzs")));

    }
    @Test
    public void testDelete(){
        this.tbuserMapper.deleteUser(13);

    }

    @Test
    public void testQueryUserById( ){
        System.out.println(this.tbuserMapper.queryUserByUserid(2));
    }
    @Test
    public void testUpdate( ){
        Tbuser tbuser = new Tbuser();
        tbuser.setUserid(3);
        tbuser.setUsername("ssssssssssssssssss");
        tbuserMapper.updateUser(tbuser);
        System.out.println("修改成功");
//        this.tbuserMapper.updateUser(new Tbuser(2,"777","555","66","啧啧啧"));
    }
    @Test
    public void addUser( ){
        java.util.Date utilDate=new java.util.Date();
        Date date=new Date(utilDate.getTime());
        Tbuser tbuser=new Tbuser();
        tbuser.setUsername("zzz");
        tbuser.setPassword("sss");
        tbuser.setUserroles("01");
        tbuser.setNickname("用户");
        tbuser.setRegistrationtime(date);

        tbuser.setDateofbirth(date);
        tbuser.setSystemtime(date);
        this.tbuserMapper.addUser(tbuser);
        System.out.println("新增成功");
    }
    @After

    public void after(){
        this.sqlSession.commit();
        this.sqlSession.close();
    }

}
