package br.com.leads2b.jornada;

import java.io.IOException;

import org.easetech.easytest.annotation.Param;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.leads2b.auxiliares.DataHoraScreen;
import br.com.leads2b.auxiliares.Screen;

public class Empresas {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;

	public Empresas(WebDriver driver) {
		Empresas.driver = driver;
	}

	public void selecionarEmpresa() throws InterruptedException, IOException {

		System.out.println("Escolher empresa");
		driver.findElement(By.xpath(String.valueOf(e.academia))).click();
		Thread.sleep(3000);
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "Empresa.png");
	}

	public void salvarEmpresa()  throws InterruptedException, IOException{
		System.out.println("Salvar Empresa");
		driver.findElement(By.xpath(String.valueOf(e.btSalvarNoFunilDeVendas))).click();

		Thread.sleep(3000);
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "EmpresaSalva.png");
	}

	public void verFunildeVendas()  throws InterruptedException, IOException{
		System.out.println("Visualizar Funil de Vendas");
		driver.findElement(By.xpath(String.valueOf(e.btVerNoFunilDeVendas))).click();

		Thread.sleep(3000);
		Screen.take(driver, DataHoraScreen.dataHoraArquivo() + "Negocios_FunilDeVendas.png");
	
	}

}
