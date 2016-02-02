package goJava.online;

import java.util.ArrayList;

public class Shiphrator {
	private	final Integer MOVE_FACTOR = 30;
	ArrayList<Character> alphabet=new ArrayList<>();
	
	public Shiphrator() {
		super();
		creatorTable();
	}
	protected void creatorTable(){
		for(char k='0';k<='~';k++){
			alphabet.add(k);
			
		}
		alphabet.add(' ');
		alphabet.add('!');
		alphabet.add(',');
		alphabet.add('.');
	}
	
	public final String shiphrator(String source) {
		String result = "";
		char symbolOrigin;
		final int MODDER=alphabet.size();
		for (int i = 0; i < source.length(); i++) {
			symbolOrigin = source.charAt(i);
			int movement = alphabet.indexOf(symbolOrigin) + MOVE_FACTOR;
			if(movement>alphabet.size())movement=movement-alphabet.size();
			result += alphabet.get(movement % MODDER);

		}
		return result;
	}

	public final String deShiphrator(String encodedSource) {
		String result = "";
		char decSymbol;
		int demoder=alphabet.size();
		for (int j = 0; j < encodedSource.length(); j++) {
			decSymbol = encodedSource.charAt(j);
			int backMovement = alphabet.indexOf(decSymbol) - MOVE_FACTOR;
			if(backMovement<0) backMovement=backMovement+alphabet.size();
			result += alphabet.get(backMovement % demoder);

		}
		return result;
	}
}
