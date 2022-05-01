package cl.acabrera.service;

public class CaracterCantidad {
	char caracter;
	int cantidad;

	public void updateCaracterCantidad (CaracterCantidad caracterCantidad) {
		this.caracter=caracterCantidad.getCaracter();
		this.cantidad=caracterCantidad.getCantidad();
	}
	
	public CaracterCantidad() {
		// TODO Auto-generated constructor stub
	}




public CaracterCantidad(char caracter, int cantidad) {
		super();
		this.caracter = caracter;
		this.cantidad = cantidad;
	}




public char getCaracter() {
		return caracter;
	}




	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}




	public int getCantidad() {
		return cantidad;
	}




	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}




@Override
public String toString() {
	return "CaracterCantidad [caracter=" + caracter + ", cantidad=" + cantidad + "]";
}
	


}
