// Froghats: Kevin Cheng, Tasnim Chowdhury, Prattay Dey
// APCS pd8
// L06: Read/Review/Expand
// 2022-02-11
// time spent: 3 hr

public class CaesarCipher {

	final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	final static String CAPSALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


	public static String encrypt ( String message, int shift ) {
		String encrypted = "";
		for ( int i = 0; i < message.length(); i++ ) {
			String letter = message.substring( i, i + 1 );
			//If the letter is lowercase, CAPSALPHABET.indexOf( letter ) will be -1 regardless
			//of the letter and vice versa.
			int LetterNumber = ALPHABET.indexOf( letter ) + CAPSALPHABET.indexOf( letter ) + 1;
			//If the numerical value and the shift sum to greater than 26, it must be reduced
			//in order to take the substring from ALPHABET.
			int NewLetterNumber = ( LetterNumber + shift ) % 26;
			//CAPSALPHABET.indexOf( letter ) == -1 tells if the letter is capitalized or not,
			//which allows us to replace it accordingly.
			if ( LetterNumber != -1 && CAPSALPHABET.indexOf( letter ) == -1 )
				encrypted += ALPHABET.substring( NewLetterNumber, NewLetterNumber + 1 );
			else if ( LetterNumber != -1 )
				encrypted += CAPSALPHABET.substring( NewLetterNumber, NewLetterNumber + 1 );
			//For when the character isn't alphabetical
			else
				encrypted += letter;
		}
		return encrypted;
	}

	public static void main( String[] args ) {
		String message = "hOlY, HoLy";
		System.out.println( encrypt( message, 23 ) );
		System.out.println( "Should return eLiV, ElIv" );
	}
}
