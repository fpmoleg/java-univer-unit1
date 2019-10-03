package ua.univer.draw;

public class DrawFigures {

	private static final byte MATRIX_SIZE = 9;
	
	public static void rectangle() {
		
		for (byte i = 0; i <= MATRIX_SIZE; i++) {
			drawStar(); 
		}
		
		newLine();
		
		for (byte i = 0; i < MATRIX_SIZE / 2; i++) {
			for (byte j = 0; j <= MATRIX_SIZE; j++) {
				if (( j == 0 ) || (j == MATRIX_SIZE)) {
					drawStar(); 
				} else {
					drawSpace();
				}
			}
			newLine();
		}
		
		for (byte i = 0; i <= MATRIX_SIZE; i++) {
			drawStar(); 
		}
	}
	
	public static void rightTriangle() {
		for (byte i = 0; i < MATRIX_SIZE - 1; i++) {
			for (byte j = 0; j <= i; j++) {
				if ((j == 0) || (j == i)) {
					drawStar(); 
				} else {
					drawSpace();
				}
			}
			newLine();
		}
		
		for (byte i = 0; i < MATRIX_SIZE; i++) {
			drawStar();
		}
	}
	
	public static void equilateralTriangle() {
		for (byte i = 0; i < MATRIX_SIZE / 2; i++) {
			for (byte j = 0; j < MATRIX_SIZE; j++) {
				if ( (j == ( MATRIX_SIZE / 2 - i )) || (j == ( MATRIX_SIZE / 2 + i ))) {
					drawStar();
				} else {
					drawSpace();
				}
			}
			newLine();
		}
		
		for (byte i = 0; i < MATRIX_SIZE; i++) {
			drawStar();
		}
	}
	
	public static void rhombus() {
		for (byte i = 0; i < MATRIX_SIZE / 2; i++) {
			for (byte j = 0; j < MATRIX_SIZE; j++) {
				if ( (j == ( MATRIX_SIZE / 2 - i )) || (j == ( MATRIX_SIZE / 2 + i ))) {
					drawStar();
				} else {
					drawSpace();
				}
			}
			newLine();
		}
		for (byte i = MATRIX_SIZE / 2; i < MATRIX_SIZE; i++) {
			for (byte j = 0; j < MATRIX_SIZE; j++) {
				if ( (j == ( i - MATRIX_SIZE / 2 )) || (j == ( MATRIX_SIZE -  i + MATRIX_SIZE / 2 - 1))) {
					drawStar();
				} else {
					drawSpace();
				}
			}
			newLine();
		}
		
	}
	
	private static void drawStar() {
		System.out.print("* ");
	}
	
	private static void drawSpace() {
		System.out.print("  ");
	}
	
	private static void newLine() {
		System.out.println();	
	}
}