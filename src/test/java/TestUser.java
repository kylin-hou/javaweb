

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kylin.model.User;
import com.kylin.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)		//
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestUser {

	@Resource 
	private UserService userService;
	
	
	@Test
	public void test() {
		testGetUserById();
	}
	public void testGetUserById() {
		User user = userService.getUserById(1);
		System.out.println(user.getUserName());
	}
}
