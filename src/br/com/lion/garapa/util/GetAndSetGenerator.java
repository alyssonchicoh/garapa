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
	
	public static String generatorGet(Attribute attribute){
		StringBuilder builder = new StringBuilder();
		//PUBLIC STRING getPessoa(){
		builder.append("public "+attribute.getType() + "get"+HelperString.upperFirst(attribute.getName()) + "(){");
		builder.append("\n");
		builder.append("return this."+attribute.getName());
		builder.append("\n");
		builder.append("}");

		return "";
	}
	

	public static String generatorSet(){
		return "";
	}


	public String getTest() {
		return test;
	}


	public void setTest(String test) {
		this.test = test;
	}
	
	
}
