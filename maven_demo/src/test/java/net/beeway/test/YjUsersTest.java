package net.beeway.test;

import net.beeway.emer.dao.YjUsersMapper;
import net.beeway.emer.entry.YjUsers;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class YjUsersTest {

    @Test
    public void findAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        YjUsersMapper bean = ac.getBean(YjUsersMapper.class);

//        YjUsersService bean = ac.getBean(YjUsersService.class);

        List<YjUsers> yjUsers = bean.selectAll();
        for(YjUsers u:yjUsers){
            System.out.println(u.getLoginName());
        }
    }
}
