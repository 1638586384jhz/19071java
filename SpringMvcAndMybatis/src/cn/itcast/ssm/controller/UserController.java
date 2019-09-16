package cn.itcast.ssm.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.pojo.User;
import cn.itcast.ssm.service.ItemService;

@Controller
public class UserController {

	/**
	 * 跳转到登录页面
	 * 
	 * @return
	 */
	@Autowired
	private ItemService itemService;
	@RequestMapping("toLogin.action")
	public String toLogin() {
		return "login";
	}

	/**
	 * 用户登录
	 * 
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping("login.action")
	public String login(String username, String password, HttpSession session) {
		// 校验用户登录
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		int id=itemService.selectUserAndPassword(user);

		// 把用户名放到session中
		if(id>0) {
		session.setAttribute("username", username);

		return "redirect:/itemList.action";
		}
		return null;
	}

}

