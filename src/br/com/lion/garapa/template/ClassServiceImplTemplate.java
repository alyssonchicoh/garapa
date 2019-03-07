package br.com.lion.garapa.template;

import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.HelperString;
import br.com.lion.garapa.word.AnnotationWord;
import br.com.lion.garapa.word.DataTypeWord;
import br.com.lion.garapa.word.HibernateWord;
import br.com.lion.garapa.word.ImportWord;
import br.com.lion.garapa.word.MethodInTemplateWord;
import br.com.lion.garapa.word.ObjectWord;
import br.com.lion.garapa.word.ReserveWord;
import br.com.lion.garapa.word.SQLWord;
import br.com.lion.garapa.word.SpecialCharactersWord;

public class ClassServiceImplTemplate extends ClassGeneric implements IClassTemplate {

	private String className;
	
	private final String classDomain = "ServiceImpl";

	public static void main(String[] args) {
		ClassServiceImplTemplate impl = new ClassServiceImplTemplate("Carro");
		impl.createClass();
	}
	
	
	public ClassServiceImplTemplate(String className) {
		 this.className = className;
	}
	
	
	@Override
	public void createClass() {
	StringBuilder builder = new StringBuilder();
		builder.append(this.createPreHeadClass());
		builder.append(this.createHeadClass());
		builder.append(this.createBodyClass());
		builder.append(this.createFotterClass());

	System.out.println(builder.toString());		
	}

	@Override
	public String createPreHeadClass() {
		StringBuilder builder = new StringBuilder();
		
			builder.append(ReserveWord.PACKAGE);
			builder.append(super.space);
			builder.append(super.NAME_SERVICE_IMPL_PACKAGE);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			//IMPORT LIST
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(ImportWord.JAVA_UTIL_LIST);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			//IMPORT AUTOWIRED
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(ImportWord.ORG_SPRING_FRAMEWORK_BEANS_FACTORY_ANNOTATION_AUTOWIRED);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			//IMPORT SERVICE
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(ImportWord.ORG_SPRING_FRAMEWORK_STEREOTYPE_SERVICE);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			//IMPORT TRANSACTIONAL
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(ImportWord.ORG_SPRING_FRAMEWORK_TRANSACTION_ANNOTATION_TRANSACTIONAL);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			

			builder.append(super.lineJump);
			
			//IMPORT MODEL
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(super.name_model_package);
			builder.append(SpecialCharactersWord.DOT);
			builder.append(className);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			
			//IMPORT DAO
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(super.name_dao_package);
			builder.append(SpecialCharactersWord.DOT);
			builder.append(className);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			
			//IMPORT SERVICE DA ENTITY
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(super.NAME_SERVICE_PACKAGE);
			builder.append(SpecialCharactersWord.DOT);
			builder.append(className);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			
		return builder.toString();
	}

	@Override
	public String createHeadClass() {
		StringBuilder builder = new StringBuilder();
			builder.append(AnnotationWord.SERVICE);
			builder.append(super.lineJump);
			builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
			builder.append(super.space);
			builder.append(ReserveWord.CLASS);
			builder.append(super.space);
			builder.append(this.className);
			builder.append(this.classDomain);
			builder.append(super.space);
			builder.append(ReserveWord.IMPLEMENTS);
			builder.append(super.space);
			builder.append(this.className);
			builder.append(HelperString.upperFirst(super.NAME_SERVICE_PACKAGE));
			builder.append(super.space);

			builder.append(SpecialCharactersWord.BRACE_OPEN);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
		return builder.toString();

		
	}

	@Override
	public String createBodyClass() {
		StringBuilder builder = new StringBuilder();
		
		//DEFINIÇÃO DA VARIAVEL DAO
		builder.append(HelperString.spacingSecondLevel);
		builder.append(AccessModifierType.ACCESS_MODIFIER_PRIVATE);
		builder.append(super.space);
		builder.append(this.className);
		builder.append(HelperString.upperAll(this.name_dao_package));
		builder.append(super.space);
		builder.append(ObjectWord.DAO);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);
		builder.append(super.lineJump);		

		//DEFINIÇÃO DO CONSTRUTOR DA CLASSE
		builder.append(HelperString.spacingSecondLevel);
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(this.className);
		builder.append(this.classDomain);	
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(this.className);
		builder.append(HelperString.upperAll(this.name_dao_package));
		builder.append(super.space);
		builder.append(ObjectWord.DAO);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		builder.append(SpecialCharactersWord.BRACE_OPEN);
		builder.append(super.lineJump);
		builder.append(super.lineJump);

		builder.append(HelperString.spacingTHIRDLevel);
		builder.append(ReserveWord.THIS);
		builder.append(SpecialCharactersWord.DOT);
		builder.append(ObjectWord.DAO);
		builder.append(super.space);

		builder.append(SpecialCharactersWord.EQUALS);
		builder.append(super.space);
		builder.append(ObjectWord.DAO);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);
		builder.append(HelperString.spacingSecondLevel);
		builder.append(SpecialCharactersWord.BRACE_CLOSE);
		builder.append(super.lineJump);
		builder.append(super.lineJump);


		
		builder.append(HelperString.spacingSecondLevel);
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(this.className);
		builder.append(super.space);
		builder.append(MethodInTemplateWord.SAVE);
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(this.className);
		builder.append(super.space);
		builder.append(SQLWord.SQL_OBJ);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		builder.append(super.space);
		builder.append(ReserveWord.THROWS);
		builder.append(super.space);
		builder.append(ReserveWord.EXCEPTION);
		builder.append(SpecialCharactersWord.BRACE_OPEN);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		builder.append(HelperString.spacingSecondLevel);
		builder.append(SpecialCharactersWord.BRACE_CLOSE);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		//DEFINICAO DO METODO DE ALTERAR
		builder.append(HelperString.spacingSecondLevel);
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(this.className);
		builder.append(super.space);
		builder.append(MethodInTemplateWord.UPDATE);
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(this.className);
		builder.append(super.space);
		builder.append(SQLWord.SQL_OBJ);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		builder.append(super.space);
		builder.append(ReserveWord.THROWS);
		builder.append(super.space);
		builder.append(ReserveWord.EXCEPTION);
		builder.append(SpecialCharactersWord.BRACE_OPEN);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		builder.append(HelperString.spacingSecondLevel);
		builder.append(SpecialCharactersWord.BRACE_CLOSE);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		//DEFINICAO DO METODO DE REMOVER
		builder.append(HelperString.spacingSecondLevel);
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(DataTypeWord.VOID);
		builder.append(super.space);
		builder.append(MethodInTemplateWord.DELETE);
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(this.className);
		builder.append(super.space);
		builder.append(SQLWord.SQL_OBJ);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		builder.append(super.space);
		builder.append(ReserveWord.THROWS);
		builder.append(super.space);
		builder.append(ReserveWord.EXCEPTION);
		builder.append(SpecialCharactersWord.BRACE_OPEN);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		builder.append(HelperString.spacingSecondLevel);
		builder.append(SpecialCharactersWord.BRACE_CLOSE);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		//DEFINICAO DO METODO DE BUSCAR POR ID
		builder.append(HelperString.spacingSecondLevel);
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(this.className);
		builder.append(super.space);
		builder.append(MethodInTemplateWord.SEARCH_BY_ID);
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(DataTypeWord.INTEGER);
		builder.append(super.space);
		builder.append(SQLWord.SQL_ID);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		builder.append(super.space);
		builder.append(ReserveWord.THROWS);
		builder.append(super.space);
		builder.append(ReserveWord.EXCEPTION);
		builder.append(SpecialCharactersWord.BRACE_OPEN);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		builder.append(HelperString.spacingSecondLevel);
		builder.append(SpecialCharactersWord.BRACE_CLOSE);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		//DEFINICAO DO METODO DE BUSCAR TODOS
		builder.append(HelperString.spacingSecondLevel);
		builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
		builder.append(super.space);
		builder.append(DataTypeWord.LIST);
		builder.append(SpecialCharactersWord.LESS_THAN);
		builder.append(this.className);
		builder.append(SpecialCharactersWord.BIGGER_THAN);
		builder.append(super.space);
		builder.append(MethodInTemplateWord.SEARCH);
		builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
		builder.append(DataTypeWord.STRING);
		builder.append(super.space);
		builder.append(SQLWord.SQL_QUERY);
		builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
		builder.append(super.space);
		builder.append(ReserveWord.THROWS);
		builder.append(super.space);
		builder.append(ReserveWord.EXCEPTION);
		builder.append(SpecialCharactersWord.BRACE_OPEN);
		builder.append(super.lineJump);
		builder.append(super.lineJump);
		builder.append(HelperString.spacingSecondLevel);
		builder.append(SpecialCharactersWord.BRACE_CLOSE);
		builder.append(super.lineJump);
		builder.append(super.lineJump);		
	return builder.toString();	
	}

	@Override
	public String createFotterClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
