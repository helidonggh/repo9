package cn.itcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAll")
	public ModelAndView findAll() {
		System.out.println("访问了方法");
		ModelAndView mv = new ModelAndView();
		List<User> list =  userService.findAll();
		mv.addObject("list",list);
		mv.setViewName("success");
		return mv;
	}
}
