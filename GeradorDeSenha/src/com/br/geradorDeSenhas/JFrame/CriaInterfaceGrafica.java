package com.br.geradorDeSenhas.JFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CriaInterfaceGrafica{

	JLabel titulo;
	JLabel qtdLetras;
	JLabel qtdLetrasMaiusculas;
	JLabel qtdNumeros;
	JLabel qtdSimbolos;
	protected JButton gerar;
	protected JButton reset;
	protected JButton sair;
	protected JTextField senhaGerada;
	protected JTextField letras;
	protected JTextField maiusculas;
	protected JTextField numeros;
	protected JTextField simbolos;

	public CriaInterfaceGrafica() {

		JFrame janela = new JFrame();

		titulo = new JLabel();
		titulo.setText("Gerador de senhas");
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("MV Boli", Font.PLAIN, 30));
		titulo.setForeground(new Color(71, 135, 24));
		titulo.setBounds(0, 0, 450, 40);

		qtdLetras = new JLabel();
		qtdLetras.setText("Qtd de Letras minusculas:");
		qtdLetras.setHorizontalAlignment(JLabel.LEFT);
		qtdLetras.setFont(new Font("MV Boli", Font.PLAIN, 20));
		qtdLetras.setForeground(new Color(71, 135, 24));
		qtdLetras.setBounds(0, 50, 450, 40);

		letras = new JTextField();
		letras = new JTextField();
		letras.setPreferredSize(new Dimension(60, 40));
		letras.setFont(new Font("MV Boli", Font.PLAIN, 18));
		letras.setForeground(new Color(71, 135, 24));
		letras.setBackground(Color.black);
		letras.setCaretColor(Color.white);
		letras.setBounds(300, 50, 80, 40);

		qtdLetrasMaiusculas = new JLabel();
		qtdLetrasMaiusculas.setText("Qtd de Letras maiusculas:");
		qtdLetrasMaiusculas.setHorizontalAlignment(JLabel.LEFT);
		qtdLetrasMaiusculas.setFont(new Font("MV Boli", Font.PLAIN, 20));
		qtdLetrasMaiusculas.setForeground(new Color(71, 135, 24));
		qtdLetrasMaiusculas.setBounds(0, 100, 450, 40);

		maiusculas = new JTextField();
		maiusculas = new JTextField();
		maiusculas.setPreferredSize(new Dimension(60, 40));
		maiusculas.setFont(new Font("MV Boli", Font.PLAIN, 18));
		maiusculas.setForeground(new Color(71, 135, 24));
		maiusculas.setBackground(Color.black);
		maiusculas.setCaretColor(Color.white);
		maiusculas.setBounds(300, 100, 80, 40);

		qtdNumeros = new JLabel();
		qtdNumeros.setText("Qtd de numeros:");
		qtdNumeros.setHorizontalAlignment(JLabel.LEFT);
		qtdNumeros.setFont(new Font("MV Boli", Font.PLAIN, 20));
		qtdNumeros.setForeground(new Color(71, 135, 24));
		qtdNumeros.setBounds(0, 150, 450, 40);

		numeros = new JTextField();
		numeros = new JTextField();
		numeros.setPreferredSize(new Dimension(60, 40));
		numeros.setFont(new Font("MV Boli", Font.PLAIN, 18));
		numeros.setForeground(new Color(71, 135, 24));
		numeros.setBackground(Color.black);
		numeros.setCaretColor(Color.white);
		numeros.setBounds(300, 150, 80, 40);

		qtdSimbolos = new JLabel();
		qtdSimbolos.setText("Qtd de simbolos:");
		qtdSimbolos.setHorizontalAlignment(JLabel.LEFT);
		qtdSimbolos.setFont(new Font("MV Boli", Font.PLAIN, 20));
		qtdSimbolos.setForeground(new Color(71, 135, 24));
		qtdSimbolos.setBounds(0, 200, 450, 40);

		simbolos = new JTextField();
		simbolos = new JTextField();
		simbolos.setPreferredSize(new Dimension(60, 40));
		simbolos.setFont(new Font("MV Boli", Font.PLAIN, 18));
		simbolos.setForeground(new Color(71, 135, 24));
		simbolos.setBackground(Color.black);
		simbolos.setCaretColor(Color.white);
		simbolos.setBounds(300, 200, 80, 40);

		gerar = new JButton("GERAR");
		gerar.setHorizontalAlignment(JButton.CENTER);
		gerar.setFont(new Font("MV Boli", Font.PLAIN, 18));
		gerar.setForeground(Color.black);
		gerar.setBounds(0, 250, 150, 40);
		gerar.setFocusable(false);

		reset = new JButton("RESETAR");
		reset.setHorizontalAlignment(JButton.CENTER);
		reset.setFont(new Font("MV Boli", Font.PLAIN, 18));
		reset.setForeground(Color.black);
		reset.setBounds(150, 250, 150, 40);
		reset.setFocusable(false);

		sair = new JButton("SAIR");
		sair.setHorizontalAlignment(JButton.CENTER);
		sair.setFont(new Font("MV Boli", Font.PLAIN, 18));
		sair.setForeground(Color.black);
		sair.setBounds(300, 250, 135, 40);
		sair.setFocusable(false);

		senhaGerada = new JTextField();
		senhaGerada = new JTextField();
		senhaGerada.setPreferredSize(new Dimension(450, 40));
		senhaGerada.setFont(new Font("MV Boli", Font.PLAIN, 18));
		senhaGerada.setForeground(new Color(71, 135, 24));
		senhaGerada.setBackground(Color.black);
		senhaGerada.setCaretColor(Color.white);
		senhaGerada.setText("SENHA GERADA");
		senhaGerada.setBounds(0, 320, 430, 40);

		janela.setTitle("Criado por tavaresProg");
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);
		janela.setSize(450, 450);
		janela.setLocationRelativeTo(null);
		janela.getContentPane().setBackground(new Color(39, 43, 36));

		janela.add(titulo);
		janela.add(qtdLetras);
		janela.add(letras);
		janela.add(qtdLetrasMaiusculas);
		janela.add(maiusculas);
		janela.add(qtdNumeros);
		janela.add(numeros);
		janela.add(qtdSimbolos);
		janela.add(simbolos);
		janela.add(gerar);
		janela.add(reset);
		janela.add(sair);
		janela.add(senhaGerada);
		janela.setVisible(true);

	}
}