package model;

public class FahrenToCelsConverter {
	
	
	private double fahrenheit;
	private double celsius;
	
	public FahrenToCelsConverter() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public FahrenToCelsConverter(double fahrenheit) {
		super();
		this.fahrenheit = fahrenheit;
		celsiusConverter(fahrenheit);
		
	}
	
	public void getFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	
	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double f) {
		this.celsius = f;
		
						
	}
	
	public void celsiusConverter(double fahr) {
				
		setFahrenheit(fahr);
		setCelsius((fahr-32) * 5 / 9);
	}	

	@Override
	public String toString() {
		return "FahrenToCelsConverter [fahrenheit=" + fahrenheit + ", celsius=" + celsius + "]";
	}
	
	

}
