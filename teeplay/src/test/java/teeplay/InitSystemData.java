package teeplay;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.teeplay.model.account.TableResource;
import org.teeplay.model.account.TableUser;
import org.teeplay.service.account.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springMVC-servlet.xml"})
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=false)
public class InitSystemData extends AbstractTransactionalJUnit4SpringContextTests {

	@Resource(name="userService")
	UserService userService;
	
	@Test
	public void testFindUser(){
		TableUser u = userService.getUserByU("sfs");
		System.out.println(u.getId());
	}
	
	@Test
	public void testAddResc(){
		
		long n1 = userService.saveResource("XXX管理系统", "sys", "根目录", 0);
		System.out.println(n1);
		long n2 = userService.saveResource("用户管理", "user:oper", "根目录", n1);
		System.out.println(n2);
		long n3 = userService.saveResource("新建用户", "user:create", "新建用户", n2);
		System.out.println(n3);
		long n4 = userService.saveResource("编辑用户", "user:edit", "编辑用户", n2);
		System.out.println(n4);
		
		
		long n5 = userService.insertRole("administrator", "系统管理员角色");
		System.out.println(n5);
		
		userService.insertRoleResource(n5, n1);
		userService.insertRoleResource(n5, n2);
		userService.insertRoleResource(n5, n3);
		
		TableUser u = userService.getUserByU("sfs");
		
		userService.insertUserRole(u.getId(), n5);
		
		userService.insertUserResource(u.getId(), n4);
		
	}
	
	@Test
	public void testFindUserRescs(){
		List<String> u = userService.getUserRescs(1L);
		if(u!=null && u.size()>0){
			for(String s : u){
				System.out.println(s);
			}
		}
		
	}
}
