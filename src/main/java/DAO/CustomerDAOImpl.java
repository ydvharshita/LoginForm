package DAO;

//import java.sql.Connection;
//import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAOImpl implements CustomerDAO
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	

	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
	}

	@Override
	public void insert(Customer customer)
	{
		String sql = "INSERT INTO loginform VALUES(?,?,?,?,?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,new Object[]{customer.getUserid(),customer.getPwd(),customer.getStr_fname(),customer.getStr_lname(),customer.getCntry(),customer.getGender(),customer.getEdu()});
		System.out.println("******* OOooAaahahahaha..!!! ********");
		
	}

	/*@Override
	 //Type:1 - without using spring jdbc templet
	public void insert(Customer customer) 
	{
		
		try
		{
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO cust VALUES(?,?)");
			ps.setInt(1, customer.getId());
			ps.setString(2, customer.getName());
			ps.executeUpdate();
			System.out.println("---- AAaahahahahahaha.!!! -----");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
*/	
}

