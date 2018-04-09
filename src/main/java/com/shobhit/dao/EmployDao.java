package com.shobhit.dao;

import java.util.List;

import com.shobhit.bean.EmployBean;

public interface EmployDao {
	public void addEmploy(EmployBean employ);
	public List<EmployBean> listEmploys();
	public EmployBean getEmploy(int id);
	public void updateEmploy(EmployBean employ);
	public void deleteEmploy(int id);
}