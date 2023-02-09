package br.com.leads2b.jornada;

//Clase onde encontra todos os elemntos utilizados na automação
public class Elementos {
	
	//class Login
	public String headerLogin = "/html/body/div[1]/div[2]/div[2]/div[1]/header/p";
	public String inputEmail = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/span/div[2]/form/div[1]/span/div/input";
	public String inputPassword = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/span/div[2]/form/div[2]/span/div/div/div/input";
	public String btEntrar = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/span/div[2]/form/div[3]/button/div";
	public String headerHome= "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div/h6";
	
	//class Segmentos do Mercado
	public String spanBuscarSegmentoDoMercado = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/span";
	public String inputSegmentosSugeridos = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[1]/div/div/input";
	public String clickSegmentosSugeridos ="/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[1]/div";
	public String clickSegmentosSugeridosOptions = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[1]/div/ul";
	
	public String inputEstado= "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[2]/div/div/input";
	public String clickEstado ="/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[2]/div";
	public String clickEstadoOptions = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[2]/div/ul";
		
	public String optionSP = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[2]/div/ul/li[25]";
	public String inputCidade= "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[3]/div/div/input";
	public String clickCidade = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[3]/div";

	public String clickCidadeOptions = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[2]/div/div[3]/div/ul";
	public String btBuscar = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[4]/div/div/div[3]/button[1]";
	public String input= "";
	
	//class Empresas
	public String academia = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div/table/tbody/tr[4]/td[1]/div/div[2]";
	public String acouguesEpeixarias = "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div/table/tbody/tr[4]/td[1]/div/div[3]";
	public int idAcademia = 3;
	public int idAcougues = 4;
	public int estadoSaoPaulo = 25;
	public int cidadeSaoPaulo = 565;
	public int estadoRioDeJaneiro = 20;
	public int cidadeRioDeJaneiro = 68;
	
	public String btSalvarNoFunilDeVendas= "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div/div/div/div[1]/div/div[2]/button[2]";
	public String btVerNoFunilDeVendas= "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div/div/div/div[1]/div/div[2]/div[1]/button";
	public String btVerNegocios= "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div/div/div/div[1]/div/div[2]/div[2]/button";
	public String nomeEmpresa= "Vita Clinicas Medicina Especializada Ltda";
	
	//class Negocios
	public String btNegocios= "/html/body/div[1]/div[2]/div[1]/div[1]/div/div[2]/a[2]";
	public String headersNegocio= "/html/body/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]/h6";
	public String optionProspect= "/html/body/div[1]/div[2]/div[3]/div/div/div/div[1]";
	public String btFiltro= "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/button";

	public String statusNaoEnriquecido = "/html/body/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div/div[3]/div[1]/div";
	public String statusRecontato = "/html/body/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div/div[3]/div[2]/div";
	public String statusEnriquecido = "/html/body/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div/div[3]/div[3]/div";
	
	public String empresaNaoEnriquecido= "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div[2]/div/div[4]/div[1]/div[2]/div/div[1]";				
	public String empresaRecontato=    "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div[2]/div/div[4]/div[2]/div[2]/div/div[1]";								  
	public String empresaEnriquecido= "/html/body/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div/div[1]/div[2]/div/div[4]/div[3]/div[2]/div/div[1]";
	

}
