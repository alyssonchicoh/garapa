package br.com.lion.garapa.template;

import br.com.lion.Information.InformationAnnotation;
import br.com.lion.Information.InformationClass;
import br.com.lion.Information.InformationHibernate;
import br.com.lion.Information.InformationImport;
import br.com.lion.Information.InformationMethod;
import br.com.lion.Information.InformationObject;
import br.com.lion.Information.InformationSQL;
import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.HelperString;

/**
 * CLASSE UTILIZADA PARA REALIZAR A IMPLEMENTAÇÇAO DA CLASSE DAOImpl
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
	 * Mï¿½TODO UTILIZADO PARA AGRUPAR TODAS A CRIAï¿½ï¿½O DA CLASSE DE DAO
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
		
		//CRIAÇÃO DO PACOTE
		builder.append(super.reservedWord_PACKAGE);
		builder.append(super.space);
		builder.append(super.name_dao_impl_package);
		builder.append(super.reserveWord_DOT_AND_COMMA);
		builder.append(super.lineJump);
		builder.append(super.lineJump);

		
		//IMPORTACOES
		builder.append(super.reservedWord_IMPORT);
		builder.append(super.space);
		builder.append(InformationImport.JAVAX_PERSISTENCE_TYPEDQUERY);
		builder.append(super.reserveWord_DOT_AND_COMMA);
		builder.append(super.lineJump);
		
		builder.append(super.reservedWord_IMPORT);
		builder.append(super.space);
		builder.append(InformationImport.ORG_SPRING_FRAMEWORK_STEREOTYPE_REPOSITORY);
		builder.append(super.reserveWord_DOT_AND_COMMA);
		builder.append(super.lineJump);
		
		builder.append(super.reservedWord_IMPORT);
		builder.append(super.space);
		builder.append(InformationImport.ORG_SPRING_FRAMEWORK_TRANSACTION_ANNOTATION_TRANSACTIONAL);
		builder.append(super.reserveWord_DOT_AND_COMMA);
		builder.append(super.lineJump);
		
		builder.append(super.reservedWord_IMPORT);
		builder.append(super.space);
		builder.append(super.name_model_package);
		builder.append(super.reserveWord_DOT);
		builder.append(this.className);
		builder.append(super.reserveWord_DOT_AND_COMMA);
		builder.append(super.lineJump);

		builder.append(super.reservedWord_IMPORT);
		builder.append(super.space);
		builder.append(super.name_dao_package);
		builder.append(super.reserveWord_DOT);
		builder.append(this.className);
		builder.append(super.reserveWord_DOT_AND_COMMA);
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
			builder.append(InformationHibernate.REPOSITORY);
			builder.append(super.lineJump);
			builder.append(InformationHibernate.TRANSACTIONAL);
			builder.append(super.lineJump);
			builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
			builder.append(super.space);
			builder.append(super.reservedWord_CLASS);
			builder.append(super.space);
			builder.append(className + classDomain);
			builder.append(super.space);
			builder.append(super.reservedWord_EXTENDS);
			builder.append(super.space);
			builder.append(super.name_class_generic_dao);
			builder.append(super.reserveWord_LESS_THAN);
			builder.append(this.className);
			builder.append(super.reserveWord_COMMA);
			builder.append(super.type_INTEGER);
			builder.append(super.reserveWord_BIGGER_THAN);
			builder.append(super.space);
			builder.append(super.reservedWord_IMPLEMENTS);
			builder.append(super.space);
			builder.append(this.className);
			builder.append(HelperString.upperAll(this.name_dao_package));
			builder.append(super.space);
			builder.append(super.reservedWord_BRACE_OPEN);
		return builder.toString();
	}
	
	
	/**
	 * Mï¿½TODO UTILIZADO PARA CONSTRUIR A DEFINIï¿½ï¿½O DOS Mï¿½TODOS
	 * @return STRING COM O CONTEUDO DA DEFINIï¿½ï¿½O DOS Mï¿½TODOS
	 */
	private String createBodyClass(){
		StringBuilder builder = new StringBuilder();
		builder.append(super.lineJump);
		
			//DECLARACAO DA SOBREESCRITA
			builder.append(super.lineJump);
			builder.append(HelperString.spacingFirstLevel);
			builder.append(InformationAnnotation.OVERRIDE);
			
			//DECLARACAO DO NOME DO METODO
			builder.append(super.lineJump);
			builder.append(HelperString.spacingFirstLevel);
			builder.append(AccessModifierType.ACCESS_MODIFIER_PUBLIC);
			builder.append(super.space);
			builder.append(super.type_LIST);
			builder.append(super.reserveWord_LESS_THAN);
			builder.append(this.className);
			builder.append(super.reserveWord_BIGGER_THAN);
			builder.append(super.space);
			builder.append(super.method_seacrh);
			builder.append(super.reservedWord_PARENTHESIS_OPEN);
			builder.append(super.type_STRING);
			builder.append(super.space);
			builder.append(super.parameter_method_seacrh);
			builder.append(super.reservedWord_PARENTHESIS_CLOSE);
			builder.append(super.reservedWord_BRACE_OPEN);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			
			// DECLARACAO DA VARIAVEL SB
			builder.append(HelperString.spacingSecondLevel);
			builder.append(super.reservedWord_FINAL);
			builder.append(super.space);
			builder.append(InformationClass.STRING_BUILDER_CLASS);
			builder.append(super.space);
			builder.append(InformationClass.STRING_BUILDER_OBJECT_CLASS);
			builder.append(super.space);
			builder.append(super.reserveWord_EQUALS);
			builder.append(super.space);
			builder.append(super.reservedWord_NEW);
			builder.append(super.space);
			builder.append(InformationClass.STRING_BUILDER_CLASS);
			builder.append(super.reservedWord_PARENTHESIS_OPEN);
			builder.append(super.reservedWord_PARENTHESIS_CLOSE);
			builder.append(super.reserveWord_DOT_AND_COMMA);
			
			//DECLARACAO DA VARIAVEL COND
			builder.append(super.lineJump);
			builder.append(HelperString.spacingSecondLevel);
			builder.append(super.reservedWord_FINAL);
			builder.append(super.space);
			builder.append(InformationClass.STRING_BUILDER_CLASS);
			builder.append(super.space);
			builder.append(this.nameCondMethodSearch);
			builder.append(super.space);
			builder.append(super.reserveWord_EQUALS);
			builder.append(super.space);
			builder.append(super.reservedWord_NEW);
			builder.append(super.space);
			builder.append(InformationClass.STRING_BUILDER_CLASS);
			builder.append(super.reservedWord_PARENTHESIS_OPEN);
			builder.append(super.reservedWord_PARENTHESIS_CLOSE);
			builder.append(super.reserveWord_DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			
			//DECLARACAO DA CONSULTA SQL
			builder.append(HelperString.spacingSecondLevel);
			builder.append(InformationClass.STRING_BUILDER_OBJECT_CLASS);
			builder.append(super.method_append);
			builder.append(super.reservedWord_PARENTHESIS_OPEN);
			builder.append(super.reserveWord_DOUBLE_SPACES);
			builder.append(InformationSQL.SQL_SELECT);
			builder.append(super.space);
			builder.append(InformationSQL.SQL_OBJ);
			builder.append(super.space);
			builder.append(InformationSQL.SQL_FROM);
			builder.append(super.space);
			builder.append(this.className);
			builder.append(super.space);
			builder.append(InformationSQL.SQL_OBJ);
			builder.append(super.reserveWord_DOUBLE_SPACES);
			builder.append(super.reservedWord_PARENTHESIS_CLOSE);
			builder.append(super.lineJump);
			builder.append(super.lineJump);
			
			//DEFINICAO DO TYPED_QUERY
			builder.append(HelperString.spacingSecondLevel);
			builder.append(super.reservedWord_FINAL);
			builder.append(super.space);
			builder.append(InformationClass.TYPED_QUERY);
			builder.append(super.reserveWord_LESS_THAN);
			builder.append(this.className);
			builder.append(super.reserveWord_BIGGER_THAN);
			builder.append(super.space);
			builder.append(InformationSQL.SQL_QUERY);
			builder.append(super.space);
			builder.append(super.reserveWord_EQUALS);
			builder.append(super.space);
			builder.append(InformationObject.ENTITY_MANAGER);
			builder.append(super.reserveWord_DOT);
			builder.append(InformationMethod.CREATE_QUERY);
			builder.append(super.reservedWord_PARENTHESIS_OPEN);
			builder.append(InformationClass.STRING_BUILDER_OBJECT_CLASS);
			builder.append(super.reserveWord_DOT);
			builder.append(InformationMethod.TO_STRING);
			builder.append(super.reservedWord_PARENTHESIS_OPEN);
			builder.append(super.reservedWord_PARENTHESIS_CLOSE);
			builder.append(super.reserveWord_COMMA);
			builder.append(this.className);
			builder.append(super.reserveWord_DOT);
			builder.append(super.reservedWord_CLASS);
			builder.append(super.reservedWord_PARENTHESIS_CLOSE);
			builder.append(super.reserveWord_DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(super.lineJump);

			//DEFINICAO DO RETORNO
			builder.append(HelperString.spacingSecondLevel);
			builder.append(super.reservedWord_RETURN);
			builder.append(super.space);
			builder.append(InformationSQL.SQL_QUERY);
			builder.append(super.reserveWord_DOT);
			builder.append(InformationMethod.GET_RESULT_LIST);
			builder.append(super.reservedWord_PARENTHESIS_OPEN);
			builder.append(super.reservedWord_PARENTHESIS_CLOSE);
			builder.append(super.reserveWord_DOT_AND_COMMA);
			builder.append(super.lineJump);
			builder.append(HelperString.spacingFirstLevel);
			builder.append(super.reservedWord_BRACE_CLOSE);
			builder.append(super.lineJump);

			return builder.toString();
	}
	
	private String createFotterClass(){
		StringBuilder builder = new StringBuilder();
			builder.append(super.reservedWord_BRACE_CLOSE);
		return builder.toString();
	}
	
	public static void main(String[] args) {
		ClassDAOImplTemplate dao = new ClassDAOImplTemplate("Pessoa");
		dao.createClass();
	}
}
