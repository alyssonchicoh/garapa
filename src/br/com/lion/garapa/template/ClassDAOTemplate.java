package br.com.lion.garapa.template;

import br.com.lion.garapa.model.Attribute;
import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.HelperString;

/**
 * Classe responsável por gerar a interface da classe DAO
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
	 * MÉTODO UTILIZADO PARA AGRUPAR TODAS A CRIAÇÃO DA CLASSE DE DAO
	 */
	public void createClass(){
		StringBuffer builder = new StringBuffer();
		builder.append(createHeadClass());
		builder.append(createBodyClass());
		builder.append(createFotterClass());
		System.out.println(builder.toString());

	}
	
	/**
	 * MÉTODO UTILIZADO PARA CONSTRUIR A DEFINIÇÃO DA CLASSE
	 * @return STRING COM O CONTEUDO DA DEFINIÇÃO DA CLASSE
	 */
	private String createHeadClass(){
		StringBuilder builder = new StringBuilder();
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(super.reservedWord_INTERFACE);
		builder.append(super.space);
		builder.append(className + classDomain);
		builder.append(super.reservedWord_BRACE_OPEN);
		return builder.toString();
	}
	
	/**
	 * MÉTODO UTILIZADO PARA CONSTRUIR A DEFINIÇÃO DOS MÉTODOS
	 * @return STRING COM O CONTEUDO DA DEFINIÇÃO DOS MÉTODOS
	 */
	private String createBodyClass(){
		StringBuilder builder = new StringBuilder();
		builder.append(HelperString.spacingFirstLevel);
		builder.append(super.lineJump);

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
	 * MÉTODO UTILIZADO PARA CONSTRUIR A DEFINIÇÃO DO FINAL DA CLASSE
	 * @return STRING COM O CONTEUDO DA DEFINIÇÃO DOS FINAL DA CLASSE
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
