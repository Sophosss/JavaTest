package my_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

	@PostMapping(value = "/user/login")
	public String login(@RequestParam("username") String username,
						@RequestParam("password") String password,
						Map<String,Object> map, HttpSession session){
		if(!StringUtils.isEmpty(username) && "123".equals(password)){
			session.setAttribute("LoginUser",username);
			return "redirect:/main.html";
		}
		else {
			map.put("msg","密码错误 你到底记不记得你的账号？？");
			return "login";
		}
	}

}
