package br.com.lion.garapa.model;

public class AttributeTypeComplex extends AttributeType{
	
	private DataTypeTableName type;
	
	private String name;
	@Override
	public String builderName() {
		return null;
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getType() {
		return null;
	}

	
}
