package cn.itcast.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("list")
	@ResponseBody
	public List<Notice> list(){
		return noticeService.findAll();
	}
	
	@GetMapping("show")
	public String show(){
		return "html/notice.html";
	}
	
	@PostMapping("findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(Integer page,Integer rows){
		Map<String, Object> noticeMap = noticeService.findByPage((page-1)*rows,rows);
		return noticeMap;
	}
}
