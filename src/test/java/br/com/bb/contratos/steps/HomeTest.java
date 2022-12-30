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

public class HomeTest {
	//adcionar novo Submenu
	
	//String BASE_URL = "http://localhost:3000/";
	String BASE_URL = "http://localhost:3000/";
	public WebDriver acessarAplicacao() throws MalformedURLException, InterruptedException {

		
		/*
		 * DesiredCapabilities cap = DesiredCapabilities.chrome(); WebDriver driver =
		 * new RemoteWebDriver(new URL("http://192.168.1.142:4444/wd/hub"), cap);
		 * driver.navigate().to("http://192.168.1.142:8001/tasks/");
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); return
		 * driver;
		 */
		
		System.setProperty("webdriver.gecko.driver","C:\\bbseguro\\tasks-functional-tests\\src\\driver\\geckodriver.exe" ); 
		WebDriver driver= new FirefoxDriver();
		
		driver.navigate().to(BASE_URL);
		Thread.sleep(2000);
		//driver.findElement(By.id("idToken1")).sendKeys("C1329564");
		//driver.findElement(By.id("idToken2")).sendKeys("88678061");
		//driver.findElement(By.id("loginButton_0")).click();
		
		return driver;
	}

	@Test
	
	public void deveValidarMenuAdministrativoEFerramentas() throws MalformedURLException, InterruptedException {
		
		WebDriver driver = acessarAplicacao();
		
		
		try {
			
			Thread.sleep(1000);
		
			  driver.findElement(By.id("dropdown0")).click();
			Thread.sleep(2000);
			
			String menuChat = driver.findElement(By.linkText("Chatbot BB Seguros")).getText();
			Assert.assertEquals("Chatbot BB Seguros", menuChat);
		
			String menuEmailNotes = driver.findElement(By.linkText("E-mail Correio Notes")).getText();
			Assert.assertEquals("E-mail Correio Notes", menuEmailNotes);
			
			String menuEmailOutlook = driver.findElement(By.linkText("E-mail Outlook")).getText();
			Assert.assertEquals("E-mail Outlook", menuEmailOutlook);
			
			String menugestaDeAcesso = driver.findElement(By.linkText("Gestão de acessos")).getText();
			Assert.assertEquals("Gestão de acessos", menugestaDeAcesso);
			
			String menuGLPI = driver.findElement(By.linkText("GLPI - Gestão de TI e suporte")).getText();
			Assert.assertEquals("GLPI - Gestão de TI e suporte", menuGLPI);
			
			String menuIntraBB = driver.findElement(By.linkText("Intranet BB")).getText();
			Assert.assertEquals("Intranet BB", menuIntraBB);
			
			String menuModeloDocumentos = driver.findElement(By.linkText("Modelos de documentos")).getText();
			Assert.assertEquals("Modelos de documentos", menuModeloDocumentos);
			
			String menuNumeracaoDocumento = driver.findElement(By.linkText("Numeração de Documentos")).getText();
			Assert.assertEquals("Numeração de Documentos", menuNumeracaoDocumento);
			
			String menuPainelAusencia = driver.findElement(By.linkText("Painel de Ausências")).getText();
			Assert.assertEquals("Painel de Ausências", menuPainelAusencia);
			
			String menuPortalAdministrativo = driver.findElement(By.linkText("Portal Administrativo")).getText();
			Assert.assertEquals("Portal Administrativo", menuPortalAdministrativo);
			
			String menuResevaSalas = driver.findElement(By.linkText("Reserva de salas")).getText();
			Assert.assertEquals("Reserva de salas", menuResevaSalas);
			
			String menuSuporteTIBBSeguro = driver.findElement(By.linkText("Suporte de TI BB Seguros")).getText();
			Assert.assertEquals("Suporte de TI BB Seguros", menuSuporteTIBBSeguro);
			
			String menuPaineldeContratos = driver.findElement(By.linkText("Painel de Contratos")).getText();
			Assert.assertEquals("Painel de Contratos", menuPaineldeContratos);
			Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			
			
		} finally {			
			//fechar o browser
			driver.quit();
		}
	}
	
	@Test
	public void deveValidarMenuEstrategia() throws MalformedURLException, InterruptedException {
	
		WebDriver driver = acessarAplicacao();
		
		try {
			Thread.sleep(6000);
			
			   driver.findElement(By.id("dropdown1")).click();
			Thread.sleep(2000);
			
			String menuCadeiaValor  = driver.findElement(By.linkText("Cadeia de valor")).getText();
			Assert.assertEquals("Cadeia de valor", menuCadeiaValor);
			
			String menuEstruturaOrganizacional = driver.findElement(By.linkText("Estrutura Organizacional")).getText();
			Assert.assertEquals("Estrutura Organizacional", menuEstruturaOrganizacional);
			
			String menuForumSemanal = driver.findElement(By.linkText("Fórum semanal de tecnologia")).getText();
			Assert.assertEquals("Fórum semanal de tecnologia", menuForumSemanal);
			
			String menuGameCopa = driver.findElement(By.linkText("Game Copa do Mundo")).getText();
			Assert.assertEquals("Game Copa do Mundo", menuGameCopa);
	
			String menuGestaoDemanda = driver.findElement(By.linkText("Gestão de demandas")).getText();
			Assert.assertEquals("Gestão de demandas", menuGestaoDemanda);
			
			String menuKanboard = driver.findElement(By.linkText("Kanboard")).getText();
			Assert.assertEquals("Kanboard", menuKanboard);
			
			
			String menuNormativosPolitica = driver.findElement(By.linkText("Normativos e Políticas")).getText();
			Assert.assertEquals("Normativos e Políticas", menuNormativosPolitica);
			
			String menuPlaner = driver.findElement(By.linkText("Planner - Painéis Kanban")).getText();
			Assert.assertEquals("Planner - Painéis Kanban", menuPlaner);
			
			String menuPlanosTransicao = driver.findElement(By.linkText("Planos de transição de processos")).getText();
			Assert.assertEquals("Planos de transição de processos", menuPlanosTransicao);
			
			String menuZenite = driver.findElement(By.linkText("Zênite")).getText();
			Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			Assert.assertEquals("Zênite", menuZenite);

			
		} finally {			
			//fechar o browser
			driver.quit();
		}
				
	}

	@Test
	public void deveValidarMenuFinançasRI() throws MalformedURLException, InterruptedException {
		
		WebDriver driver = acessarAplicacao();
		
		
		try {
			Thread.sleep(6000);
			driver.findElement(By.id("dropdown2")).click();
			Thread.sleep(2000);
			
			String menuAcompanhamentoDespesas = driver.findElement(By.linkText("Acompanhamento de despesas")).getText();
			Assert.assertEquals("Acompanhamento de despesas", menuAcompanhamentoDespesas);
			
			String menuDemostracoesContabeis = driver.findElement(By.linkText("Demonstrações contábeis")).getText();
			Assert.assertEquals("Demonstrações contábeis", menuDemostracoesContabeis);
			
			String menuNegociacaoValoresMobiliarios =driver.findElement(By.linkText("Negociação com valores mobiliários")).getText();
			Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			Assert.assertEquals("Negociação com valores mobiliários", menuNegociacaoValoresMobiliarios);

		} finally {
			driver.quit();
		}
		
		
	}
	
	@Test
	public void deveValidarGovernaca() throws MalformedURLException, InterruptedException {
		
		WebDriver driver = acessarAplicacao();
		
		
		try {
			Thread.sleep(6000);
			   driver.findElement(By.id("dropdown3")).click();
			Thread.sleep(2000);
			
			String menuAssistenteIdentificacaoRisco = driver.findElement(By.linkText("Assistente para identificação de riscos")).getText();
			Assert.assertEquals("Assistente para identificação de riscos", menuAssistenteIdentificacaoRisco);
			
			String menuAuditoriaIntranet = driver.findElement(By.linkText("Auditoria Interna")).getText();
			Assert.assertEquals("Auditoria Interna", menuAuditoriaIntranet);
			
			String menuCanalEticaIntegridade = driver.findElement(By.linkText("Canal de Ética e Integridade")).getText();
			Assert.assertEquals("Canal de Ética e Integridade", menuCanalEticaIntegridade);
			
			String menuCanalEticaConduta = driver.findElement(By.linkText("Código de Ética e Conduta")).getText();
			Assert.assertEquals("Código de Ética e Conduta", menuCanalEticaConduta);
			
			String menuComposicaoCoselhoComiterDiretoria = driver.findElement(By.linkText("Composição de Conselhos, Comitês e Diretorias")).getText();
			Assert.assertEquals("Composição de Conselhos, Comitês e Diretorias", menuComposicaoCoselhoComiterDiretoria);
			
			String menuDocumentosCorporativos = driver.findElement(By.linkText("Documentos corporativos")).getText();
			Assert.assertEquals("Documentos corporativos", menuDocumentosCorporativos);
			
			String menuInventarioAtivos = driver.findElement(By.linkText("Inventário de ativos da informação")).getText();
			Assert.assertEquals("Inventário de ativos da informação", menuInventarioAtivos);
			
			String menuLGPD = driver.findElement(By.linkText("LGPD - Relatório de transparência")).getText();
			Assert.assertEquals("LGPD - Relatório de transparência", menuLGPD);
			
			String menuPortalSuperitendencia = driver.findElement(By.linkText("Portal Superintendência Jurídica")).getText();
			Assert.assertEquals("Portal Superintendência Jurídica", menuPortalSuperitendencia);
			
			String menuPortalSUPEX = driver.findElement(By.linkText("Portal SUPEX GRC")).getText();
			Assert.assertEquals("Portal SUPEX GRC", menuPortalSUPEX);
			
			String menuProgramaIntegridade = driver.findElement(By.linkText("Programa de Integridade")).getText();
			Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			Assert.assertEquals("Programa de Integridade", menuProgramaIntegridade);
			

		} finally {
			driver.quit();
		}
		
		
	}
	
	@Test
	public void deveValidarMenuNegocios() throws MalformedURLException, InterruptedException {
	
		WebDriver driver = acessarAplicacao();
		
		
		try {
			Thread.sleep(6000);
			  driver.findElement(By.id("dropdown4")).click();
			Thread.sleep(2000);
			
			String menuManualAplicacao = driver.findElement(By.linkText("Manual de aplicação da marca BB Seguros")).getText();
			Assert.assertEquals("Manual de aplicação da marca BB Seguros", menuManualAplicacao);
		
			String menuNegocioDigitais = driver.findElement(By.linkText("Negócios Digitais")).getText();
			Assert.assertEquals("Negócios Digitais", menuNegocioDigitais);
			
			String menuPGVisaoDiretoriaExecutante = driver.findElement(By.linkText("Painel de Gestão - Visão Diretoria Executante")).getText();
			Assert.assertEquals("Painel de Gestão - Visão Diretoria Executante", menuPGVisaoDiretoriaExecutante);
			
			String menuPGVisaoMensal = driver.findElement(By.linkText("Painel de Gestão - Visão Mensal")).getText();
			Assert.assertEquals("Painel de Gestão - Visão Mensal", menuPGVisaoMensal);
			
			String menuPainelVendasOnline = driver.findElement(By.linkText("Painel de Vendas Online")).getText();
			Assert.assertEquals("Painel de Vendas Online", menuPainelVendasOnline);
			
			String menuPitchDecks = driver.findElement(By.linkText("Pitch decks")).getText();
			Assert.assertEquals("Pitch decks", menuPitchDecks);
			
			String menuPitflowCadastro = driver.findElement(By.linkText("Pitflow - Cadastro e priorização de ideias")).getText();
			Assert.assertEquals("Pitflow - Cadastro e priorização de ideias", menuPitflowCadastro);
			
			String menuPlataformaMaetro = driver.findElement(By.linkText("Plataforma Maestro")).getText();
			Assert.assertEquals("Plataforma Maestro", menuPlataformaMaetro);
			
			String menuPortalAnalytics = driver.findElement(By.linkText("Portal de Analytics")).getText();
			Assert.assertEquals("Portal de Analytics", menuPortalAnalytics);
			
			String menuRankingMercado = driver.findElement(By.linkText("Ranking de Mercado")).getText();
			Assert.assertEquals("Ranking de Mercado", menuRankingMercado);
			
			String menuSiteDesenvolvimentoNegocios = driver.findElement(By.linkText("Site - Desenvolvimento de Negócios")).getText();
			Assert.assertEquals("Site - Desenvolvimento de Negócios", menuSiteDesenvolvimentoNegocios);
			
			String menuVendasDiarias = driver.findElement(By.linkText("Vendas diárias BB Seguros")).getText();
			Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			Assert.assertEquals("Vendas diárias BB Seguros", menuVendasDiarias);
				

		} finally {
			driver.quit();
		}
	}
	
	@Test
	public void deveValidarMenuVidaCarreira() throws MalformedURLException, InterruptedException{
		
		WebDriver driver = acessarAplicacao();
		
		
		try {
			Thread.sleep(6000);
			driver.findElement(By.id("dropdown5")).click();
			Thread.sleep(2000);
			
			String menuElofy = driver.findElement(By.linkText("Elofy - Estratégia e Gestão")).getText();
			Assert.assertEquals("Elofy - Estratégia e Gestão", menuElofy);
			
			String menuGenteGestao = driver.findElement(By.linkText("Gente e Gestão")).getText();
			Assert.assertEquals("Gente e Gestão", menuGenteGestao);
			
			String menuHumanogramaBB = driver.findElement(By.linkText("Humanograma BB")).getText();
			Assert.assertEquals("Humanograma BB", menuHumanogramaBB);
			
			String menuYammer = driver.findElement(By.linkText("Yammer")).getText();
			Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			Assert.assertEquals("Yammer", menuYammer);

		} finally {
			driver.quit();
		}
	}

}
