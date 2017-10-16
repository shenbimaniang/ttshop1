package com.xy.ttshop.dao;

import static org.junit.Assert.*;

/**
 *
 */
@org.junit.runner.RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@org.springframework.test.context.ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
public class TbUserMapperTest {

    @org.springframework.beans.factory.annotation.Autowired
    private com.xy.ttshop.dao.TbUserMapper userDao;
    @org.junit.Test
    public void selectByPrimaryKey() throws Exception {
        com.xy.ttshop.pojo.po.TbUser user = userDao.selectByPrimaryKey(5L);
        System.out.println(user);
    }

}