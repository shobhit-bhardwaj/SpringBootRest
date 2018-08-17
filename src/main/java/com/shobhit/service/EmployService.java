package com.shobhit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shobhit.bean.EmployBean;
import com.shobhit.dao.EmployDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployService {

	@Autowired
	EmployDao employDao;

	public void addEmploy(EmployBean employ) {
		log.info("-- addEmploy Service --");

		employDao.addEmploy(employ);
	}

	public List<EmployBean> listEmploys() {
		log.info("-- listEmploys Service --");

		return employDao.listEmploys();
	}

	public EmployBean getEmploy(int id) {
		log.info("-- getEmploy Service --");

		return employDao.getEmploy(id);
	}

	public void updateEmploy(int id, EmployBean employ) {
		log.info("-- updateEmploy Service --");

		employDao.updateEmploy(id, employ);
	}

	public void deleteEmploy(int id) {
		log.info("-- deleteEmploy Service --");

		employDao.deleteEmploy(id);
	}
}