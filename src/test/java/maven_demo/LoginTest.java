package maven_demo;

import org.testng.annotations.Test;

public class LoginTest{
	
	@Test(priority=0)
	public void Login_Success()
	{
		LoginPageUITest.inp_Username.sendKeys("user1@test.com");
		
		LoginPageUITest.inp_Password.sendKeys("test@000");
		
		LoginPageUITest.btn_Signin.click();
		
	}
}
