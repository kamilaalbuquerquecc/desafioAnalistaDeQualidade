package br.com.leads2b.jornada;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.leads2b.auxiliares.DataHoraScreen;
import br.com.leads2b.auxiliares.Screen;

//APAGAR
public class Negocios {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;

	public Negocios(WebDriver driver) {
		Negocios.driver = driver;
	}

	public void acessarNegociosPeloMenuLateral() throws InterruptedException, IOException {

		System.out.println("Acessando Negocios pelo menu lateral");
		Thread.sleep(2000);
		driver.findElement(By.xpath((String.valueOf(e.btNegocios)))).click();
		Thread.sleep(2000);

		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "Tela_Negocios.png");
	}

	public void mostarFunilDeVendas() throws InterruptedException, IOException {

		System.out.println("Filtar para mostrar Funil de Vendas");
		driver.findElement(By.xpath((String.valueOf(e.btFiltro)))).click();
		driver.findElement(By.xpath((String.valueOf(e.optionProspect)))).click();

		Thread.sleep(2000);
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "EmpresasPotencial.png");
	}

	public void alterarStatus(String empresa, String novoStatus) throws InterruptedException, IOException {
		System.out.println("Alterar status da empresa");
		Thread.sleep(2000); 
		driver.findElement(By.xpath((String.valueOf(empresa)))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath((String.valueOf(novoStatus)))).click();
		Thread.sleep(2000);
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "EmpresasPotencial.png");
		
		driver.navigate().back();
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "Tela_Funil_De_Vendas.png");
		
	}

}
