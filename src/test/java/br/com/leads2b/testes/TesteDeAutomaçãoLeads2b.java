package br.com.leads2b.testes;

import java.io.IOException;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.leads2b.jornada.Base_Test;
import br.com.leads2b.jornada.Elementos;
import br.com.leads2b.jornada.Empresas;
import br.com.leads2b.jornada.Login;
import br.com.leads2b.jornada.Negocios;
import br.com.leads2b.jornada.SegmentosDoMercado;


@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "massa.csv")

public class TesteDeAutomaçãoLeads2b extends Base_Test{
//colocar testes em sequencia
	
	//Criar Assertes

	Elementos e = new Elementos();
	
	@Test
	public void testeSalvarEmpresa(@Param(name = "email") String email,@Param(name = "senha") String senha ) 
			throws InterruptedException, IOException {
		
		login(email,senha);
		int segmento = e.idAcougues;
		int estado = e.estadoRioDeJaneiro;
		int cidade = e.estadoRioDeJaneiro;
		buscaSegmentoDoMercado(segmento,estado,cidade);
		
		Empresas empresa = new Empresas(SegmentosDoMercado.driver);
		empresa.selecionarEmpresa();
		empresa.salvarEmpresa();
		
	}
	@Test
	public void testeSalvarEmpresaEVisualizarFunilDeVendas(@Param(name = "email") String email,@Param(name = "senha") String senha ) 
			throws InterruptedException, IOException {
		
		login(email,senha);
		int segmento = e.idAcougues;
		int estado = e.estadoSaoPaulo;
		int cidade = e.cidadeSaoPaulo;
		buscaSegmentoDoMercado(segmento,estado,cidade);
		
		Empresas empresa = new Empresas(SegmentosDoMercado.driver);
		empresa.selecionarEmpresa();
		empresa.salvarEmpresa();
		empresa.verFunildeVendas();
		
		
	}
	@Test
	public void testeVisualizarFunilDeVendasPeloMenuLateral(@Param(name = "email") String email,@Param(name = "senha") String senha ) 
			throws InterruptedException, IOException {
		
		login(email,senha);
		
		Negocios negocios = new Negocios(Login.driver);
		negocios.acessarNegociosPeloMenuLateral();
		negocios.mostarFunilDeVendas();
		
	}
	@Test
	public void testeAlterarStatusDaEmpresaNãoEnriquecidoParaRecontato(@Param(name = "email") String email,@Param(name = "senha") String senha ) 
			throws InterruptedException, IOException {
		
		login(email,senha);
		
		Negocios negocios = new Negocios(Login.driver);
		negocios.acessarNegociosPeloMenuLateral();
		negocios.mostarFunilDeVendas();
		negocios.alterarStatus(e.empresaNaoEnriquecido,e.statusRecontato);
		
	}
	@Test
	public void testeAlterarStatusDaEmpresaNãoEnriquecidoParaEnriquecido(@Param(name = "email") String email,@Param(name = "senha") String senha ) 
			throws InterruptedException, IOException {
		
		login(email,senha);
		
		Negocios negocios = new Negocios(Login.driver);
		negocios.acessarNegociosPeloMenuLateral();
		negocios.mostarFunilDeVendas();
		negocios.alterarStatus(e.empresaNaoEnriquecido,e.statusEnriquecido);
		
	}
	@Test
	public void testeAlterarStatusDaEmpresaEnriquecidoParaNãoEnriquecido(@Param(name = "email") String email,@Param(name = "senha") String senha ) 
			throws InterruptedException, IOException {
		
		login(email,senha);
		
		Negocios negocios = new Negocios(Login.driver);
		negocios.acessarNegociosPeloMenuLateral();
		negocios.mostarFunilDeVendas();
		negocios.alterarStatus(e.empresaEnriquecido,e.statusNaoEnriquecido);
		
	}
	
	public void login(String email, String senha) throws InterruptedException, IOException  {
		Login l = new Login(driver, properties.getProperty("url.leads2b"), email, senha);
		l.login();
		Thread.sleep(2000);
	}
	public void buscaSegmentoDoMercado(int segmento, int estado, int cidade) throws InterruptedException, IOException  {
		
		SegmentosDoMercado segmentodomercado = new SegmentosDoMercado(Login.driver);
		segmentodomercado.buscarSegmentosDeMercado(segmento,estado,cidade);
	}


}
