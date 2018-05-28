package com.shobhit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shobhit.bean.EmployBean;
import com.shobhit.common.Response;
import com.shobhit.common.ResponseType;
import com.shobhit.service.EmployService;

@RestController
@RequestMapping (value = "/employ")
public class EmployController {

	@Autowired
	EmployService employService;

	@RequestMapping (value = "/", method = RequestMethod.POST)
	public Response<String> addEmploy(@RequestBody EmployBean employ) {
		System.out.println("-- addEmploy -- " + employ);

		employService.addEmploy(employ);

		return new Response<>(ResponseType.SUCCESS);
	}

	@RequestMapping (value = "/", method = RequestMethod.GET)
	public Response<List<EmployBean>> listEmploys() {
		System.out.println("-- listEmploys Controller --");

		List<EmployBean> employs = employService.listEmploys();

		return new Response<>(ResponseType.SUCCESS, employs);
	}

	@RequestMapping (value = "/{id}", method = RequestMethod.GET)
	public Response<EmployBean> getEmploy(@PathVariable int id) {
		System.out.println("-- getEmploy Controller -- " + id);

		EmployBean employ = employService.getEmploy(id);

		return new Response<>(ResponseType.SUCCESS, employ);
	}

	@RequestMapping (value = "/{id}", method = RequestMethod.PUT)
	public Response<String> updateEmploy(@PathVariable int id, @RequestBody EmployBean employ) {
		System.out.println("-- updateEmploy -- " + employ);

		employService.updateEmploy(id, employ);

		return new Response<>(ResponseType.SUCCESS);
	}

	@RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
	public Response<String> deleteEmploy(@PathVariable int id) {
		System.out.println("-- deleteEmploy Controller -- " + id);

		employService.deleteEmploy(id);

		return new Response<>(ResponseType.SUCCESS);
	}
}