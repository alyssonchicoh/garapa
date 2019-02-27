package br.com.lion.garapa.util;

/**
 * Classe com métodos auxiliares para String
 * @author alyssonnascimento
 * @since 27/02/2019
 */
public class HelperString {

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
				returnText = String.valueOf(text.charAt(i)).toUpperCase();
			}else{
				returnText = String.valueOf(text.charAt(i)).toLowerCase();

			}
		}
		
		return returnText;
		
	}
}
