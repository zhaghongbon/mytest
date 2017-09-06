package cn.itcast.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
	
	@GetMapping("/item")
	public String item(Model model){
		model.addAttribute("itemArr", new String[]{"小米1","小米2","小米3"});
		return "item";
	}
}
