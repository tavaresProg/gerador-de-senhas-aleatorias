package com.br.geradorDeSenhas.Funcionalidade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImplementarDinamismo extends ImplementaALogica implements ActionListener {

	public ImplementarDinamismo() {

		gerar.addActionListener(this);
		reset.addActionListener(this);
		sair.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sair) {
			
			sair();
		}

		if (e.getSource() == reset) {
			
			reset();
		}

		if (e.getSource() == gerar) {
			
			gerar();
			
		}

	}

}
