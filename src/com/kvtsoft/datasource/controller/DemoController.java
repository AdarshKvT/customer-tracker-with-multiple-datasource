package com.kvtsoft.datasource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kvtsoft.datasource.entity.Customer;
import com.kvtsoft.datasource.entity.Employee;
import com.kvtsoft.datasource.service.DataSourcesService;

@Controller
@RequestMapping("/datasource")
public class DemoController {

	@Autowired
	private DataSourcesService dataSourcesService;

	@GetMapping("/data")
	public String getDataSource(Model theModel) {
		List<Customer> customers = dataSourcesService.getCustomers();
		List<Employee> employees = dataSourcesService.getEmployees();

		theModel.addAttribute("customers", customers);
		theModel.addAttribute("employees", employees);
		return "display-results";
	}

}
