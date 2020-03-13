import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6631930861516365843L;

	private Double numero1;
	private Double numero2;
	private String operacao;

	public static void main(String[] args) {

		Calculadora objCalc = new Calculadora();

		objCalc.criarComponentes();

		objCalc.setTitle("Calculadora");
		objCalc.setSize(300, 250);
		objCalc.setLocationRelativeTo(null);
		objCalc.setLayout(null);
		objCalc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		objCalc.setVisible(true);

	}

	public void criarComponentes() {

		JTextField visor = new JTextField();
		visor.setBounds(2, 2, 280, 30);
		this.add(visor);

		JButton botao1 = new JButton("1");
		botao1.setBounds(2, 33, 45, 40);
		this.add(botao1);

		JButton botao2 = new JButton("2");
		botao2.setBounds(48, 33, 45, 40);
		this.add(botao2);

		JButton botao3 = new JButton("3");
		botao3.setBounds(94, 33, 45, 40);
		this.add(botao3);

		JButton botao4 = new JButton("4");
		botao4.setBounds(2, 75, 45, 40);
		this.add(botao4);

		JButton botao5 = new JButton("5");
		botao5.setBounds(48, 75, 45, 40);
		this.add(botao5);

		JButton botao6 = new JButton("6");
		botao6.setBounds(94, 75, 45, 40);
		this.add(botao6);

		JButton botao7 = new JButton("7");
		botao7.setBounds(2, 117, 45, 40);
		this.add(botao7);

		JButton botao8 = new JButton("8");
		botao8.setBounds(48, 117, 45, 40);
		this.add(botao8);

		JButton botao9 = new JButton("9");
		botao9.setBounds(94, 117, 45, 40);
		this.add(botao9);

		JButton botao0 = new JButton("0");
		botao0.setBounds(48, 159, 45, 40);
		this.add(botao0);

		JButton botaoPonto = new JButton(".");
		botaoPonto.setBounds(2, 159, 45, 40);
		this.add(botaoPonto);

		JButton botaoIgual = new JButton("=");
		botaoIgual.setBounds(94, 159, 45, 40);
		this.add(botaoIgual);

		JButton botaoLimpar = new JButton("CE");
		botaoLimpar.setBounds(187, 33, 90, 40);
		this.add(botaoLimpar);

		JButton botaoDel = new JButton("C");
		botaoDel.setBounds(187, 75, 90, 40);
		this.add(botaoDel);

		// Botões de operação

		JButton botaoMais = new JButton("+");
		botaoMais.setBounds(140, 33, 45, 40);
		this.add(botaoMais);

		JButton botaoMenos = new JButton("-");
		botaoMenos.setBounds(140, 75, 45, 40);
		this.add(botaoMenos);

		JButton botaoMult = new JButton("x");
		botaoMult.setBounds(140, 117, 45, 40);
		this.add(botaoMult);

		JButton botaoDiv = new JButton("÷");
		botaoDiv.setBounds(140, 159, 45, 40);
		this.add(botaoDiv);

		JButton botaoRaiz = new JButton("√");
		botaoRaiz.setBounds(187, 117, 90, 40);
		this.add(botaoRaiz);

		JButton botaoPct = new JButton("%");
		botaoPct.setBounds(187, 159, 90, 40);
		this.add(botaoPct);

		// Ações dos botões

		botao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao1.getText());

			}
		});

		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao2.getText());

			}
		});

		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao3.getText());

			}
		});

		botao4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao4.getText());

			}
		});

		botao5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao5.getText());

			}
		});

		botao6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao6.getText());

			}
		});

		botao7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao7.getText());

			}
		});

		botao8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao8.getText());

			}
		});

		botao9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao9.getText());

			}
		});

		botao0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText(visor.getText() + botao0.getText());
				if ((visor.getText().length() == 1) && (visor.getText().substring(0, 1).equals("0"))
						&& (!visor.getText().substring(1, 1).equals("."))) {
					visor.setText(visor.getText().replace("0", ""));
				}

			}
		});

		botaoPonto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ponto) {
				visor.setText(visor.getText() + botaoPonto.getText());
				if (botaoPonto.getText().length() < 1) {
					visor.setText(null);

				}

			}
		});

		botaoLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText("");

			}
		});

		botaoMais.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
				operacao = "somar";
				visor.setText("");

			}
		});

		botaoMenos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
				operacao = "subtrair";
				visor.setText("");

			}
		});

		botaoMult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
				operacao = "multiplicar";
				visor.setText("");

			}
		});

		botaoDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
				operacao = "dividir";
				visor.setText("");

			}
		});

		botaoPct.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
				operacao = "porcentagem";
				visor.setText("");

			}
		});

		botaoRaiz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(visor.getText());
				CalculoFinanceiro objRaiz = new CalculoFinanceiro();
				Double resultado;
				resultado = objRaiz.raizCalc(numero1);
				visor.setText(resultado.toString());

			}
		});

		botaoDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String apagar = visor.getText();
				StringBuilder del = new StringBuilder(apagar);
				apagar = String.valueOf(del.deleteCharAt(apagar.length() - 1));
				visor.setText(apagar);

			}
		});

		botaoIgual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				numero2 = Double.parseDouble(visor.getText());
				Double resultado;
				CalculoFinanceiro objOperacao = new CalculoFinanceiro();

				if (operacao == "somar") {
					// resultado = numero1 + numero2;
					resultado = objOperacao.somarValoresCalc(numero1, numero2);
					visor.setText(resultado.toString());
				}

				if (operacao == "subtrair") {
					// resultado = numero1 - numero2;
					resultado = objOperacao.subtrairValoresCalc(numero1, numero2);
					visor.setText(resultado.toString());
				}

				if (operacao == "multiplicar") {
					// resultado = numero1 * numero2;
					resultado = objOperacao.multiplicarValoresCalc(numero1, numero2);
					visor.setText(resultado.toString());
				}

				if (operacao == "dividir") {
					// resultado = numero1 / numero2;
					resultado = objOperacao.dividirValoresCalc(numero1, numero2);
					visor.setText(resultado.toString());
				}

				if (operacao == "porcentagem") {
					resultado = objOperacao.pctCalc(numero1, numero2);
					visor.setText(resultado.toString());
				}

			}
		});

	}

}
