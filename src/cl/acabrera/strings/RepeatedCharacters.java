package cl.acabrera.strings;

import java.util.ArrayList;
import java.util.List;

import cl.acabrera.service.CaracterCantidad;

public class RepeatedCharacters {
    public Boolean isValid(String cadena) {
        //TODO: resolver
    	List<CaracterCantidad> listaCaracterCantidad= new ArrayList<CaracterCantidad>();
		int indice=0;
		int cantidad=0;
    	for (int i = 0; i < cadena.length(); i++) {
    		CaracterCantidad aux=new CaracterCantidad();;
			char letra=cadena.charAt(i);
			System.out.println(letra);
    		if(i==0) {
    			aux.setCaracter(letra);
    			aux.setCantidad(1);
    			listaCaracterCantidad.add(aux);
    			}else if (cadena.charAt(i-1)==letra){
    				aux.setCaracter(letra);
    				cantidad=listaCaracterCantidad.get(indice).getCantidad()+1;
    				aux.setCantidad(cantidad);
    				listaCaracterCantidad.set(indice, aux);
    			}else {
    				indice++;
    				cantidad=1;
        			aux.setCaracter(letra);
        			aux.setCantidad(cantidad);
        			listaCaracterCantidad.add(aux);
    			}
			
		}
//    	System.out.println(listaCaracterCantidad.toString());
    	for (CaracterCantidad datoTemp : listaCaracterCantidad) {
			System.out.printf("caracter: %s      ,valor: %d \n",datoTemp.getCaracter(),datoTemp.getCantidad());
		}
    	int exception=0;
    	int cantidadInicial=0;
    	for (CaracterCantidad caracterCantidadTemp : listaCaracterCantidad) {
    		if (cantidadInicial==0){
    			cantidadInicial=caracterCantidadTemp.getCantidad();    			
    		}else if(caracterCantidadTemp.getCantidad()!=cantidadInicial) {
    			int resultado=Math.abs(caracterCantidadTemp.getCantidad()-cantidadInicial);
    			if (resultado==1) {
        			exception++;
        			cantidadInicial=caracterCantidadTemp.getCantidad();
    				System.out.println("caracter exception: "+caracterCantidadTemp.getCaracter());
    				System.out.println("valor de exception: "+exception);
        			if (exception>1) {
        				return false;
        			}
    				
    			}else {
    				return false;
    			}
    		}
    	}    
    	System.out.println("valor de exception: "+exception);
    	return true;
    	//        throw new UnsupportedOperationException();
        

    }

}
