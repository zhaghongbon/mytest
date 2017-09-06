package cn.itcast.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.itcast.springboot.entity.Notice;

@Repository
public interface NoticeDao extends JpaRepository<Notice, Long>{
}
