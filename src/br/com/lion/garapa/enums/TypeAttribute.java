package br.com.lion.garapa.enums;

/**
 * CLASSE QUE REPRESENTARÁ O TIPO DO ATRIBUTO, SIMPLES OU COMPOSTO
 * @author alyssonnascimento
 * @since 11/03/2019
 */
public enum TypeAttribute {
	SIMPLE(1), COMPLEX(2);
	
	public int value;
	TypeAttribute(int value) {
        this.value = value;
    }
}
