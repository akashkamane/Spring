package com.demo.dao;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.employeeService;
import com.demo.bean.Employee;





@Repository
public class ManageEmployee implements employeeService {
	@Autowired
	private static SessionFactory sessionFactory;
	public static void main(String[] args) {
		
		  try { sessionFactory = new Configuration().configure().buildSessionFactory();
		  } catch (Throwable ex) {
		  System.err.println("Failed to create sessionFactory object." + ex); throw new
		  ExceptionInInitializerError(ex); }
		 
		
		/*
		 * try { //sessionFactory = new
		 * AnnotationConfiguration().configure().addPackage("com.demo").
		 * addAnnotatedClass(Employee.class).buildSessionFactory(); sessionFactory=new
		 * Configuration().configure().addAnnotatedClass(Employee.class).
		 * buildSessionFactory();
		 * 
		 * //Configuration con=new
		 * Configuration().configure().addAnnotatedClass(Employee.class);
		 * 
		 * //ServiceRegistry reg=new
		 * ServiceRegistryBuilder().applySettings(con.getProperties()).
		 * buildServiceRegistry();
		 * 
		 * // sessionFactory=con.buildSessionFactory(); } catch (Throwable ex) {
		 * System.err.println("Failed to create sessionFactory object." + ex); throw new
		 * ExceptionInInitializerError(ex); }
		 */
	      
	      ManageEmployee me = new ManageEmployee();

	      
	      //CRUD
	      
	      
	      Employee employee1=new Employee("Shweta","Pawar",130000);
	       Integer id1=me.addEmployee(employee1);
	      
	      Employee employee2=new Employee("Akash","kamane",130000);
	      Integer id2=me.addEmployee(employee2);
	      System.out.println(id1);
	      
	      
	      //Integer id3=me.addEmployee(new Employee("Deven","Kenny",130000));
	      	      
	      
	      //Employee e=me.getEmployee(id3);
	      //System.out.println("Got Employee "+e);
	      
	      //Employee e1=me.loadEmployee(id1);
	      //System.out.println("loadEmployee"+employee1);
	      
	     // me.getEmployees();
	      
	     // me.updateEmployee(1,220000);
	      
	      //me.deleteEmployee(id3);
	      
	   // Unidirection and crude methods.....................	
			
		/*
		 * HashSet<MCertificate> certificate = new HashSet(); certificate.add(new
		 * MCertificate("java")); certificate.add(new MCertificate("spring"));
		 * //Employee e = new Employee(1, "Akash","kamane",130000,certificate);
		 * //Integer id1= me.addCertificate(new MCertificate("BSC",e)); Integer id1 =
		 * me.addEmployee(new Employee(1,"Akash","kamane",130000,certificate));
		 * System.out.println(id1);
		 * 
		 */
			
	      
	}
	      
	      
	private void deleteEmployee(Integer EmployeeID) {
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			
				Employee employee=(Employee)session.get(Employee.class, EmployeeID);
				System.out.println(employee);
				session.delete(employee);
						
						
			
			tx.commit();
			
		} catch (HibernateException e) {

			if(tx!=null)
				tx.rollback();
			//System.out.println(e);
		}
		finally {
			session.close();
		}
		
	}
	
	/*
	 * public Integer addCertificate(MCertificate certificate) { Session session =
	 * sessionFactory.openSession(); Transaction tx = null; Integer i=null; try { tx
	 * = session.beginTransaction(); i = (Integer)session.save(certificate);
	 * tx.commit(); } catch(Exception e) { if(tx!=null) tx.rollback();
	 * System.out.println(e.getMessage()); } finally { session.close(); } return i;
	 * }
	 */


	private void updateEmployee(Integer employeeID, int salary) {
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			
				Employee employee=(Employee)session.get(Employee.class, employeeID);
				employee.setSalary(salary);
				session.update(employee);
						
						System.out.println(employee);
			
			tx.commit();
			
		} catch (HibernateException e) {

			if(tx!=null)
				tx.rollback();
			//System.out.println(e);
		}
		finally {
			session.close();
		}
		
	}


	public void getEmployees() {
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			List employees=session.createQuery("FROM Employee").list();
			Iterator it=employees.iterator();
			while(it.hasNext()) {
				Employee employee=(Employee)it.next();
				System.out.println(employee);
			}
			tx.commit();
			
		} catch (HibernateException e) {

			if(tx!=null)
				tx.rollback();
			System.out.println(e);
		}
		finally {
			session.close();
		}
		
	}


	public Integer addEmployee(Employee employee) {
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		Integer id=null;
		try {
			tx=session.beginTransaction();
			Serializable s=session.save(employee);
			id=(Integer)s;
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx!=null)
				tx.rollback();
			System.out.println(e);
		}
		finally {
			session.close();
		}
		return id;
			
		}
	
	public Employee getEmployee(Integer id) {
		
			Session session=sessionFactory.openSession();
			Transaction tx=null;
			Employee emp=null;
			try {
				tx=session.beginTransaction();
				emp=(Employee)session.get(Employee.class, id);
				tx.commit();	
			}
			catch(HibernateException e) {
				if(tx!=null)
					tx.rollback();
				System.out.println(e);
			}
			finally {
				session.close();
			}
			return emp;
		}
		
		
		public Employee loadEmployee(Integer id)
		{
			Session session=sessionFactory.openSession();
			Transaction tx=null;
			Employee employee=null;
			try {
				tx=session.beginTransaction();
				employee=(Employee)session.load(Employee.class,id);
				System.out.println("Inside loadEmployee"+employee);
				tx.commit();
			}
			catch(HibernateException e){
				if(tx!=null)
					tx.rollback();
				System.out.println(e);
			}
			finally {
				session.close();
			}
			return employee;
		}
		
	
		
		
	}
	
	   
	   
	   
	