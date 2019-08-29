package com.spring.DA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.JdbcTemplate;
public class EmployeeeDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	/*
	 * Query for int public int getTotalEmployees() { //int
	 * totalEmployees=jdbcTemplate.queryForInt("select count(*) from employee"); int
	 * totalEmployees=jdbcTemplate.queryForObject("select count(*) from employee",
	 * Integer.class); return totalEmployees; }
	 */

	/*
	 * Query for Spcific Value
	 * 
	 * public int getTotalEmployees(final int ID) { int totalEmployees=jdbcTemplate.
	 * queryForObject("select count(*) from employee WHERE ID=?",new Object[] {ID},
	 * Integer.class); return totalEmployees; }
	 */
	
	
	/*Query for String
	 * public int getTotalEmployees(String name) { int totalEmployees=jdbcTemplate.
	 * queryForObject("select count(*) from employee WHERE NAME=?",new Object[]
	 * {name}, Integer.class); return totalEmployees; }
	 */		 
	
	//Query For Multiple Object
	public List<Map<String,Object>> getAllEmployees(){
		List<Map<String, Object>> employees = jdbcTemplate.queryForList("select * from employee", new RowMapper() {
			public Object mapRow(ResultSet rs,int rowNum)
			{
				System.out.println("Row Number =" +rowNum);
				Employee employee=new Employee();
				try {
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				}
				catch(SQLException e) {
					System.out.println(e);
				}
				return employee;
			}

			@Override
			public int[] getRowsForPaths(TreePath[] path) {
				// TODO Auto-generated method stub
				return null;
			}
		});
				return employees;	
		}
}
