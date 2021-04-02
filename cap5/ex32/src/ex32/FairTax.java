package ex32;

//moradia, alimentação, vestuário, transporte, educação, assistência médica e férias

public class FairTax {
	
	private double calculaFairTax;
	
	public FairTax(double moradia, double alimentacao, double vestuario, double transporte,
				   double educacao, double assistenciaMedica, double ferias) {
	
		double x = (moradia + alimentacao + vestuario + transporte + educacao + assistenciaMedica + ferias);
		calculaFairTax = 0.23 * x;
	}
	
	public double getCalculaFairTax() {
		return calculaFairTax;
	}
	
	public void setCalculaFairTax(double calculaFairTax) {
		this.calculaFairTax = calculaFairTax;
	}
}
