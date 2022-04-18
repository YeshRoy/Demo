package com.clb.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clb.library.dto.Admin;
import com.clb.library.service.AdminService;

@RestController
@RequestMapping("admin")
public class AdminController {
	@Autowired
	private AdminService service;

	@GetMapping("/get/{id}")
	public Admin getdata(@PathVariable int id) {
	Admin getdata = service.getdata(id);
	if(getdata!=null) {
		System.out.println(getdata.toString());
		return getdata;
	}else {
		System.out.println("mr deeps");
	return null;
	}
	}

	@PostMapping("/add")
	public Admin addData(@RequestBody Admin admin) {
		
		return service.addData(admin);
	}
}
