package com.clb.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clb.library.Dao.AdminDao;
import com.clb.library.dto.Admin;

@Service
public class AdminServiceImp implements AdminService {
	@Autowired
	private AdminDao dao;

	@Override
	public Admin getdata(int id) {
		return dao.findByAdminId(id);
	}

	@Override
	public Admin addData(Admin admin) {
		return dao.save(admin);
	}

	@Override
	public Admin updateData(Admin admin) {
		return dao.save(admin);
	}

}
