package com.kvtsoft.datasource.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kvtsoft.datasource.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	@Qualifier("employeeSessionFactory")
	private SessionFactory sessionFactory;

	@Override
	@Transactional("employeeTransactionManager")
	public List<Employee> getEmployees() {
		Session session = sessionFactory.getCurrentSession();
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		List<Employee> employees = query.getResultList();
		return employees;
	}

}
