package cl.acabrera.main;

import java.util.ArrayList;
import java.util.List;



import cl.acabrera.alphabetSoup.WordSearcher;
import cl.acabrera.alphabetSoup.WordSearcher2;
import cl.acabrera.model.Jugador;
import cl.acabrera.sorting.Sorting;
import cl.acabrera.strings.RepeatedCharacters;

public class MainTestBaufest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 2
//		RepeatedCharacters caracteresRepetidos=new RepeatedCharacters();
//		boolean resultado=caracteresRepetidos.isValid(" eelleemmeennttaall  mmii  qquueerriiddoo  wwaattssoonn");
//		System.out.println(resultado);
		
		//Ejercicio 3
		char alphabetSoup2[][] = {
		        {'O','T','W','U','D','Q','Z','X','R','T','I','V','Z','Z','U','R','P','A','B','Z','Q','Y','V','M','S','X','D','G','Z','O'},
		        {'S','S','E','P','O','R','U','W','A','W','N','G','F','S','H','N','J','P','S','N','O','H','P','D','Q','K','P','J','Y','E'},
		        {'O','M','U','S','N','V','G','A','V','W','M','K','N','D','X','T','E','P','W','N','F','Z','Q','X','X','W','X','T','I','R'},
		        {'T','U','L','Z','P','Z','C','T','C','I','X','S','X','R','Y','L','W','W','V','Z','A','C','P','Y','Q','L','L','I','L','V'},
		        {'P','C','U','H','E','U','U','H','R','Q','J','A','F','X','J','R','B','L','W','G','R','J','K','J','P','O','V','E','L','G'},
		        {'O','Z','C','W','Q','F','O','I','J','F','Q','W','P','J','X','C','X','W','D','O','B','R','U','I','W','W','V','F','W','Y'},
		        {'Q','C','V','F','D','J','P','D','H','Y','Q','G','R','T','T','J','S','X','W','F','W','D','C','M','B','Q','A','D','Y','U'},
		        {'J','R','B','H','F','U','N','M','L','L','Y','H','P','Z','C','O','C','L','P','H','Q','M','A','D','A','Q','M','F','J','J'},
		        {'K','W','X','N','U','V','X','D','V','S','X','W','B','F','O','L','B','B','F','I','S','K','Z','F','T','B','R','K','B','B'},
		        {'T','U','Z','F','A','X','S','Z','G','P','O','T','P','H','R','E','K','X','W','H','G','Y','A','W','Y','W','V','G','I','P'},
		        {'R','K','V','Y','A','V','R','M','Q','A','W','E','M','D','Q','A','X','O','G','F','P','W','D','C','I','Y','F','C','L','F'},
		        {'N','J','F','J','P','P','Z','E','G','P','G','H','L','D','W','D','C','X','S','S','O','H','O','M','U','L','W','P','X','U'},
		        {'P','R','R','C','I','E','B','N','I','W','G','D','A','E','E','D','P','S','U','J','S','T','R','B','B','D','T','Q','O','X'},
		        {'W','E','H','I','Z','A','P','A','T','I','L','L','A','H','P','T','D','V','X','Z','R','W','C','H','P','C','F','J','C','T'},
		        {'M','Z','C','K','M','B','Z','K','E','T','N','U','Q','Y','Q','Q','J','K','B','X','X','Q','O','K','F','Y','P','U','G','B'},
		        {'K','Z','L','E','X','H','Z','Q','D','C','A','I','T','C','P','J','F','L','H','B','A','M','D','F','X','V','C','Z','X','C'},
		        {'S','D','R','P','G','F','K','V','C','F','K','O','S','W','G','E','U','U','X','O','F','F','D','X','Z','E','Z','T','O','P'},
		        {'S','X','O','Y','S','Z','V','I','L','C','T','T','U','K','R','E','T','Q','B','W','P','N','G','S','L','J','T','A','V','B'},
		        {'T','V','Y','M','C','L','I','Y','D','Y','Q','X','H','I','J','F','H','E','Q','N','U','Y','H','E','F','R','D','R','D','V'},
		        {'S','A','Z','Z','A','F','A','L','B','M','F','D','P','V','I','E','L','X','B','W','S','L','B','U','G','U','T','X','K','U'},
		        {'V','B','Y','Y','L','C','K','J','V','F','P','O','L','X','A','L','D','L','O','L','B','L','J','D','V','J','Z','M','Q','K'},
		        {'G','W','E','J','Z','G','D','P','I','C','J','V','B','I','O','M','D','I','J','J','L','T','B','D','Y','N','W','Y','F','H'},
		        {'I','O','N','E','D','M','O','R','E','F','Q','S','D','H','F','T','L','O','G','C','J','Y','X','T','E','L','T','A','E','Y'},
		        {'M','F','M','I','P','I','W','G','H','O','A','J','T','D','J','I','M','E','D','E','M','M','I','K','A','L','M','G','A','T'},
		        {'J','N','D','C','K','I','L','C','V','N','A','F','R','R','G','G','Z','Q','U','E','D','E','Q','Q','P','M','P','Z','C','L'},
		        {'S','U','Q','D','N','C','N','K','O','F','S','E','C','S','Y','F','C','R','L','E','C','G','K','J','V','Q','T','E','Y','Q'},
		        {'V','Z','M','Q','S','D','S','R','J','B','V','W','J','I','P','G','F','Z','Z','D','U','D','N','R','I','R','S','I','A','C'},
		        {'P','F','A','Q','A','I','S','H','Y','R','D','T','Q','B','A','M','L','I','O','O','J','N','T','R','G','M','W','C','L','U'},
		        {'C','J','E','O','N','P','Y','W','H','X','W','J','Q','P','H','H','K','K','B','E','G','R','M','W','Q','A','U','L','L','C'},
		        {'H','O','R','M','X','N','N','A','M','L','T','T','H','B','L','Z','O','C','I','H','S','T','N','T','F','P','T','S','I','H'}
		    };
		
		WordSearcher2 matrizSopa= new WordSearcher2(alphabetSoup2);
//	System.out.println(matrizSopa.isPresent("ZAPATILLA"));   	//ok
//	System.out.println(matrizSopa.isPresent("CAZADOR"));		//ok
//		System.out.println(matrizSopa.isPresent("ORUGA"));		//ok
		System.out.println(matrizSopa.isPresent("HORMONAS"));	//ok
//		System.out.println(matrizSopa.isPresent("RELOJ"));		//ok
//		System.out.println(matrizSopa.isPresent("CUCHILLA"));	//ok

		//NO ESTAN
//		System.out.println(matrizSopa.isPresent("ZAPATILLAS"));
//		System.out.println(matrizSopa.isPresent("CUCHILLAS"));
//		System.out.println(matrizSopa.isPresent("BAUFEST"));

		//		Jugador p1 = new Jugador("Matias", 100, 3);
//		Jugador p2 = new Jugador("Alejandro", 100, 4);
//		Jugador p3 = new Jugador("Enzo", 75, 5);
//		Jugador p4 = new Jugador("Junior", 75, 30);
//		Jugador p5 = new Jugador("Pablo", 150, 0);
//		List<Jugador> jugadores = new ArrayList<Jugador>();
//		jugadores.add(p1);
//		jugadores.add(p2);
//		jugadores.add(p3);
//		jugadores.add(p4);
//		jugadores.add(p5);
//
//		
//		Sorting sorting = new Sorting();
//		List<Jugador> jugadoresOrdenados = new ArrayList<Jugador>();
//		
////		jugadoresOrdenados=sorting.ordenarPorPuntuacionYNombre(jugadores);
//		jugadoresOrdenados=sorting.ordenarPorPuntuacionPerdidasYNombre(jugadores);
//			
		
	}

}
