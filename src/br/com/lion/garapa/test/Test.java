package br.com.lion.garapa.test;

import br.com.lion.garapa.template.ClassModelTemplate;

public class Test {
	public static void main(String[] args) {
		ClassModelTemplate model = new ClassModelTemplate("Livro");
		model.addAttribute("String", "autor");
		model.addAttribute("String", "nome");
		model.addAttribute("Double", "preco");
		model.createClass();
		

	}
}
