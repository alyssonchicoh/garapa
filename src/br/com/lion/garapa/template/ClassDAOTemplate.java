package br.com.lion.garapa.template;

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
	 * NOME DA CLASSE A QUAL SE DESEJA GERAR O DAO
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
		builder.append(super.reservedWord_PACKAGE);
		builder.append(super.space);
		builder.append(super.name_dao_package);
		builder.append(super.reserveWord_DOT_AND_COMMA);
		builder.append(super.lineJump);
		
		builder.append(super.reservedWord_IMPORT);
		builder.append(super.space);
		builder.append(super.import_java_util_list);
		builder.append(super.reserveWord_DOT_AND_COMMA);
		builder.append(super.lineJump);
		builder.append(super.reservedWord_IMPORT);
		builder.append(super.space);
		builder.append(super.name_dao_model);
		builder.append(super.reserveWord_DOT);
		builder.append(this.className);
		builder.append(super.reserveWord_DOT_AND_COMMA);
		
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(super.reservedWord_INTERFACE);
		builder.append(super.space);
		builder.append(className + classDomain);
		builder.append(super.space);
		builder.append(super.reservedWord_EXTENDS);
		builder.append(super.space);
		builder.append(super.name_class_generic_dao);
		builder.append(super.reserveWord_LESS_THAN);
		builder.append(this.className);
		builder.append(super.reserveWord_COMMA);
		builder.append(super.type_INTEGER);
		builder.append(super.reserveWord_BIGGER_THAN);
		builder.append(super.reservedWord_BRACE_OPEN);
		
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
		builder.append(super.type_LIST);
		builder.append(super.reserveWord_LESS_THAN);
		builder.append(className);
		builder.append(super.reserveWord_BIGGER_THAN);
		builder.append(super.space);
		builder.append(super.method_seacrh);
		builder.append(super.reservedWord_PARENTHESIS_OPEN);
		builder.append(super.type_STRING);
		builder.append(super.space);
		builder.append(super.parameter_method_seacrh);
		builder.append(super.reservedWord_PARENTHESIS_CLOSE);
		builder.append(super.reserveWord_DOT_AND_COMMA);
		return builder.toString();
	}
	
	/**
	 * M�TODO UTILIZADO PARA CONSTRUIR A DEFINI��O DO FINAL DA CLASSE
	 * @return STRING COM O CONTEUDO DA DEFINI��O DOS FINAL DA CLASSE
	 */
	private String createFotterClass(){
		StringBuilder builder = new StringBuilder();
		builder.append(super.lineJump);
		builder.append(super.reservedWord_BRACE_CLOSE);
		return builder.toString();
	}
	
	
	public static void main(String[] args) {
		ClassDAOTemplate DAO = new ClassDAOTemplate("Aluno");
		DAO.createClass();
	}
	
}
