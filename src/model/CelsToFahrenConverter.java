package model;

public class CelsToFahrenConverter {
	
	private double celsius;
	private double fahrenheit;
	
	public CelsToFahrenConverter() {
		super();
	}
	
	public CelsToFahrenConverter(double celsius) {
		super();
		this.celsius = celsius;
		fahrenheitConverter(celsius);
	}	
	
	
	public void getCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}
	
	public void setFahrenheit(double c) {
		fahrenheit  = c;
		
	}
	
	private void fahrenheitConverter(double cels) {
		// TODO Auto-generated method stub
		setCelsius(cels);
		setFahrenheit( 9 * (cels / 5) + 32);
	}

	
	@Override
	public String toString() {
		return "CelsToFahrenConverter [celsius=" + celsius + ", fahrenheit=" + fahrenheit + "]";
	}


}
