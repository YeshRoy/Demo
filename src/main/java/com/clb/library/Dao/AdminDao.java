package com.clb.library.Dao;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.clb.library.dto.Admin;
@EnableJpaRepositories	
public interface AdminDao extends CrudRepository<Admin, Integer>{

	public Admin findByAdminId(int id);	
}
	