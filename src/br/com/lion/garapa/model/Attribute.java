package br.com.lion.garapa.model;

import br.com.lion.garapa.util.GetAndSetGenerator;

/**
 * Classe responsável por representar um atributo JAVA
 * @author alyssonnascimento
 * @since 27/02/2019
 * @version 1
 */
public class Attribute {
	/**
	 * REPRESENTA O TIPO DO ATRIBUTO
	 */
	private String type;
	
	/**
	 * REPRESENTA O NOME DO ATRIBUTO
	 */
	private String name;
	
	/**
	 * REPRESENTA O MÉTODO GET DO ATRIBUTO
	 */
	private String get;
	
	/**
	 * REPRESENTA O MÉTODO SET DO ATRIBUTO
	 */
	private String set;
	
	public Attribute(){
		
	}
	
	public Attribute(String type,String name){
		this.type = type;
		this.name = name;
		get = GetAndSetGenerator.generatorGet(this);
		set = GetAndSetGenerator.generatorSet(this);
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGet() {
		return get;
	}
	public void setGet(String get) {
		this.get = get;
	}
	public String getSet() {
		return set;
	}
	public void setSet(String set) {
		this.set = set;
	}
	
	
	
}
