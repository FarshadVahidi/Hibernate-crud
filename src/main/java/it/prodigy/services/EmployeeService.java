package it.prodigy.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import it.prodigy.entity.Employee;
import it.prodigy.util.HibernateUtil;

@Service
public class EmployeeService {
	
	public void saveEmployee(Employee employee) {
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			session.save(employee);
			
			transaction.commit();
		}catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
		}
		
	}
	
	public void updateEmployee(Employee employee) {
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			session.saveOrUpdate(employee);
			
			transaction.commit();
		}catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
		}
		
	}
	
	public Employee getEmployeeById(Integer id) {
		Transaction transaction = null;
		Employee employee = new Employee();
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			employee = session.get(Employee.class, id);
			//employee = session.load(Employee.class, id);
			
			transaction.commit();
		}catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
		}
		return employee;
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		Transaction transaction = null;
		List<Employee> employees = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			employees = session.createQuery("from Employee").list();
			
			transaction.commit();
		}catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
		}
		return employees;
	}
	
	public void deletsEmployee(Integer id) {
		Transaction transaction = null;
		Employee employee = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			employee = getEmployeeById(id);
			
			session.delete(employee);
			
			transaction.commit();
		}catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}

}
