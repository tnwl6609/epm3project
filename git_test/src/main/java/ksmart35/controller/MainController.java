package ksmart35.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "안녕하세요 김수지입니다.");
		return "index";
	}
	

}
