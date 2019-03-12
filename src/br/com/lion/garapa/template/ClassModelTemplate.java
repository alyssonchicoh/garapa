package br.com.lion.garapa.template;

import java.util.List;

import br.com.lion.garapa.model.Attribute;
import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.word.ClassWord;
import br.com.lion.garapa.word.HibernateWord;
import br.com.lion.garapa.word.ReserveWord;
import br.com.lion.garapa.word.SpecialCharactersWord;

/**
 * REPRESENTA A CLASSE DE MODELO QUE SERÁ GERADA NO TEMPLATE DO GARAPA FRAMWWORK
 * @author alyssonnascimento
 * @since 26/02/2019
 * @version 1.0
 */
public class ClassModelTemplate extends ClassGeneric implements IClassTemplate{

	private String className;
	
	private List<Attribute> attributes;
	
	public static void main(String[] args) {
		ClassModelTemplate model = new ClassModelTemplate("Pessoa",null);
		model.createClass();
	}
	
	public ClassModelTemplate(String className,List<Attribute> attributes) {
		this.className = className;
		this.attributes = attributes;
	}
	
	@Override
	public void createClass() {
		StringBuilder builder = new StringBuilder();
		builder.append(createPreHeadClass());
		builder.append(createHeadClass());

		
		System.out.println(builder.toString());
	}

	@Override
	public String createPreHeadClass() {
		StringBuilder builder = new StringBuilder();
		builder.append(ReserveWord.PACKAGE);
		builder.append(super.space);
		builder.append(super.name_model_package);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);
		builder.append(super.lineJump);

		return builder.toString();
	}

	@Override
	public String createHeadClass() {
		StringBuilder builder = new StringBuilder();
		builder.append(HibernateWord.ENTITY);
		builder.append(super.lineJump);
		builder.append(HibernateWord.TABLE);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(HibernateWord.TABLE_NAME);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.EQUALS);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(this.className);
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		
		builder.append(super.lineJump);
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(ReserveWord.CLASS);
		builder.append(super.space);
		builder.append(this.className);
		builder.append(super.space);

		builder.append(ReserveWord.EXTENDS);
		builder.append(super.space);
		builder.append(ClassWord.PERSISTENTE_ENTITY_IMPL);
		builder.append(SpecialCharactersWord.BRACE_OPEN);


		return builder.toString();
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
