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
		Attribute a1 = new Attribute(AccessModifierType.ACCESS_MODIFIER_PRIVATE, "Integer", "Id");
		Attribute a2 = new Attribute(AccessModifierType.ACCESS_MODIFIER_PRIVATE, "String", "Nome");
		Attribute a3 = new Attribute(AccessModifierType.ACCESS_MODIFIER_PRIVATE, "String", "marca");
		Attribute a4 = new Attribute(AccessModifierType.ACCESS_MODIFIER_PRIVATE, "String", "chassi");
		Attribute a5 = new Attribute(AccessModifierType.ACCESS_MODIFIER_PRIVATE, "String", "cor");

		
		List<Attribute> lista = new ArrayList<Attribute>();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);

		
		Model m = new Model("Carro", lista);
		ClassPackTemplate pack = new ClassPackTemplate();
		pack.create(m);



	}
	
	
}
