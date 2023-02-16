package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		String[] validTypes = {"electrico", "gasolina"};
		
		for(String validType: validTypes) {
			if (validType.equals(tipo)) {
				this.tipo = tipo;
			}
		}
	}
}
