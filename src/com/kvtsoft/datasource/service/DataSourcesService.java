package com.kvtsoft.datasource.service;

import java.util.List;

import com.kvtsoft.datasource.entity.Customer;
import com.kvtsoft.datasource.entity.Employee;

public interface DataSourcesService {

	public List<Customer> getCustomers();

	public List<Employee> getEmployees();
}
