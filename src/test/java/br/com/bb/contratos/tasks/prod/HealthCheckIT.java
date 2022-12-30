package br.com.bb.contratos.tasks.prod;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HealthCheckIT {

	@Test
	@Ignore
	public void healthCheck() throws MalformedURLException, InterruptedException {
		
		/*FirefoxOptions firefoxOptions = new FirefoxOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);*/
		
		System.setProperty("webdriver.gecko.driver","C:\\bbseguro\\tasks-functional-tests\\src\\driver\\geckodriver.exe" ); 
		WebDriver driver= new FirefoxDriver();
		
		
		//*[@id="idToken1"]
		

		try {
			//driver.navigate().to("https://suporte.bbseguros.bb.com.br/suporte/");
			driver.navigate().to("https://seguridade.bb.com.br/");
			Thread.sleep(2000);
			driver.findElement(By.id("idToken1")).sendKeys("C1329564");
			driver.findElement(By.id("idToken2")).sendKeys("88678061");
			driver.findElement(By.id("loginButton_0")).click();
			Thread.sleep(3000);
			String title = driver.getTitle();
			
			Assert.assertEquals("Intranet BB Seguridade", title);


		} finally {
			driver.quit();
		}
	}
}
