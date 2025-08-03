import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	

	public void dothis() {
		System.out.println("I am here");
		System.out.println("github");
	}

	@BeforeMethod
	public void beforeRun() {
		System.out.println("Hello test git");
		
	}
	
	@AfterMethod
	public void AfterRun() {
		System.out.println("run me last");
	}
}
