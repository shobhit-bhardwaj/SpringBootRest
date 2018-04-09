package com.shobhit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shobhit.bean.EmployBean;
import com.shobhit.dao.EmployDao;

@Service ("employService")
public class EmployServiceImpl implements EmployService {

	@Autowired
	EmployDao employDao;

	@Override
	public void addEmploy(EmployBean employ) {
		System.out.println("-- addEmploy Service --");

		employDao.addEmploy(employ);
	}

	@Override
	public List<EmployBean> listEmploys() {
		System.out.println("-- listEmploys Service --");

		return employDao.listEmploys();
	}

	@Override
	public EmployBean getEmploy(int id) {
		System.out.println("-- getEmploy Service --");

		return employDao.getEmploy(id);
	}

	@Override
	public void updateEmploy(EmployBean employ) {
		System.out.println("-- updateEmploy Service --");

		employDao.updateEmploy(employ);
	}

	@Override
	public void deleteEmploy(int id) {
		System.out.println("-- deleteEmploy Service --");

		employDao.deleteEmploy(id);
	}
}