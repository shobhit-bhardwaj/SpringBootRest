package com.shobhit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shobhit.bean.EmployBean;
import com.shobhit.dao.EmployDao;

@Service
public class EmployService {

	@Autowired
	EmployDao employDao;

	public void addEmploy(EmployBean employ) {
		System.out.println("-- addEmploy Service --");

		employDao.addEmploy(employ);
	}

	public List<EmployBean> listEmploys() {
		System.out.println("-- listEmploys Service --");

		return employDao.listEmploys();
	}

	public EmployBean getEmploy(int id) {
		System.out.println("-- getEmploy Service --");

		return employDao.getEmploy(id);
	}

	public void updateEmploy(int id, EmployBean employ) {
		System.out.println("-- updateEmploy Service --");

		employDao.updateEmploy(id, employ);
	}

	public void deleteEmploy(int id) {
		System.out.println("-- deleteEmploy Service --");

		employDao.deleteEmploy(id);
	}
}