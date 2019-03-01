package br.com.lion.garapa.model;

import java.util.List;

public class Model {

	
	private String name;
	private List<Attribute> attributes;
	
	public Model(String name,List<Attribute> attributes){
		this.name = name;
		this.attributes = attributes;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
	
	
	
}
