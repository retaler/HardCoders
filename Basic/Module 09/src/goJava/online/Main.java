package goJava.online;

public class Main {

	public static void main(String[] args) {
	String source="If you want to be ok, be yourself every day!";
	Shiphrator shiphr=new Shiphrator();
	System.out.println("Original string: "+source);
	
	String encodedString=shiphr.shiphrator(source);
	System.out.println("Encoded string: "+encodedString);
	String decodedString=shiphr.deShiphrator(encodedString);
	System.out.println("Decoded string: "+decodedString);

	}

}
