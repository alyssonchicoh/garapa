package br.com.lion.garapa.test;

import br.com.lion.garapa.template.ClassModel;

public class Test {
	public static void main(String[] args) {
		ClassModel model = new ClassModel("Livro");
		model.addAttribute("String", "autor");
		model.addAttribute("String", "nome");
		model.addAttribute("Double", "preco");
		model.createClass();
		

	}
}
