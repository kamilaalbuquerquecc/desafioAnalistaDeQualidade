package br.com.leads2b.auxiliares;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.leads2b.jornada.Cadastro;
import br.com.leads2b.jornada.Elementos;

public class GeradorDeCNPJ {
	public Elementos e = new Elementos();
	public String url = "";
	public static WebDriver driver;
	public String cnpj = "";
	public String janela = "";
	public String janelaCnpj = "";
	public String janelaDigio = "";
	
	
	public GeradorDeCNPJ() {
		
	}
	public GeradorDeCNPJ(WebDriver driver) {
		GeradorDeCNPJ.driver = driver;
		
	}

	public void geraCNPJ(WebDriver driver, String url ) throws InterruptedException, IOException {
		GeradorDeCNPJ.driver = driver;
		
		driver = driver.switchTo().newWindow(WindowType.TAB);
		driver.get(url);
		System.out.println(url);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.btGerarCnpj)))).click();
		
		driver.findElement(By.xpath((String.valueOf(e.btGerarCnpj)))).click();
		cnpj =  driver.findElement(By.xpath((String.valueOf(e.txtCnpj)))).getText();
		
		Thread.sleep(2000);
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "GEROU_CNPJ.png");
		
		
	}
	
	
	public void fechaAbaCNPJ(WebDriver driver) throws InterruptedException {
		ArrayList<String> abas = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(abas.get(1));
		Thread.sleep(2000);
		Cadastro.driver.close();
		
	}
	
}
