package com.kvtsoft.datasource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvtsoft.datasource.dao.CustomerDAO;
import com.kvtsoft.datasource.dao.EmployeeDAO;
import com.kvtsoft.datasource.entity.Customer;
import com.kvtsoft.datasource.entity.Employee;

@Service
public class DataSourcesServiceImpl implements DataSourcesService {

	@Autowired
	private CustomerDAO customerDao;

	@Autowired
	private EmployeeDAO employeeDao;

	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

}
