package mavenProject;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	@BeforeTest
	public void configFile()
	{
		System.out.println("hello");
	}
	
	@BeforeMethod
	public void  start()
	{
		System.out.println("hello");
	}

}
