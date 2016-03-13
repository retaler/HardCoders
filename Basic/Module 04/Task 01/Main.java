package module4.GoJavaOnline;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sideA=20;
		double sideB=20;
		double sideC=35;
		double radius=10;
		SquareCounter count=new SquareCounter();
	
		System.out.println(count.reqtangleSquare(sideA, sideB));
		System.out.println(count.triangleSquare(sideA, sideB, sideC));
		System.out.println(count.circuleSquare(radius));
		
	}

}
