package br.com.lion.garapa.util;

import br.com.lion.garapa.model.Attribute;

/**
 * CLASSE RESPONSÁVEL POR CRIAR GET E SET DE QUALQUER ATRIBUTO
 * @author alyssonnascimento
 * @since 27/02/2019
 * @version 1
 */
public class GetAndSetGenerator {

	private String test;
	
	/**
	 * Método responsável por gerar um método GET de um determinado atributo
	 * @param attribute atributo a qual se deseja gerar o método GET
	 * @return String representando o método GET
	 */
	public static String generatorGet(Attribute attribute){
		StringBuilder builder = new StringBuilder();
		//PUBLIC STRING getPessoa(){
		builder.append(HelperString.spacingFirstLevel + "public "+attribute.getAttributeType().getType() + " get"+HelperString.upperFirst(attribute.getAttributeType().getName()) + "(){");
		builder.append("\n");
		builder.append(HelperString.spacingSecondLevel + "return this."+HelperString.lowwerAll(attribute.getAttributeType().getName()) +";");
		builder.append("\n");
		builder.append(HelperString.spacingFirstLevel +"}");

		return builder.toString();
	}
	

	public static String generatorSet(Attribute attribute){
		StringBuilder builder = new StringBuilder();
		//PUBLIC STRING getPessoa(){
		builder.append(HelperString.spacingFirstLevel +"public void set"+HelperString.upperFirst(attribute.getAttributeType().getName()) + "("+HelperString.upperFirst(attribute.getAttributeType().getName()) + " " + HelperString.lowwerAll(attribute.getAttributeType().getName()) +"){");
		builder.append("\n");
		builder.append(HelperString.spacingSecondLevel +"this."+HelperString.lowwerAll(attribute.getAttributeType().getName()) +" = "+HelperString.lowwerAll(attribute.getAttributeType().getName() +";"));
		builder.append("\n");
		builder.append(HelperString.spacingFirstLevel +"}");

		return builder.toString();
		}


	public String getTest() {
		return test;
	}


	public void setTest(String test) {
		this.test = test;
	}
	
	
}
