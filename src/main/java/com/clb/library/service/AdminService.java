package com.clb.library.service;

import com.clb.library.dto.Admin;

public interface AdminService {

	public Admin getdata(int id);

	public Admin addData(Admin admin);

	public Admin updateData(Admin admin);

}
