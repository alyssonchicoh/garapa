package br.com.lion.garapa.template;

import java.util.ArrayList;
import java.util.List;

import br.com.lion.garapa.enums.Numbers;
import br.com.lion.garapa.model.Attribute;
import br.com.lion.garapa.model.AttributeTypeComplex;
import br.com.lion.garapa.model.ClassName;
import br.com.lion.garapa.model.AttributeTypeSimple;
import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.HelperString;
import br.com.lion.garapa.word.ClassWord;
import br.com.lion.garapa.word.DataTypeWord;
import br.com.lion.garapa.word.HibernateWord;
import br.com.lion.garapa.word.NumbersWord;
import br.com.lion.garapa.word.ObjectWord;
import br.com.lion.garapa.word.ReserveWord;
import br.com.lion.garapa.word.SpecialCharactersWord;

/**
 * REPRESENTA A CLASSE DE MODELO QUE SERÁ GERADA NO TEMPLATE DO GARAPA FRAMWWORK
 * @author alyssonnascimento
 * @since 26/02/2019
 * @version 1.0
 */
public class ClassModelTemplate extends ClassGeneric implements IClassTemplate{

	private ClassName className;
	
	
	private List<Attribute> attributes;
	
	public static void main(String[] args) {
		List<Attribute> lista = new ArrayList<Attribute>();
		Attribute t1 = new Attribute(new AttributeTypeSimple(DataTypeWord.STRING, "nome"));
		Attribute t2 = new Attribute(new AttributeTypeSimple(DataTypeWord.STRING, "endereco"));
		Attribute t3 = new Attribute(new AttributeTypeSimple(DataTypeWord.STRING, "cpf"));

		
		lista.add(t1);
		lista.add(t2);
		lista.add(t3);


		ClassModelTemplate model = new ClassModelTemplate("Pessoa",lista);
		model.createClass();
	}
	
	public ClassModelTemplate(String className,List<Attribute> attributes) {
		this.className = new ClassName(className);
		this.attributes = attributes;
	}
	
	@Override
	public void createClass() {
		StringBuilder builder = new StringBuilder();
		builder.append(createPreHeadClass());
		builder.append(createHeadClass());
		builder.append(createBodyClass());

		

		
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
		builder.append(this.className.toString());
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		
		builder.append(super.lineJump);
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(ReserveWord.CLASS);
		builder.append(super.space);
		builder.append(this.className.toString());
		builder.append(super.space);

		builder.append(ReserveWord.EXTENDS);
		builder.append(super.space);
		builder.append(ClassWord.PERSISTENTE_ENTITY_IMPL);
		builder.append(SpecialCharactersWord.BRACE_OPEN);
		builder.append(super.lineJump);
		builder.append(super.lineJump);

		return builder.toString();
	}

	@Override
	public String createBodyClass() {
		StringBuilder builder = new StringBuilder();
		builder.append(HelperString.spacingFirstLevel);
		builder.append(HibernateWord.ID);
		builder.append(super.lineJump);
		
		builder.append(HelperString.spacingFirstLevel);
		builder.append(HibernateWord.COLUMN);
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(HibernateWord.COLUMN_NAME);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.EQUALS);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(this.className.getClassNameSmall() + HibernateWord.COD_ID_PK);
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);

		builder.append(super.lineJump);
		builder.append(HelperString.spacingFirstLevel);
		builder.append(HibernateWord.SEQUENCE_GENERATOR);
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(HibernateWord.SEQUENCE_GENERATOR_NAME);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.EQUALS);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(HibernateWord.SEQ + className.getClassNameLower());
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(SpecialCharactersWord.COMMA);
		builder.append(super.space);
		builder.append(HibernateWord.SEQUENCE_GENERATOR__SEQUENCE_NAME);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.EQUALS);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(HibernateWord.SEQ + className.getClassNameLower());
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(super.space);
		builder.append(HibernateWord.SEQUENCE_GENERATOR_ALLOCATION_SIZE);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.EQUALS);
		builder.append(super.space);
		builder.append(NumbersWord.ONE);
		builder.append(SpecialCharactersWord.COMMA);

		builder.append(super.space);
		builder.append(HibernateWord.SEQUENCE_GENERATOR_INITIAL_VALUE);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.EQUALS);
		builder.append(super.space);
		builder.append(NumbersWord.ONE);
		builder.append(super.lineJump);
		
		builder.append(HelperString.spacingFirstLevel);
		builder.append(HibernateWord.GENERATED_VALUE);
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(HibernateWord.GENERATED_VALUE_GENERATOR);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.EQUALS);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(HibernateWord.SEQ + className.getClassNameLower());
		builder.append(SpecialCharactersWord.DOUBLE_SPACES);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		
		builder.append(SpecialCharactersWord.COMMA);
		builder.append(super.space);

		builder.append(HibernateWord.GENERATED_VALUE_STRATEGY);
		builder.append(super.space);
		builder.append(SpecialCharactersWord.EQUALS);
		builder.append(super.space);
		builder.append(HibernateWord.GENERATED_VALUE_GENERATION_TYPE);
		builder.append(SpecialCharactersWord.DOT);
		builder.append(HibernateWord.GENERATED_VALUE_SEQUENCE);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		builder.append(super.lineJump);
		builder.append(HelperString.spacingFirstLevel);
		
		builder.append(AccessModifierType.ACCESS_MODIFIER_PRIVATE);
		builder.append(super.space);
		builder.append(DataTypeWord.INTEGER);
		builder.append(super.space);
		builder.append(ObjectWord.ID);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		builder.append(createAttributeForClass());
		return builder.toString();
	}

	@Override
	public String createFotterClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String createAttributeForClass(){
		StringBuilder builder = new StringBuilder();
			
		for (Attribute attribute : attributes) {
		
			if(attribute.getAttributeType() instanceof AttributeTypeSimple){
				builder.append(HelperString.spacingFirstLevel);
				builder.append(HibernateWord.COLUMN);
				builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
				builder.append(HibernateWord.COLUMN_NAME);
				builder.append(super.space);
				builder.append(SpecialCharactersWord.EQUALS);
				builder.append(super.space);
				builder.append(SpecialCharactersWord.DOUBLE_SPACES);
				builder.append(className.getClassNameSmall());
				builder.append(SpecialCharactersWord.UNDERLINE);
				builder.append(HelperString.lowwerAll(attribute.getAttributeType().getName()));
				builder.append(SpecialCharactersWord.DOUBLE_SPACES);
				builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);	
				builder.append(super.lineJump);
				builder.append(HelperString.spacingFirstLevel);
				builder.append(AccessModifierType.ACCESS_MODIFIER_PRIVATE);
				builder.append(super.space);
				builder.append(attribute.getAttributeType().getType());
				builder.append(super.space);
				builder.append(HelperString.lowwerAll(attribute.getAttributeType().getName()));
				builder.append(SpecialCharactersWord.DOT_AND_COMMA);
				builder.append(super.lineJump);
				builder.append(super.lineJump);




			}else if(attribute.getAttributeType() instanceof AttributeTypeComplex){
				
			}
		}
		
		return builder.toString();

	}
	
}
