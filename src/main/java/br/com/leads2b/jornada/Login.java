package br.com.leads2b.jornada;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.leads2b.auxiliares.DataHoraScreen;
import br.com.leads2b.auxiliares.Screen;
import br.com.leads2b.jornada.Login;
import junit.framework.Assert;

public class Login {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	public String email = "";
	public String password = "";

	public Login() {

	}

	public Login(WebDriver driver, String url, String email, String password) {
		Login.driver = driver;
		this.url = url;
		this.email = email;
		this.password = password;
	}
	public void login( ) throws IOException, InterruptedException {
	
		System.out.println("Fazendo login no sistema Leads2b");
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(2000);	
		Assert.assertEquals("Olá, que bom que você voltou!",driver.findElement(By.xpath((String.valueOf(e.headerLogin)))).getText());
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "Login_Leads2b.png");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath((String.valueOf(e.inputEmail)))).sendKeys(email);
		driver.findElement(By.xpath((String.valueOf(e.inputPassword)))).sendKeys(password);
		
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "Login_Leads2b_com_credenciais.png");
		
		driver.findElement(By.xpath((String.valueOf(e.btEntrar)))).click();
		
		Assert.assertEquals("Esta é sua página inicial, o lugar onde você vê as principais ferramentas e maneiras de encontrar seu próximo cliente"
				,driver.findElement(By.xpath((String.valueOf(e.headerHome)))).getText());	
	}

	
		
}
