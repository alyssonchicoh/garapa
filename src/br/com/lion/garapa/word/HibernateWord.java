package br.com.lion.garapa.word;

/**
 * INFORMACOES SOBRE AS PALAVRAS RESERVADAS DO HIBERNATE
 * @author alyssonnascimento
 * @since 01/03/2019
 */
public class HibernateWord {

	/**
	 * ANOTA플O USADA NO CONTROLE
	 */
	public static final String TRANSACTIONAL = "@Transactional";
	
	/**
	 * ANOTA플O USADA NO DAO
	 */
	public static final String REPOSITORY = "@Repository";
	
	/**
	 * ANOTA플O USADA NO MODELO
	 */
	public static final String ENTITY = "@Entity";
	
	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR A TABELA
	 */
	public static final String TABLE = "@Table";
	

	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR O NOME TABELA
	 */
	public static final String TABLE_NAME = "name";

	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR O ID DA TABELA
	 */
	public static final String ID = "@Id";
	

	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR UMA TABELA
	 */
	public static final String COLUMN = "@Column";
	
	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR O NOME TABELA
	 */
	public static final String COLUMN_NAME = "name";

	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR A SEQUENCIA DO ID DA TABELA
	 */
	public static final String SEQUENCE_GENERATOR = "@SequenceGenerator";
	
	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR O NOME SEQUENCIA DO ID DA TABELA
	 */
	public static final String SEQUENCE_GENERATOR_NAME = "name";

	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR O NOME DO SEQUENCIA DO ID DA TABELA
	 */

	public static final String SEQUENCE_GENERATOR__SEQUENCE_NAME = "sequenceName";

	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR A QUANTIDADE DE INCREMENTO DO ID DA TABELA
	 */
	public static final String SEQUENCE_GENERATOR_ALLOCATION_SIZE = "allocationSize";

	/**
	 * ANOTA플O USADA NO MODELO PARA IDENTIFICAR O VALOR INICIAL DO ID DA TABELA
	 */
	public static final String SEQUENCE_GENERATOR_INITIAL_VALUE = "initialValue";
	
}
