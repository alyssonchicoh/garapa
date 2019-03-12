package br.com.lion.garapa.template;

import java.util.ArrayList;
import java.util.List;

import br.com.lion.garapa.model.Attribute;
import br.com.lion.garapa.model.Model;
import br.com.lion.garapa.util.AccessModifierType;

/**
 * Classe que será responsável por agrupar todos as camadas de template
 * @author alyssonnascimento
 * @since 28/02/2019
 *
 */
public class ClassPackTemplate {

	
	public void create(Model cl){
		ClassModelTemplate model = new ClassModelTemplate(cl.getName(),cl.getAttributes());
		ClassDAOTemplate dao = new ClassDAOTemplate(cl.getName());
		ClassDAOImplTemplate daoImpl = new ClassDAOImplTemplate(cl.getName());
		model.createClass();
		System.out.println("----");
		dao.createClass();
		System.out.println("----");
		daoImpl.createClass();
	
	}
	
	public static void main(String[] args) {
	

	}
	
	
}
