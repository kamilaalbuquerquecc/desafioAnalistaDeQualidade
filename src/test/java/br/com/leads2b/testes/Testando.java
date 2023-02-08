package br.com.leads2b.testes;

import java.io.IOException;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.sped.jornada.AtivarEmpresa;
import br.com.sped.jornada.Base_Test;
import br.com.sped.jornada.Login;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massa_senhaInvalida.csv")

public class Testando extends Base_Test{

	@Test
	public void teste() {
			
	}

}
