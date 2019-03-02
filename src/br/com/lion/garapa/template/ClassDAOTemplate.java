package br.com.lion.garapa.template;

import br.com.lion.Word.DataTypeWord;
import br.com.lion.Word.ImportWord;
import br.com.lion.Word.ReserveWord;
import br.com.lion.Word.SpecialCharactersWord;
import br.com.lion.garapa.model.Attribute;
import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.HelperString;

/**
 * Classe respons�vel por gerar a interface da classe DAO
 * @author alyssonnascimento
 * @since 28/02/2019
 *
 */
public class ClassDAOTemplate extends ClassGeneric {
	/**
	 * NOME DA CLASSE A QUAL SE DES
	 * EJA GERAR O DAO
	 */
	private String className;
	
	/**
	 * DOMINIOS DO FINAL DA CLASSE
	 */
	private final String classDomain = "DAO";
	
	public ClassDAOTemplate(String className){
		this.className = className;
	}
	
	/**
	 * M�TODO UTILIZADO PARA AGRUPAR TODAS A CRIA��O DA CLASSE DE DAO
	 */
	public void createClass(){
		StringBuffer builder = new StringBuffer();
		builder.append(createHeadClass());
		builder.append(createBodyClass());
		builder.append(createFotterClass());
		System.out.println(builder.toString());

	}
	
	/**
	 * M�TODO UTILIZADO PARA CONSTRUIR A DEFINI��O DA CLASSE
	 * @return STRING COM O CONTEUDO DA DEFINI��O DA CLASSE
	 */
	private String createHeadClass(){
		StringBuilder builder = new StringBuilder();
			builder.append(ReserveWord.PACKAGE);
			builder.append(super.space);
			builder.append(super.name_dao_package);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
		
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(ImportWord.JAVA_UTIL_LIST);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(super.name_model_package);
			builder.append(SpecialCharactersWord.DOT);
			builder.append(this.className);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
		
			builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
			builder.append(super.space);
			builder.append(ReserveWord.INTERFACE);
			builder.append(super.space);
			builder.append(className + classDomain);
			builder.append(super.space);
			builder.append(ReserveWord.EXTENDS);
			builder.append(super.space);
			builder.append(super.name_class_generic_dao);
			builder.append(SpecialCharactersWord.LESS_THAN);
			builder.append(this.className);
			builder.append(SpecialCharactersWord.COMMA);
			builder.append(DataTypeWord.INTEGER);
			builder.append(SpecialCharactersWord.BIGGER_THAN);
			builder.append(SpecialCharactersWord.BRACE_OPEN);
		
			return builder.toString();
	}
	
	/**
	 * M�TODO UTILIZADO PARA CONSTRUIR A DEFINI��O DOS M�TODOS
	 * @return STRING COM O CONTEUDO DA DEFINI��O DOS M�TODOS
	 */
	private String createBodyClass(){
		StringBuilder builder = new StringBuilder();
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			builder.append(HelperString.spacingFirstLevel);
			builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
			builder.append(super.space);
			builder.append(DataTypeWord.LIST);
			builder.append(SpecialCharactersWord.LESS_THAN);
			builder.append(className);
			builder.append(SpecialCharactersWord.BIGGER_THAN);
			builder.append(super.space);
			builder.append(super.method_seacrh);
			builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
			builder.append(DataTypeWord.STRING);
			builder.append(super.space);
			builder.append(super.parameter_method_seacrh);
			builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		return builder.toString();
	}
	
	/**
	 * M�TODO UTILIZADO PARA CONSTRUIR A DEFINI��O DO FINAL DA CLASSE
	 * @return STRING COM O CONTEUDO DA DEFINI��O DOS FINAL DA CLASSE
	 */
	private String createFotterClass(){
		StringBuilder builder = new StringBuilder();
		builder.append(super.lineJump);
		builder.append(SpecialCharactersWord.BRACE_CLOSE);
		return builder.toString();
	}
	
	
	public static void main(String[] args) {
		ClassDAOTemplate DAO = new ClassDAOTemplate("Aluno");
		DAO.createClass();
	}
	
}
