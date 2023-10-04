package AppUtils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import HrmLIBRARIES.LoginPage;

public class AdminUtils 
	{
		String adminid="Admin";
		String adminpwd="Qedge123!@#";
		LoginPage lp=new LoginPage();
       
		
		
		public void admLogin()
		{
			
			
			lp.login(adminid, adminpwd);
			
			
		}
		
		
		public void admlogout()
		{
			lp.adminlogout();
		}
		
		
		
		
	}

	
	
	
	
	
	
	


