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

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping (value = "/employ")
public class EmployController {

	@Autowired
	EmployService employService;

	@RequestMapping (value = "/", method = RequestMethod.POST)
	public Response<String> addEmploy(@RequestBody EmployBean employ) {
		log.info("-- addEmploy -- " + employ);

		employService.addEmploy(employ);

		return new Response<>(ResponseType.SUCCESS);
	}

	@RequestMapping (value = "/", method = RequestMethod.GET)
	public Response<List<EmployBean>> listEmploys() {
		log.info("-- listEmploys Controller --");

		List<EmployBean> employs = employService.listEmploys();

		return new Response<>(ResponseType.SUCCESS, employs);
	}

	@RequestMapping (value = "/{id}", method = RequestMethod.GET)
	public Response<EmployBean> getEmploy(@PathVariable int id) {
		log.info("-- getEmploy Controller -- " + id);

		EmployBean employ = employService.getEmploy(id);

		return new Response<>(ResponseType.SUCCESS, employ);
	}

	@RequestMapping (value = "/{id}", method = RequestMethod.PUT)
	public Response<String> updateEmploy(@PathVariable int id, @RequestBody EmployBean employ) {
		log.info("-- updateEmploy -- " + employ);

		employService.updateEmploy(id, employ);

		return new Response<>(ResponseType.SUCCESS);
	}

	@RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
	public Response<String> deleteEmploy(@PathVariable int id) {
		log.info("-- deleteEmploy Controller -- " + id);

		employService.deleteEmploy(id);

		return new Response<>(ResponseType.SUCCESS);
	}
}