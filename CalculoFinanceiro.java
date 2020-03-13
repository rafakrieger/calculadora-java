
public class CalculoFinanceiro {
	
	public CalculoFinanceiro() {
		
	}

	public void somarValores(Double valor1, Double valor2) {
		Double resultado = valor1 + valor2;
		System.out.println(resultado);
	}
	
	public Double somarValoresCalc(Double valor1, Double valor2) {
		Double resultado = valor1 + valor2;
		return resultado;
	}
	
	public void subtrairValores(Double valor1, Double valor2) {
		Double resultado = valor1 - valor2;
		System.out.println(resultado);
	}
	
	public Double subtrairValoresCalc(Double valor1, Double valor2) {
		Double resultado = valor1 - valor2;
		return resultado;
	}
	
	public void multiplicarValores(double valor1, double valor2) {
		double resultado = valor1 * valor2;
		System.out.println(resultado);
	}
	
	public Double multiplicarValoresCalc(Double valor1, Double valor2) {
		Double resultado = valor1 * valor2;
		return resultado;
	}
	
	public void dividirValores(Double valor1, Double valor2) {
		Double resultado = valor1 / valor2;
		System.out.println(resultado);
	}
	
	public Double dividirValoresCalc(Double valor1, Double valor2) {
		Double resultado = valor1 / valor2;
		return resultado;
	}
	
	public Double raizCalc(Double valor1) {
		Double resultado = Math.sqrt(valor1);;
		return resultado;
	}
	
	public Double pctCalc(Double valor1, Double valor2) {
		Double resultado = valor2 / 100 * valor1;
		return resultado;
	}
	
	
	
}
