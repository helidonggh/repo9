package cn.itcast.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.itcast.domain.User;


public interface UserDao {
	
	@Select("select * from user")
	List<User> findAll();
}
