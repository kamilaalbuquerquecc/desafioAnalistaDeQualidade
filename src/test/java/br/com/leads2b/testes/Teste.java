package br.com.leads2b.testes;

import java.io.IOException;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.leads2b.jornada.Base_Test;
import br.com.leads2b.jornada.Login;
import br.com.leads2b.jornada.SegmentosDoMercado;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massa.csv")

public class Teste extends Base_Test{
//colocar testes em sequencia
	//@Test
	public void testeLogin(@Param(name = "email") String email,@Param(name = "senha") String senha ) throws InterruptedException, IOException {

		Login l = new Login(driver, properties.getProperty("url.leads2b"), email, senha);
		l.login();
		Thread.sleep(2000);
		//driver.close();
	}
	@Test
	public void testeBuscaSegmentoDoMercado(@Param(name = "email") String email,@Param(name = "senha") String senha ) throws InterruptedException, IOException {

		Login l = new Login(driver, properties.getProperty("url.leads2b"), email, senha);
		l.login();
		Thread.sleep(2000);
		SegmentosDoMercado segmentodomercado = new SegmentosDoMercado(Login.driver);
		segmentodomercado.localizarSegmentosDeMercado();
		//driver.close();
	}


}
