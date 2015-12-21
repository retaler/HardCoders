package module4.GoJavaOnline;

public class SquareCounter {
	

	public double triangleSquare(double sideA, double sideB, double sideC){
		double p=(sideA+sideB+sideC)/2;
		return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}
	
	public double reqtangleSquare(double sideA, double sideB){
		
		return sideA*sideB;
	}
	
	public double circuleSquare(double radius){
		
		return Math.PI*radius*radius;
	}

}
