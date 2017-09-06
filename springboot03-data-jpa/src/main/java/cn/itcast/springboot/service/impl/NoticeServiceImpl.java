package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.springboot.dao.NoticeDao;
import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer start, Integer rows) {
		return null;
	}


}
