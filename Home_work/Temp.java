package Home_work;

public class Temp {
//	7. Temperature Converter
//	Create class:
//	Constructor â†’ Celsius
//	Method â†’ convert to Fahrenheit
	float Celsius;
	public Temp(float Celsius) {
		this.Celsius=Celsius;
	}
public float Tempcal() {
	float tempcal=(9/5*Celsius)+32;
	return tempcal;
}
}
