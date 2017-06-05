package login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import DAO.Customer;
import DAO.CustomerDAO;

@Controller
public class LoginController 
{
	@Autowired
	static CustomerDAO cust;
	
	@Autowired
	static Customer c;
	
	
	public static int id1;
	public static String name1;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String showLoginPage()
	{	
		return "login";
	}

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String handleLoginRequest(HttpServletRequest request,HttpServletResponse response)
	{
		int userid1 = 0;
		String pwd1 = "";
		String str_fname1 = "";
		String str_lname1 = "";
		int cntry1 = 0;
		String gender1 = "";
		String edu1 = "";
		
		
		if(request.getParameter("pwd")!=null)
			pwd1=request.getParameter("pwd");
		
		if(request.getParameter("userid")!=null)
			userid1=Integer.parseInt(request.getParameter("userid"));
		
		if(request.getParameter("str_fname")!=null)
			str_fname1=request.getParameter("str_fname");
		
		if(request.getParameter("str_lname")!=null)
			str_lname1=request.getParameter("str_lname");
		
		if(request.getParameter("cntry")!=null)
			cntry1=Integer.parseInt(request.getParameter("cntry"));
		
		if(request.getParameter("gender")!=null)
			gender1=request.getParameter("gender");
		
		if(request.getParameter("edu")!=null)
			edu1=request.getParameter("edu");
		
		
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:Bean.xml");
		CustomerDAO cust = (CustomerDAO)context.getBean("customerDao");
		
		Customer customer = new Customer();
		customer.setUserid(userid1);
		customer.setPwd(pwd1);
		customer.setStr_fname(str_fname1);
		customer.setStr_lname(str_lname1);
		customer.setCntry(cntry1);
		customer.setGender(gender1);
		customer.setEdu(edu1);
		
		cust.insert(customer);
		
		return "welcome";	
	}
	

}