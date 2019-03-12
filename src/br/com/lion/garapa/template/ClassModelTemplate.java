package br.com.lion.garapa.template;

import java.util.List;

import br.com.lion.garapa.model.Attribute;

/**
 * REPRESENTA A CLASSE DE MODELO QUE SERÁ GERADA NO TEMPLATE DO GARAPA FRAMWWORK
 * @author alyssonnascimento
 * @since 26/02/2019
 * @version 1.0
 */
public class ClassModelTemplate extends ClassGeneric implements IClassTemplate{

	private String className;
	
	private List<Attribute> attributes;
	
	public ClassModelTemplate(String className,List<Attribute> attributes) {
		this.className = className;
		this.attributes = attributes;
	}
	
	@Override
	public void createClass() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String createPreHeadClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createHeadClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createBodyClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createFotterClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
