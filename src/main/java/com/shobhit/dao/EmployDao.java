package com.shobhit.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shobhit.bean.EmployBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class EmployDao {
	private List<EmployBean> employs = new ArrayList<>();

	public void addEmploy(EmployBean employ) {
		log.info("-- addEmploy DAO --");

		employs.add(employ);
	}

	public List<EmployBean> listEmploys() {
		log.info("-- listEmploys DAO --");

		return employs;
	}

	public EmployBean getEmploy(int id) {
		log.info("-- getEmploy DAO --");

		EmployBean employBean = employs.stream().filter(employ -> employ.getId() == id).findFirst().get();
		return employBean;
	}

	public void updateEmploy(int id, EmployBean employ) {
		log.info("-- updateEmploy DAO --");

		for(EmployBean updateEmploy : employs)
			if(updateEmploy.getId() == id) {
				updateEmploy.setName(employ.getName());
				updateEmploy.setDesignation(employ.getDesignation());
				updateEmploy.setSalary(employ.getSalary());
				break;
			}
	}

	public void deleteEmploy(int id) {
		log.info("-- deleteEmploy DAO --");

		employs.removeIf(employ -> employ.getId() == id);
	}
}