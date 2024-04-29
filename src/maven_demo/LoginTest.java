package maven_demo;

import org.testng.annotations.Test;

import maven_demo.LoginPageUITest;

public class LoginTest extends Base {
	
	@Test(priority=0)
	public void Login_Success()
	{
		LoginPageUITest.inp_Username.sendKeys("abc@test.com");
		
		LoginPageUITest.inp_Password.sendKeys("test@123");
		
		LoginPageUITest.btn_Signin.click();
		
	}
}
