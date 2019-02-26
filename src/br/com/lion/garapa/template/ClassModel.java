package br.com.lion.garapa.template;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * REPRESENTA A CLASSE DE MODELO QUE SERÁ GERADA NO TEMPLATE DO GARAPA FRAMWWORK
 * @author alyssonnascimento
 * @since 26/02/2019
 * @version 1.0
 */
public class ClassModel {
	
	/**
	 * REPRESENTAÇÃO DO NOME DA CLASSE DE MODELO
	 */
	private String className;
	
	/**
	 * ATRIBUTOS DA CLASSE DE MODELO;
	 */
	private List<String> attributes;
	
	/**
	 * REPRESENTA OS TIPOS DOS ATRIBUTOS 
	 */
	private List<String> attributesTypes;
	
	public ClassModel(String className){
		this.className = className;
		this.attributes = new ArrayList<String>();
		this.attributesTypes = new ArrayList<String>();
	}
	
	/**
	 * MÉTODO RESPONSÁVEL POR ADICIONAR UM ATRIBUTO A CLASSE
	 * @param type Tipo do atributo
	 * @param name nome do atributo
	 * @return boolean com a confirmação da inserção do atributo na estrutura de dados
	 */
	public boolean addAttribute(String type,String name){
		try{
		
			attributes.add(name);
			attributesTypes.add(type);

		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * MÉTODO RESPONSÁVEL POR LISTAR TODOS OS ATRIBUTOS DE UMA DETERMINADA CLASSE
	 * @return
	 */
	public List<String[]> getAllAttributes(){
		List<String[]> listAttributes = new ArrayList<String[]>();
		String[] attributesReturn = new String[2]; 
		
		int size = attributes.size();
		for (int i = 0; i < attributes.size(); i++) {
			String name = attributes.get(i);
			String type = attributesTypes.get(i);
			
			attributesReturn[0] = name;
			attributesReturn[1] = type;
			
			listAttributes.add(attributesReturn);
		}
		
		return listAttributes;
	}
	
	
	
}
