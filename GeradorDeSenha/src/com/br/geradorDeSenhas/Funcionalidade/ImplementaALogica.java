package com.br.geradorDeSenhas.Funcionalidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.br.geradorDeSenhas.JFrame.CriaInterfaceGrafica;

public class ImplementaALogica extends CriaInterfaceGrafica {

	private int valorLetraMaiuscula;
	private int valorLetras;
	private int valorNumeros;
	private int valorSimbolos;

	private Random r = new Random();

	private List<Character> caracteres = new ArrayList<Character>();

	private String conjuntoLetras = "abcdefghijklmnopqrstuvwxyz";
	private String conjuntoNumeros = "0123456789";
	private String conjuntoSimbolos = "!@#$%&*";

	void reset() {
		letras.setText("0");
		maiusculas.setText("0");
		numeros.setText("0");
		simbolos.setText("0");
		senhaGerada.setText("");
	}

	void sair() {
		System.exit(0);
	}

	void checarCamposVazios() {

		if (maiusculas.getText().isEmpty()) {
			maiusculas.setText("0");
		}

		if (letras.getText().isEmpty()) {
			letras.setText("0");
		}

		if (numeros.getText().isEmpty()) {
			numeros.setText("0");
		}

		if (numeros.getText().isEmpty()) {
			numeros.setText("0");
		}

		if (simbolos.getText().isEmpty()) {
			simbolos.setText("0");
		}
	}

	void embaralhar() {

		Collections.shuffle(caracteres);
		senhaGerada.setText(caracteres.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", ""));
		caracteres.clear();
	}

	void gerar() {

		checarCamposVazios();

		valorLetraMaiuscula = Integer.parseInt(maiusculas.getText());
		valorLetras = Integer.parseInt(letras.getText());
		valorNumeros = Integer.parseInt(numeros.getText());
		valorSimbolos = Integer.parseInt(simbolos.getText());

		if (valorLetraMaiuscula != 0) {
			for (int i = 0; i < valorLetraMaiuscula; i++) {
				caracteres.add(conjuntoLetras.toUpperCase().charAt(r.nextInt(conjuntoLetras.length())));
			}
		}

		for (int i = 0; i < valorLetras; i++) {
			caracteres.add(conjuntoLetras.charAt(r.nextInt(conjuntoLetras.length())));
		}

		for (int i = 0; i < valorNumeros; i++) {
			caracteres.add(conjuntoNumeros.charAt(r.nextInt(conjuntoNumeros.length())));
		}

		for (int i = 0; i < valorSimbolos; i++) {
			caracteres.add(conjuntoSimbolos.charAt(r.nextInt(conjuntoSimbolos.length())));
		}

		embaralhar();

	}
}
