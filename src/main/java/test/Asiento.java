package test;


public class Asiento {
	String color;
	int precio;
	int registro;
	
	
	void cambiarColor(String color) {
		String[] validColors = {"rojo", "verde", "amarillo", "negro", "blanco"};

		for (String validColor: validColors) {
			if (validColor.equals(color)) {				
				this.color = color;
			}
		}		
	}
}
