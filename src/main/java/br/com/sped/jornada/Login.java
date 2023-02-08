package br.com.sped.jornada;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.sped.auxiliares.DataHoraScreen;
import br.com.sped.auxiliares.Screen;

public class Login {

	Elementos e = new Elementos();
	public static WebDriver driver;
	public static String url;
	public String emailAdmin = "";
	public String senhaAdmin = "";
	public String janela = "";

	public Login() {

	}

	public Login(WebDriver driver, String url, String emailAdmin, String senhaAdmin) {
		Login.driver = driver;
		this.url = url;
		this.emailAdmin = emailAdmin;
		this.senhaAdmin = senhaAdmin;
	}

	
		
}
