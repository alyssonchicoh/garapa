package br.com.lion.garapa.util;

/**
 * Classe com métodos auxiliares para String
 * @author alyssonnascimento
 * @since 27/02/2019
 */
public class HelperString {
	
	public static String spacingFirstLevel = "	"; 
	public static String spacingSecondLevel = "		"; 
	public static String spacingTHIRDLevel = "			"; 


	/**
	 * Transforma a primeira letra em uma letra maiscula
	 * @param text texto a qual pretende transfomar em primeira letra maiscula
	 * @return texto transformado
	 */
	public static String upperFirst(String text){
		if(text == null || text.equals("")){
			return "";
		}
		
		String returnText = "";
		for (int i = 0; i < text.length(); i++) {
			if(i == 0){
				returnText = returnText + String.valueOf(text.charAt(i)).toUpperCase();
			}else{
				returnText = returnText + String.valueOf(text.charAt(i)).toLowerCase();

			}
		}
		
		return returnText;
		
	}
	
	public static String lowwerAll(String text){
		if(text == null || text.equals("")){
			return "";
		}
		return text.toLowerCase();
	}
	
	public static String upperAll(String text){
		if(text == null || text.equals("")){
			return "";
		}
		return text.toUpperCase();
	}
}
