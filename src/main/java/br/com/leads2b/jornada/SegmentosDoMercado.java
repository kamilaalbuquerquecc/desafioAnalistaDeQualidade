package br.com.leads2b.jornada;

import java.io.IOException;
import java.util.List;

import org.kohsuke.rngom.ast.builder.Div;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.leads2b.auxiliares.DataHoraScreen;
import br.com.leads2b.auxiliares.Screen;

public class SegmentosDoMercado {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	
	
	
	public SegmentosDoMercado(WebDriver driver) {
		SegmentosDoMercado.driver = driver;
	}
	
	public void buscarSegmentosDeMercado(int segmento, int estado, int cidade) throws InterruptedException, IOException{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(String.valueOf(e.spanBuscarSegmentoDoMercado))));
		
		driver.findElement(By.xpath(String.valueOf(e.inputSegmentosSugeridos))).click();
		driver.findElement(By.xpath(String.valueOf(e.inputSegmentosSugeridos))).click();
		driver.findElement(By.xpath(String.valueOf(e.clickSegmentosSugeridos))).click();
		
		WebElement dropdown = driver.findElement(By.xpath(String.valueOf(e.clickSegmentosSugeridos)));
		dropdown.click();
		List<WebElement> options = dropdown.findElements(By.className("pl2"));
		jse.executeScript("arguments[0].scrollIntoView(true);",options.get(segmento));
		Thread.sleep(2000);
		options.get(segmento).click();
		
		driver.findElement(By.xpath(String.valueOf(e.inputEstado))).click();
		driver.findElement(By.xpath(String.valueOf(e.clickEstado))).click();
		
		dropdown = driver.findElement(By.xpath(String.valueOf(e.clickEstado)));
		dropdown.click();
		options = dropdown.findElements(By.className("pl2"));
		jse.executeScript("arguments[0].scrollIntoView(true);",options.get(estado));
		Thread.sleep(2000);
		options.get(estado).click();
		
		driver.findElement(By.xpath(String.valueOf(e.inputCidade))).click();
		driver.findElement(By.xpath(String.valueOf(e.clickCidade))).click();
		
		dropdown = driver.findElement(By.xpath(String.valueOf(e.clickCidade)));
		System.out.println("drop" +dropdown.getText());
		dropdown.click();
		options = dropdown.findElements(By.className("pl2"));
		jse.executeScript("arguments[0].scrollIntoView(true);",options.get(cidade));
		Thread.sleep(2000);
		options.get(cidade).click();
		
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "Busca.png");
		Thread.sleep(2000);
		driver.findElement(By.xpath(String.valueOf(e.btBuscar))).click();
		
		Thread.sleep(4000);
		Screen.take(driver,  DataHoraScreen.dataHoraArquivo() + "Encontrados.png");
	}
	
	
}
