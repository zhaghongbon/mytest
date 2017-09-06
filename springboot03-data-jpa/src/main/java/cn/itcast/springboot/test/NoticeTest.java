package cn.itcast.springboot.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.springboot.Application;
import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

@RunWith(SpringJUnit4ClassRunner.class)  //指定运行的主类
@SpringBootTest(classes=Application.class)  //指定springBoot
public class NoticeTest {
	
	@Autowired
	private NoticeService noticeService;
	
	@Test
	public void test(){
		List<Notice> findAll = noticeService.findAll();
		for (Notice notice : findAll) {
			System.out.println(notice);
		}
	}
}
