package cn.controller;
import cn.bean.TbUser;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//user/login.action
@Controller //userController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	//前面页面<a href="${pageContext.request.contextPath}/user/login.action">登录</a>
	@RequestMapping("/login.action")
	public String login(Model model) {
		//调用内容
		TbUser user= userService.selectByPrimaryKey(1);
		System.out.println(user);
		model.addAttribute("USER", user);
		return "/pages/main.jsp";
	}
}
