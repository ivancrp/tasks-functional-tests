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

public class PesquisaConrtatosTest {

	String BASE_URL = "http://localhost:3000/";

	public WebDriver acessarAplicacao() throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\bbseguro\\tasks-functional-tests\\src\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to(BASE_URL);
		Thread.sleep(2000);

		return driver;
	}

	@Test
	@DisplayName("Deve retornar um contrato")
	@Story("Pesquisa de Contratos")
	public void deveRetornarUmContrato() throws Exception {

		WebDriver driver = acessarAplicacao();
		try {
			driver.get("http://localhost:3000/");
			driver.findElement(By.cssSelector("i.fa-regular.fa-file-lines")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder = \"XX.XXX.XXX/YYYY-ZZ\"]")).sendKeys("4487");
			driver.findElement(By.xpath("(//*[text() = \"Buscar\"])[2]")).click();
			Thread.sleep(4000);
			Allure.addAttachment("Pesquisa de Fornecedor Por CNPJ", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			String contrato = driver.findElement(By.cssSelector("#result-item-0 > span:nth-child(1)")).getText();
			 Assert.assertEquals(contrato, "4487");
					

		} finally {
			driver.quit();
		}

	}

	@Test
	@DisplayName("Deve Sua busca não retornou resultados.")
	@Story("Pesquisa de Contratos")
	public void naoDeveRetornarUmContrato() throws Exception {

		WebDriver driver = acessarAplicacao();
		try {
			driver.get("http://localhost:3000/");
			driver.findElement(By.cssSelector("i.fa-regular.fa-file-lines")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder = \"XX.XXX.XXX/YYYY-ZZ\"]")).sendKeys("4444");
			driver.findElement(By.xpath("(//*[text() = \"Buscar\"])[2]")).click();
			Thread.sleep(4000);
			Allure.addAttachment("Pesquisa de Fornecedor Por CNPJ", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			String contrato = driver.findElement(By.cssSelector("div.d-flex:nth-child(2) > strong:nth-child(2)")).getText();
			 Assert.assertEquals(contrato, "Sua busca não retornou resultados.");
					

		} finally {
			driver.quit();
		}

	}
}
