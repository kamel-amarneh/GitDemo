import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	

	public void dothis() {
		System.out.println("I am here");
		System.out.println("github");
	}

	@BeforeMethod
	public void beforeRun() {
		System.out.println("Hello test git");
		
	}
	@Test
	public void kameltest() {
		System.out.println("run me last");
	}
	
	@AfterMethod
	public void AfterRun() {
		System.out.println("run me last");
	}
}
