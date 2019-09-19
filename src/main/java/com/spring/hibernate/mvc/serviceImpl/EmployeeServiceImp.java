
  package com.spring.hibernate.mvc.serviceImpl;
  
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.mvc.bean.Employee;
import com.spring.hibernate.mvc.dao.EmployeeDao;
import
  com.spring.hibernate.mvc.service.EmployeeService;

@Service
  public class EmployeeServiceImp implements EmployeeService {
  
	  @Autowired 
	  private EmployeeDao EmployeeDao;
  
	  public Employee addEmployee(Employee employee) { 
		Employee e =  EmployeeDao.save(employee) ;
		return e;
	  }

	@Override
	public Employee save(Employee employee) {
			Employee e =  EmployeeDao.save(employee) ;
			return e;
	}

	
	/*
	 * //To Check the gretter then salary
	 * 
	 * @Override public void gtEmployees(Double salary) { Session
	 * session=sessionFactory.openSession(); Criteria
	 * cr=session.createCriteria(Employee.class);
	 * cr.add(Restrictions.gt("SALARY",salary)); List employees = cr.list();
	 * Iterator it=employees.iterator(); while(it.hasNext()) { Employee
	 * employee=(Employee)it.next(); System.out.println(employee); } }
	 * 
	 * 
	 * public void deleteEmployee(Integer EmployeeID) { Session
	 * session=sessionFactory.openSession(); Transaction tx=null;
	 * 
	 * try { tx=session.beginTransaction();
	 * 
	 * Employee employee=(Employee)session.get(Employee.class, EmployeeID);
	 * System.out.println(employee); session.delete(employee);
	 * 
	 * 
	 * 
	 * tx.commit();
	 * 
	 * } catch (HibernateException e) {
	 * 
	 * if(tx!=null) tx.rollback(); //System.out.println(e); } finally {
	 * session.close(); } }
	 * 
	 * 
	 * 
	 * //To Check the less then salary public void ltEmployees(Double salary) {
	 * Session session=sessionFactory.openSession(); Criteria
	 * cr=session.createCriteria(Employee.class);
	 * cr.add(Restrictions.lt("SALARY",salary)); List employees = cr.list();
	 * Iterator it=employees.iterator(); while(it.hasNext()) { Employee
	 * employee=(Employee)it.next(); System.out.println(employee); } }
	 * 
	 * 
	 * public Employee getEmployee(Integer id) {
	 * 
	 * Session session=sessionFactory.openSession(); Transaction tx=null; Employee
	 * emp=null; try { tx=session.beginTransaction();
	 * emp=(Employee)session.get(Employee.class, id); System.out.println(emp);
	 * tx.commit(); } catch(HibernateException e) { if(tx!=null) tx.rollback();
	 * System.out.println(e); } finally { session.close(); } return emp; }
	 */

}
 