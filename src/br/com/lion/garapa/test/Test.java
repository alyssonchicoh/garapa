package br.com.lion.garapa.test;

import br.com.lion.garapa.template.ClassModel;

public class Test {
	public static void main(String[] args) {
		ClassModel model = new ClassModel("Pessoa");
		model.addAttribute("Integer", "id");
		model.addAttribute("String", "nome");
		model.addAttribute("Integer", "idade");
		model.createClass();

	}
}
