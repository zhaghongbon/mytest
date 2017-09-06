package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.entity.Notice;

public interface NoticeService {
	
	public List<Notice> findAll();

	public Map<String, Object> findByPage(Integer start, Integer rows);
}
