package br.com.lion.garapa.model;

/**
 * REPRESENTAÇÃO DE UM NOME DE CLASSE COM TODAS SUAS VARIAÇÕES
 * @author alyssonnascimento
 * @since 12/03/2019
 *
 */
public class ClassName {

	private String className;
	private String classNameFirtsUP;
	private String classNameUpper;
	private String classNameLower;
	private String classNameSmall;
	private String classNameCamelCase;
	
	public ClassName(String className){
		this.className = className;
		transformClassNameIntoSmall();
		transformClassNameLower();
	}
	
	
	
	@Override
	public String toString() {
		return className;
	}



	/**
	 * GERAR O NOME DA CLASSE EM SUA FORMA REDUZIDA
	 */
	private void transformClassNameIntoSmall(){
		if(className.length() >= 3){
			classNameSmall = className.substring(0, 3).toLowerCase();
		}else{
			classNameSmall = className;
		}
	}
	private void transformClassNameLower(){
		this.classNameLower = className.toLowerCase();
	}
	
	private void transformClassNameIntoCamelCase(){
		
	}

	public String getClassName() {
		return className;
	}

	public String getClassNameFirtsUP() {
		return classNameFirtsUP;
	}

	public String getClassNameUpper() {
		return classNameUpper;
	}

	public String getClassNameLower() {
		return classNameLower;
	}

	public String getClassNameSmall() {
		return classNameSmall;
	}

	public String getClassNameCamelCase() {
		return classNameCamelCase;
	}

	
	
}
