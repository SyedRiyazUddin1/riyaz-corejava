package com.springorm.dao;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.springorm.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	String status = "";
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	@Override
	public String insertEmployee(Employee emp) {
		Integer in = (Integer) hibernateTemplate.save(emp);
		if (in == emp.getEno()) {
			status = "SUCCESS";
		} else {
			status = "FAILURE";
		}
		return status;

	}

	@Transactional
	@Override
	public Employee searchEmployee(int eno) {
		Employee emp = (Employee) hibernateTemplate.get(Employee.class, eno);
		return emp;
	}

	@Transactional
	@Override
	public String updateEmployee(Employee emp) {
		hibernateTemplate.update(emp);
		status = "SUCCESS";

		return status;
	}

	@Transactional
	@Override
	public String deleteEmployee(int eno) {
		Employee emp = new Employee();
		emp.setEno(eno);
		hibernateTemplate.delete(emp);
		status= "SUCCESS";
		return status;
	}

}
