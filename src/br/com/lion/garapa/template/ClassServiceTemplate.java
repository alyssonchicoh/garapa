package br.com.lion.garapa.template;

import java.nio.file.attribute.AclEntry.Builder;

import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.HelperString;
import br.com.lion.garapa.word.DataTypeWord;
import br.com.lion.garapa.word.ImportWord;
import br.com.lion.garapa.word.MethodInTemplateWord;
import br.com.lion.garapa.word.ReserveWord;
import br.com.lion.garapa.word.SQLWord;
import br.com.lion.garapa.word.SpecialCharactersWord;

public class ClassServiceTemplate extends ClassGeneric implements IClassTemplate{

	
	public static void main(String[] args) {
		ClassServiceTemplate service = new ClassServiceTemplate("Pessoa");
		service.createClass();
		
	}
	
	private String className;
	
	public ClassServiceTemplate(String className) {
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
			
			//DECLRACAO DO PACOTE
			builder.append(ReserveWord.PACKAGE);
			builder.append(super.space);
			builder.append(super.NAME_SERVICE_PACKAGE);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			//IMPORT LIST
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(ImportWord.JAVA_UTIL_LIST);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			//IMPORT MODEL
			builder.append(ReserveWord.IMPORT);
			builder.append(super.space);
			builder.append(super.name_model_package);
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
			builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
			builder.append(super.space);
			builder.append(ReserveWord.INTERFACE);
			builder.append(super.space);
			builder.append(this.className);
			builder.append(HelperString.upperFirst(super.NAME_SERVICE_PACKAGE));
			builder.append(super.space);
			builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			
		return builder.toString();
	}

	@Override
	public String createBodyClass() {
		StringBuilder builder = new StringBuilder();
			
			//DEFINICAO DO METODO DE SALVAR
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
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
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
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
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
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
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
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
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
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		
		return builder.toString();
	}

	@Override
	public String createFotterClass() {
		StringBuilder builder = new StringBuilder();
			builder.append(super.lineJump);
			builder.append(SpecialCharactersWord.BRACE_CLOSE);
		return builder.toString();
	}


}
