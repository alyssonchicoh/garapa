package br.com.lion.garapa.template;

/**
 * DEFINE TODOS OS METODOS QUE UMA CLASSE DE TEMPLATE NECESSITA TER
 * @author alysson
 * @since 02/03/2019
 */
public interface IClassTemplate {

	/**
	 * MÉTODO PARA CRIAÇÃO DA CLASSE
	 */
	public void createClass();
	
	/**
	 * CRIA O PRE CABECALHO DA CLASSE
	 * @return O CONTEUDO DO PRE  CABECALHO
	 */
	public String createPreHeadClass();
	
	
	/**
	 * CRIA O CABECALHO DA CLASSE
	 * @return O CONTEUDO DO CABECALHO
	 */
	public String createHeadClass();
	
	/**
	 * CRIA O CORPO DA CLASSE
	 * @return O CONTEUDO DO CORPO
	 */
	public String createBodyClass();
	
	/**
	 * CRIA O FINAL DA PAGINA
	 * @return O CONTEUDO DO FINAL DA PAGINA
	 */
	public String createFotterClass();
	
}
