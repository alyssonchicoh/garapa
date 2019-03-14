package br.com.lion.garapa.enums;

public enum DataTypeRelationShipEnum {

	MANY_TO_ONE(1),
	
	ONE_TO_MANY(2),
	
	MANY_TO_MANY(3);
	
	public int value;
	
	DataTypeRelationShipEnum(int value) {
        this.value = value;
    }
}
