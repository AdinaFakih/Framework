package firstProjectApp;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest{
	
	App myapp = new App();
	
	@Test
	public void login_invalid_1() {
		Assert.assertEquals(0, myapp.userLogin("abc", "abc@123"));	//valid username, invalid pwd
	}
	
	@Test
	public void login_invalid_2() {
		Assert.assertEquals(0, myapp.userLogin("abc12", "abc123"));	//invalid username, valid pwd
	}
	
	@Test
	public void login_invalid_3() {
		Assert.assertEquals(0, myapp.userLogin("1234", "abc"));	//invalid username, invalid pwd
	}
	
	@Test
	public void login_valid_4() {
		Assert.assertEquals(1, myapp.userLogin("abc", "abc123"));	//valid username, valid pwd
	}
	
}