package goJavaOnline;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TemperatureConverter temp=new TemperatureConverter(0);
		
		System.out.println(temp.celsiumToFarengate());//from Celsium to Faringate
		
		System.out.println(temp.farengateToCelsium());//from Faringate to Celsium
	}

}
