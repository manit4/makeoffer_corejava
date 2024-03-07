package com.exadata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exadata.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	//For query methods, below is the link....
	//https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
	public List<User> findByName(String name);
	
	public List<User> findDistinctByName(String name);
	
	public List<User> findByNameLessThan(String name);
	
	public List<User> findByPasswordLessThan(String password);
	
	@Query(value = "select * from user_detail", nativeQuery = true)
	public List<User> pullAllData();
	
	@Query(value = "select * from user_detail where complete_name =:val", nativeQuery = true)
	public List<User> pullDataByName(@Param("val") String val);
	
	@Query(value = "select * from user_detail where complete_name =:val1 and password =:val2", nativeQuery = true)
	public List<User> pullDataByNameAndPassword(@Param("val1") String val1, @Param("val2") String val2);

	@Query(value = "select * from user_detail where password <:val1", nativeQuery = true)
	public List<User> getUserByPasswordLessThan(@Param("val1") String val1);
	
	public User findByUsernameAndPassword(String username, String password);
	
}
