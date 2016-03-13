package goJavaOnline;

public class TemperatureConverter {
	private double temperaturValue; 
	
	
	
	public TemperatureConverter(double temperaturValue) {
		super();
		this.temperaturValue = temperaturValue;
	}

	public double celsiumToFarengate(){
		return 9/5*this.temperaturValue+32;
	}

	public double farengateToCelsium(){
		return (double) 5/9*(this.temperaturValue-(double)32);
	}

	public double getTemperaturValue() {
		return temperaturValue;
	}

	public void setTemperaturValue(double temperaturValue) {
		this.temperaturValue = temperaturValue;
	}
	
	
}
