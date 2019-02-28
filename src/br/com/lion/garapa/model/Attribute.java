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
	 * REPRESENTA O MODIFICADOR DE ACESSO
	 */
	private String accessModifier;
	
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
	
	public Attribute(String accessModifier,String type,String name){
		this.accessModifier = accessModifier;
		this.type = type;
		this.name = name;
		this.get = GetAndSetGenerator.generatorGet(this);
		this.set = GetAndSetGenerator.generatorSet(this);
	}
	
	@Override
	public String toString() {
		return this.accessModifier + " " + this.type + " "+this.name + ";";
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

	public String getAccessModifier() {
		return accessModifier;
	}

	public void setAccessModifier(String accessModifier) {
		this.accessModifier = accessModifier;
	}
	
	
	
}
