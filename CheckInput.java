package chess;

public class CheckInput {
	
	
	public boolean checkCoordinateValidity(String input){
		if (input.length() != 2) {
			return false;
		}
		char f = input.charAt(0);
		char m = input.charAt(input.length() - 1);
		boolean colval = true;
		boolean rowval = true;
		if (f != '1' && f != '2' && f != '3' && f != '4' && f != '5' && f != '6' && f != '7' && f != '8') {
			rowval = false;
		} else {
			rowval = true;
		}
		if (m == 'a' || m == 'b' || m == 'c' || m == 'd' || m == 'e' || m == 'f' || m == 'g' || m == 'h') {
			colval = true;
		} else {
			colval = false;
		}
		if (colval == true && rowval == true) {
			return true;
		} else {
			return false;
		}

	}
}
