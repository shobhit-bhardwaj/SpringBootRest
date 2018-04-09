package com.shobhit.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shobhit.bean.EmployBean;

@Repository ("employDao")
public class EmployDaoImpl implements EmployDao {
	private List<EmployBean> employs = new ArrayList<>();

	@Override
	public void addEmploy(EmployBean employ) {
		System.out.println("-- addEmploy DAO --");

		employs.add(employ);
	}

	@Override
	public List<EmployBean> listEmploys() {
		System.out.println("-- listEmploys DAO --");

		return employs;
	}

	@Override
	public EmployBean getEmploy(int id) {
		System.out.println("-- getEmploy DAO --");

		for(EmployBean employ : employs)
			if(employ.getId() == id)
				return employ;

		return null;
	}

	@Override
	public void updateEmploy(EmployBean employ) {
		System.out.println("-- updateEmploy DAO --");

		for(EmployBean updateEmploy : employs)
			if(updateEmploy.getId() == employ.getId()) {
				updateEmploy.setName(employ.getName());
				updateEmploy.setDesignation(employ.getDesignation());
				updateEmploy.setSalary(employ.getSalary());
				break;
			}
	}

	@Override
	public void deleteEmploy(int id) {
		System.out.println("-- deleteEmploy DAO --");

		EmployBean deleteEmploy = null;
		for(EmployBean employ : employs)
			if(employ.getId() == id) {
				deleteEmploy = employ;
				break;
			}

		if(deleteEmploy != null)
			employs.remove(deleteEmploy);
	}
}