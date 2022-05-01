package cl.acabrera.sorting;

import java.util.ArrayList;
import java.util.List;

import cl.acabrera.model.Jugador;



public class Sorting {
	public static List<Jugador> ordenarPorPuntuacionYNombre(List<Jugador> jugadores){
		Jugador jugadorAuxiliar=new Jugador();
		//clásico método burbuja, de la vieja escuela, programación pura, ahora para un Objeto
		for (int i=0;i<jugadores.size();i++) {
			for (int j=0;j<jugadores.size();j++) {
				int actual=jugadores.get(i).getPuntuacion();
				int siguiente=jugadores.get(j).getPuntuacion();
				if(actual>siguiente) {
					jugadorAuxiliar=jugadores.get(i);
					jugadores.set(i, jugadores.get(j));
					jugadores.set(j, jugadorAuxiliar);
				}else if(actual==siguiente) {
					String nombre1,nombre2;
					nombre1=jugadores.get(i).getNombre();
					nombre2=jugadores.get(j).getNombre();
					if (nombre1.compareTo(nombre2)<0) {
						jugadorAuxiliar=jugadores.get(i);
						jugadores.set(i, jugadores.get(j));
						jugadores.set(j, jugadorAuxiliar);
					}
				}
			}
		}
		return jugadores; 
//		throw new UnsupportedOperationException();
			}

    /**
     * Se debe ordenar primero por puntuación de manera descendente. Cuando 2 jugadores tienen igual cantidad de puntos,
     * el que tiene menos perdidas se lo considerara el mayor. Luego a igual puntos y perdidas se seguirá usando el
     * nombre de manera ascendente.
     * @param jugadores la lista de jugadores a ordenar
     * @return la lista ordenada de jugadores
     */
	public static List<Jugador> ordenarPorPuntuacionPerdidasYNombre(List<Jugador> jugadores){
		Jugador jugadorAuxiliar=new Jugador();
		List<Jugador> listJugadorAuxiliar=new ArrayList<Jugador>();
		listJugadorAuxiliar=ordenarPorPuntuacionYNombre(jugadores);
		
		int perdidas1,perdidas2;
		int puntuacionActual, puntuacionSiguiente;

		for (int i=0;i<listJugadorAuxiliar.size()-1;i++) {
			
			puntuacionActual=listJugadorAuxiliar.get(i).getPuntuacion();
			puntuacionSiguiente=listJugadorAuxiliar.get(i+1).getPuntuacion();
			
			if(puntuacionActual==puntuacionSiguiente) {
				perdidas1=listJugadorAuxiliar.get(i).getPerdidas();
				perdidas2=listJugadorAuxiliar.get(i+1).getPerdidas();
				
				if (perdidas2<perdidas1) {

					jugadorAuxiliar=listJugadorAuxiliar.get(i);
					listJugadorAuxiliar.set(i, listJugadorAuxiliar.get(i+1));
					listJugadorAuxiliar.set(i+1, jugadorAuxiliar);
				}
			}
		}

		return listJugadorAuxiliar; 
//        throw new UnsupportedOperationException();
	}
	
	
}
