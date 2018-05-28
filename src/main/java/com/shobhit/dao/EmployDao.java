package com.shobhit.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shobhit.bean.EmployBean;

@Repository
public class EmployDao {
	private List<EmployBean> employs = new ArrayList<>();

	public void addEmploy(EmployBean employ) {
		System.out.println("-- addEmploy DAO --");

		employs.add(employ);
	}

	public List<EmployBean> listEmploys() {
		System.out.println("-- listEmploys DAO --");

		return employs;
	}

	public EmployBean getEmploy(int id) {
		System.out.println("-- getEmploy DAO --");

		EmployBean employBean = employs.stream().filter(employ -> employ.getId() == id).findFirst().get();
		return employBean;
	}

	public void updateEmploy(int id, EmployBean employ) {
		System.out.println("-- updateEmploy DAO --");

		for(EmployBean updateEmploy : employs)
			if(updateEmploy.getId() == id) {
				updateEmploy.setName(employ.getName());
				updateEmploy.setDesignation(employ.getDesignation());
				updateEmploy.setSalary(employ.getSalary());
				break;
			}
	}

	public void deleteEmploy(int id) {
		System.out.println("-- deleteEmploy DAO --");

		employs.removeIf(employ -> employ.getId() == id);
	}
}