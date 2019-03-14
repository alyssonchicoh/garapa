package br.com.lion.garapa.model;

import br.com.lion.garapa.util.AccessModifierType;
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
	private AttributeType attributeType;
	
	
	
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
	
	public Attribute(AttributeType attributeType){
		this.attributeType = attributeType;
		this.get = GetAndSetGenerator.generatorGet(this);
		this.set = GetAndSetGenerator.generatorSet(this);
	}
	
	@Override
	public String toString() {
		return AccessModifierType.ACCESS_MODIFIER_PRIVATE +" " +attributeType.getType() + " "+attributeType.getName();
	}

	public AttributeType getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(AttributeType attributeType) {
		this.attributeType = attributeType;
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
