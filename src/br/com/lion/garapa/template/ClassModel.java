package br.com.lion.garapa.template;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.lion.garapa.model.Attribute;
import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.HelperString;

/**
 * REPRESENTA A CLASSE DE MODELO QUE SERÁ GERADA NO TEMPLATE DO GARAPA FRAMWWORK
 * @author alyssonnascimento
 * @since 26/02/2019
 * @version 1.0
 */
public class ClassModel extends ClassGeneric{
	
	/**
	 * REPRESENTAÇÃO DO NOME DA CLASSE DE MODELO
	 */
	private String className;
	
	/**
	 * ATRIBUTOS DA CLASSE DE MODELO;
	 */
	private List<Attribute> attributes;
	

	public ClassModel(String className){
		this.className = className;
		this.attributes = new ArrayList<Attribute>();
	}
	
	/**
	 * MÉTODO RESPONSÁVEL POR ADICIONAR UM ATRIBUTO A CLASSE
	 * @param type Tipo do atributo
	 * @param name nome do atributo
	 * @return boolean com a confirmação da inserção do atributo na estrutura de dados
	 */
	public boolean addAttribute(String type,String name){
		try{
			Attribute att = new Attribute(AccessModifierType.ACCESS_MODIFIER_PRIVATE, type, name);
			this.attributes.add(att);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
	public List<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * MÉTODO RESPONSÁVEL POR CRIAR A CLASSE
	 */
	public void createClass(){
		StringBuilder builder = new StringBuilder();
		builder.append("public class " +className + "{");
		builder.append(super.lineJump);
		
		List<Attribute> att = getAttributes();
		
		for (Attribute attribut : att) {
			builder.append(HelperString.spacingFirstLevel + attribut.toString());
			builder.append(super.lineJump);
		}
		
		builder.append(super.lineJump);
		builder.append(super.lineJump);

		
		builder.append(HelperString.spacingFirstLevel +"public "+className + "(){");
		builder.append(super.lineJump);
		builder.append(super.lineJump);

		builder.append(HelperString.spacingFirstLevel +"}");
		builder.append(super.lineJump);

		
		
		for (Attribute attribut : att) {
			builder.append(attribut.getGet());
			builder.append(super.lineJump);
			builder.append(super.lineJump);

			builder.append(attribut.getSet());
			builder.append(super.lineJump);
			builder.append(super.lineJump);


		}
		builder.append(super.lineJump);
		builder.append(super.lineJump);

		builder.append("}");
		
		System.out.println(builder);
	}
	
}
