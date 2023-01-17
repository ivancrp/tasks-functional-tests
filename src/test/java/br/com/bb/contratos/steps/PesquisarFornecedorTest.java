package br.com.bb.contratos.steps;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.qameta.allure.Allure;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;

public class PesquisarFornecedorTest {
	
	String BASE_URL = "http://localhost:3000/";
	
	
	public WebDriver acessarAplicacao() throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\bbseguro\\tasks-functional-tests\\src\\driver\\geckodriver.exe" ); 
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to(BASE_URL);
		Thread.sleep(2000);

		return driver;
	}
	
	@Test
	@DisplayName("Deve realizar uma pesquisa de fornecedor por nome")
	@Story("Pesquisa de Fornecedor")
	public void deveRealizarumaPesquisadeFornecedorPorNome () throws MalformedURLException, InterruptedException {
	
		WebDriver driver = acessarAplicacao();
				
		try {
			
			driver.get(BASE_URL);
			 Thread.sleep(1000);
		    driver.findElement(By.cssSelector("i.fa-regular.fa-user")).click();
		    driver.findElement(By.xpath("//*[@id=\"search-provider\"]")).sendKeys("Telecom");
		    driver.findElement(By.xpath("(//*[text() = \"Buscar\"])[2]")).click();
		    
		    Thread.sleep(4000);
		    
		    Allure.addAttachment("Pesquisa de Fornecedor Por Nome", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		    String msn = driver.findElement(By.xpath("//*[@id=\"result-item-0\"]/span[1]")).getText();
		    Assert.assertEquals(msn, "Telecom");
			
		} finally {
			
			driver.quit();
		}
		
	}
	
	
	@Test
	@DisplayName("Deve realizar uma pesquisa de fornecedor por CNPJ")
	@Story("Pesquisa de Fornecedor")
	public void deveRealizarumaPesquisadeFornecedorPorCNPJ () throws MalformedURLException, InterruptedException {
	
		WebDriver driver = acessarAplicacao();
				
		try {
			
			driver.get(BASE_URL);
		   // driver.findElement(By.xpath("//*[text() = \"Administrativo e Ferramentas\"]")).click();
		   // driver.findElement(By.xpath("//*[text() = \"Painel de Contratos\"]")).click();
			 Thread.sleep(1000);
		    driver.findElement(By.cssSelector("i.fa-regular.fa-user")).click();
		    driver.findElement(By.xpath("//*[@id=\"search-provider\"]")).sendKeys("92572942000162");
		    driver.findElement(By.xpath("(//*[text() = \"Buscar\"])[2]")).click();
		    Thread.sleep(4000);
		    Allure.addAttachment("Pesquisa de Fornecedor Por CNPJ", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		    String msn = driver.findElement(By.xpath("//*[@id=\"result-item-0\"]/span[1]")).getText();
		    Assert.assertEquals(msn, "Telecom");
			
		} finally {
			
			driver.quit();
		}
		
	}
	
	@Test
	@DisplayName("Deve realizar uma pesquisa de fornecedor por CNPJ com mascara")
	@Story("Pesquisa de Fornecedor")
	public void deveRealizarumaPesquisadeFornecedorPorCNPJComMascara () throws MalformedURLException, InterruptedException {
	
		WebDriver driver = acessarAplicacao();
				
		try {
			
			driver.get(BASE_URL);
		   // driver.findElement(By.xpath("//*[text() = \"Administrativo e Ferramentas\"]")).click();
		   //driver.findElement(By.xpath("//*[text() = \"Painel de Contratos\"]")).click();
			 Thread.sleep(1000);
		    driver.findElement(By.cssSelector("i.fa-regular.fa-user")).click();
		    driver.findElement(By.xpath("//*[@id=\"search-provider\"]")).sendKeys("92.572.942/0001-62");
		    driver.findElement(By.xpath("(//*[text() = \"Buscar\"])[2]")).click();
		    Thread.sleep(4000);
		    Allure.addAttachment("Pesquisa de Fornecedor Por CNPJ Com Mascara ", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		    String msn = driver.findElement(By.xpath("//*[@id=\\\"result-item-0\\\"]/span[1]")).getText();  
		    Assert.assertEquals(msn, "Telecom");
			
		} finally {
			
			driver.quit();
		}
		
	}
	
	@Test
	@DisplayName("Deve retornar Sua Busca Nao Retornou Resultados")
	@Story("Pesquisa de Fornecedor")
	public void deveRetornarSuaBuscaNaoRetornouResultados () throws MalformedURLException, InterruptedException {
	
		WebDriver driver = acessarAplicacao();
				
		try {
			
			driver.get(BASE_URL);
		   // driver.findElement(By.xpath("//*[text() = \"Administrativo e Ferramentas\"]")).click();
		   //driver.findElement(By.xpath("//*[text() = \"Painel de Contratos\"]")).click();
			 Thread.sleep(1000);
		    driver.findElement(By.cssSelector("i.fa-regular.fa-user")).click();
		    driver.findElement(By.xpath("//*[@id=\"search-provider\"]")).sendKeys("Fornecedor não Existe");
		    driver.findElement(By.xpath("(//*[text() = \"Buscar\"])[2]")).click();
		    Thread.sleep(4000);
		    Allure.addAttachment("Sua Busca Nao Retornou Resultados", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		    String msn = driver.findElement(By.xpath("//*[@id=\"results\"]/div/strong")).getText();  
		    Assert.assertEquals(msn, "Sua busca não retornou resultados.");
			
		} finally {
			
			driver.quit();
		}
		
	}
	
}
