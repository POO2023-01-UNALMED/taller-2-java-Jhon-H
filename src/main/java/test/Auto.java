package test;


public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos = {};
	String marca;
	Motor motor;
	int registro;
	static int catidadCreados;
	
	
	int cantidadAsientos() {
    int totalAsientos = 0;

    for (Asiento asiento: asientos) {
      if (asiento != null) {
        totalAsientos++;
      }
    }

		return totalAsientos;
	}

	String verificarIntegridad() {
		if (motor != null && motor.registro != registro) {
			return "Las piezas no son originales";
		}
		
		for (Asiento asiento: asientos) {
			if (asiento != null && asiento.registro != registro) {
				return "Las piezas no son originales";
			}
		}
		
		return "Auto original";

	}
}
