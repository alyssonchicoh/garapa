package br.com.lion.garapa.template;

import br.com.lion.Word.AnnotationWord;
import br.com.lion.Word.ClassWord;
import br.com.lion.Word.DataTypeWord;
import br.com.lion.Word.HibernateWord;
import br.com.lion.Word.ImportWord;
import br.com.lion.Word.MethodWord;
import br.com.lion.Word.ObjectWord;
import br.com.lion.Word.ReserveWord;
import br.com.lion.Word.SQLWord;
import br.com.lion.Word.SpecialCharactersWord;
import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.HelperString;

/**
 * CLASSE UTILIZADA PARA REALIZAR A IMPLEMENTA��AO DA CLASSE DAOImpl
 * @author alyssonnascimento
 * @since  01/03/2019
 */
public class ClassDAOImplTemplate  extends ClassGeneric{
	/**
	 * NOME DA CLASSE A QUAL SE DES
	 * EJA GERAR O DAO
	 */
	private String className;
	
	/**
	 * DOMINIOS DO FINAL DA CLASSE
	 */
	private final String classDomain = "DAOImpl";
	
	private String nameCondMethodSearch = "cond";
	
	public ClassDAOImplTemplate(String className){
		this.className = className;
	}
	
	/**
	 * M�TODO UTILIZADO PARA AGRUPAR TODAS A CRIA��O DA CLASSE DE DAO
	 */
	public void createClass(){
		StringBuffer builder = new StringBuffer();
		builder.append(createPreHeadClass());

		builder.append(createHeadClass());
		builder.append(createBodyClass());
		builder.append(createFotterClass());
		
		System.out.println(builder.toString());
	}
	
	/**
	 * METODO PARA CONSTRUIR AS CONFIGURACOES ANTES DA DEFINICAO DE CLASSE
	 * @return
	 */
	private String createPreHeadClass(){
		StringBuffer builder = new StringBuffer();
		
		//CRIA��O DO PACOTE
		builder.append(ReserveWord.PACKAGE);
		builder.append(super.space);
		builder.append(super.name_dao_impl_package);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);
		builder.append(super.lineJump);

		
		//IMPORTACOES
		builder.append(ReserveWord.IMPORT);
		builder.append(super.space);
		builder.append(ImportWord.JAVAX_PERSISTENCE_TYPEDQUERY);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);
		
		builder.append(ReserveWord.IMPORT);
		builder.append(super.space);
		builder.append(ImportWord.ORG_SPRING_FRAMEWORK_STEREOTYPE_REPOSITORY);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);
		
		builder.append(ReserveWord.IMPORT);
		builder.append(super.space);
		builder.append(ImportWord.ORG_SPRING_FRAMEWORK_TRANSACTION_ANNOTATION_TRANSACTIONAL);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);
		
		builder.append(ReserveWord.IMPORT);
		builder.append(super.space);
		builder.append(super.name_model_package);
		builder.append(SpecialCharactersWord.DOT);
		builder.append(this.className);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);

		builder.append(ReserveWord.IMPORT);
		builder.append(super.space);
		builder.append(super.name_dao_package);
		builder.append(SpecialCharactersWord.DOT);
		builder.append(this.className);
		builder.append(SpecialCharactersWord.DOT_AND_COMMA);
		builder.append(super.lineJump);
		builder.append(super.lineJump);

		
		
		return builder.toString();
	}
	
	
	/**
	 * METODO UTILIZADO PARA CONSTRUIR O CABECALHO DA CLASSE
	 * @return STRING CONTENDO O CABECALHO DA CLASSE
	 */
	private String createHeadClass(){
		StringBuffer builder = new StringBuffer();
			builder.append(HibernateWord.REPOSITORY);
			builder.append(super.lineJump);
			builder.append(HibernateWord.TRANSACTIONAL);
			builder.append(super.lineJump);
			builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
			builder.append(super.space);
			builder.append(ReserveWord.CLASS);
			builder.append(super.space);
			builder.append(className + classDomain);
			builder.append(super.space);
			builder.append(ReserveWord.EXTENDS);
			builder.append(super.space);
			builder.append(super.name_class_generic_dao);
			builder.append(SpecialCharactersWord.LESS_THAN);
			builder.append(this.className);
			builder.append(SpecialCharactersWord.COMMA);
			builder.append(DataTypeWord.INTEGER);
			builder.append(SpecialCharactersWord.BIGGER_THAN);
			builder.append(super.space);
			builder.append(ReserveWord.IMPLEMENTS);
			builder.append(super.space);
			builder.append(this.className);
			builder.append(HelperString.upperAll(this.name_dao_package));
			builder.append(super.space);
			builder.append(SpecialCharactersWord.BRACE_OPEN);
		return builder.toString();
	}
	
	
	/**
	 * M�TODO UTILIZADO PARA CONSTRUIR A DEFINI��O DOS M�TODOS
	 * @return STRING COM O CONTEUDO DA DEFINI��O DOS M�TODOS
	 */
	private String createBodyClass(){
		StringBuilder builder = new StringBuilder();
		builder.append(super.lineJump);
		
			//DECLARACAO DA SOBREESCRITA
			builder.append(super.lineJump);
			builder.append(HelperString.spacingFirstLevel);
			builder.append(AnnotationWord.OVERRIDE);
			
			//DECLARACAO DO NOME DO METODO
			builder.append(super.lineJump);
			builder.append(HelperString.spacingFirstLevel);
			builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
			builder.append(super.space);
			builder.append(DataTypeWord.LIST);
			builder.append(SpecialCharactersWord.LESS_THAN);
			builder.append(this.className);
			builder.append(SpecialCharactersWord.BIGGER_THAN);
			builder.append(super.space);
			builder.append(super.method_seacrh);
			builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
			builder.append(DataTypeWord.STRING);
			builder.append(super.space);
			builder.append(super.parameter_method_seacrh);
			builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
			builder.append(SpecialCharactersWord.BRACE_OPEN);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			
			// DECLARACAO DA VARIAVEL SB
			builder.append(HelperString.spacingSecondLevel);
			builder.append(ReserveWord.FINAL);
			builder.append(super.space);
			builder.append(ClassWord.STRING_BUILDER_CLASS);
			builder.append(super.space);
			builder.append(ClassWord.STRING_BUILDER_OBJECT_CLASS);
			builder.append(super.space);
			builder.append(SpecialCharactersWord.EQUALS);
			builder.append(super.space);
			builder.append(ReserveWord.NEW);
			builder.append(super.space);
			builder.append(ClassWord.STRING_BUILDER_CLASS);
			builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
			builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			
			//DECLARACAO DA VARIAVEL COND
			builder.append(super.lineJump);
			builder.append(HelperString.spacingSecondLevel);
			builder.append(ReserveWord.FINAL);
			builder.append(super.space);
			builder.append(ClassWord.STRING_BUILDER_CLASS);
			builder.append(super.space);
			builder.append(this.nameCondMethodSearch);
			builder.append(super.space);
			builder.append(SpecialCharactersWord.EQUALS);
			builder.append(super.space);
			builder.append(ReserveWord.NEW);
			builder.append(super.space);
			builder.append(ClassWord.STRING_BUILDER_CLASS);
			builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
			builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			
			//DECLARACAO DA CONSULTA SQL
			builder.append(HelperString.spacingSecondLevel);
			builder.append(ClassWord.STRING_BUILDER_OBJECT_CLASS);
			builder.append(MethodWord.APPEND);
			builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
			builder.append(SpecialCharactersWord.DOUBLE_SPACES);
			builder.append(SQLWord.SQL_SELECT);
			builder.append(super.space);
			builder.append(SQLWord.SQL_OBJ);
			builder.append(super.space);
			builder.append(SQLWord.SQL_FROM);
			builder.append(super.space);
			builder.append(this.className);
			builder.append(super.space);
			builder.append(SQLWord.SQL_OBJ);
			builder.append(SpecialCharactersWord.DOUBLE_SPACES);
			builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			
			//DEFINICAO DO TYPED_QUERY
			builder.append(HelperString.spacingSecondLevel);
			builder.append(ReserveWord.FINAL);
			builder.append(super.space);
			builder.append(ClassWord.TYPED_QUERY);
			builder.append(SpecialCharactersWord.LESS_THAN);
			builder.append(this.className);
			builder.append(SpecialCharactersWord.BIGGER_THAN);
			builder.append(super.space);
			builder.append(SQLWord.SQL_QUERY);
			builder.append(super.space);
			builder.append(SpecialCharactersWord.EQUALS);
			builder.append(super.space);
			builder.append(ObjectWord.ENTITY_MANAGER);
			builder.append(SpecialCharactersWord.DOT);
			builder.append(MethodWord.CREATE_QUERY);
			builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
			builder.append(ClassWord.STRING_BUILDER_OBJECT_CLASS);
			builder.append(SpecialCharactersWord.DOT);
			builder.append(MethodWord.TO_STRING);
			builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
			builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
			builder.append(SpecialCharactersWord.COMMA);
			builder.append(this.className);
			builder.append(SpecialCharactersWord.DOT);
			builder.append(ReserveWord.CLASS);
			builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(super.lineJump);

			//DEFINICAO DO RETORNO
			builder.append(HelperString.spacingSecondLevel);
			builder.append(ReserveWord.RETURN);
			builder.append(super.space);
			builder.append(SQLWord.SQL_QUERY);
			builder.append(SpecialCharactersWord.DOT);
			builder.append(MethodWord.GET_RESULT_LIST);
			builder.append(SpecialCharactersWord.PARENTHESIS_OPEN);
			builder.append(SpecialCharactersWord.PARENTHESIS_CLOSE);
			builder.append(SpecialCharactersWord.DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(HelperString.spacingFirstLevel);
			builder.append(SpecialCharactersWord.BRACE_CLOSE);
			builder.append(super.lineJump);

			return builder.toString();
	}
	
	private String createFotterClass(){
		StringBuilder builder = new StringBuilder();
			builder.append(SpecialCharactersWord.BRACE_CLOSE);
		return builder.toString();
	}
	
	public static void main(String[] args) {
		ClassDAOImplTemplate dao = new ClassDAOImplTemplate("Pessoa");
		dao.createClass();
	}
}
