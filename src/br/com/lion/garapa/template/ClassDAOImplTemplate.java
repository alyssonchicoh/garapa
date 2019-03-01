package br.com.lion.garapa.template;

import br.com.lion.garapa.util.AccessModifierType;
import br.com.lion.garapa.util.InformationHibernate;
import br.com.lion.garapa.util.InformationImport;

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
		builder.append(super.space);

		
		builder.append(super.reservedWord_BRACE_OPEN);
		
		
		return builder.toString();
	}
	
	public static void main(String[] args) {
		ClassDAOImplTemplate dao = new ClassDAOImplTemplate("Pessoa");
		dao.createClass();
	}
}
