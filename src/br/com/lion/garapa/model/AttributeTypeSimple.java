package br.com.lion.garapa.model;

import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.HelperString;

public class AttributeTypeSimple extends AttributeType{

	private String type;
	private String name;
	
	@Override
	public String builderName() {
		return AccessModifierType.ACCESS_MODIFIER_PRIVATE + " "+ type + " "+name + "";
	}
	
	public AttributeTypeSimple(String type,String name){
		this.type = type;
		this.name = name;
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




}

