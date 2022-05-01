package cl.acabrera.alphabetSoup;

public class WordSearcher2 {
	//atributo
	private char soup[][];

	//constructor
	public WordSearcher2(char soup[][]){
		this.soup = soup;
	}

	/**
	 * El objetivo de este ejercicio es implementar una función que determine si una palabra está en una sopa de letras.
	 *
	 * ### Reglas
	 * - Las palabras pueden estar dispuestas direcciones horizontal o vertical, _no_ en diagonal.
	 * - Las palabras pueden estar orientadas en cualquier sentido, esto es, de derecha a izquierda o viceversa, y de arriba
	 * para abajo o viceversa.
	 * - El cambio de dirección puede estar a media palabra, de modo que, por ejemplo, parte de la palabra
	 * esté horizontal y de izquierda a derecha, parte esté vertical y de arriba hacia abajo, y otra parte horizontal
	 * de derecha a la izquierda.
	 *
	 * @param word	Palabra a buscar en la sopa de letras.
	 *
	 * @return {@link Boolean}	true si la palabra se encuentra
	 * en la sopa de letras.
	 * */
	public boolean isPresent(String word){
		//TODO: resolver
		char primeraLetra=word.charAt(0);
		int largoMatrizFilas=soup.length;
		int largoMatrizColumnas=soup[0].length;
		char letraABuscar;
		int resultadoBusqueda;
		int filAux,colAux;
		String palabraFormada=""+primeraLetra;

		for (int i=0; i<largoMatrizFilas;i++) {
			for (int j=0; j<largoMatrizColumnas;j++) {

				if((soup[i][j]==primeraLetra)) {
					filAux=i;
					colAux=j;
					do {
						letraABuscar=word.charAt(palabraFormada.length());
						resultadoBusqueda=laRosaDeLosVientos(letraABuscar,filAux,colAux);
						if(resultadoBusqueda!=0) {
							palabraFormada=palabraFormada+letraABuscar;
							if (word.equals(palabraFormada)) {
								System.out.printf("¡ENHORABUENA! palabra encontrada en fila:%d  ,col:%d \n",filAux, colAux);
								System.out.println("palabra formada: "+palabraFormada);
								return true;
							}
							switch (resultadoBusqueda) {
							case 1://derecha
								colAux=colAux+1;
								break;
							case 2://abajo
								filAux=filAux+1;
								break;
							case 3://izquierda
								colAux=colAux-1;
								break;
							case 4://arriba
								filAux=filAux-1;
								break;
							default:
								resultadoBusqueda=0;
								break;
							}
							
						}
					} while (resultadoBusqueda!=0);
					palabraFormada=""+primeraLetra;
				}
			}
		}
		return false;
	}





public int laRosaDeLosVientos(char letraABuscar, int f, int c) {

		//hacia la derecha
		if((c+1<soup[0].length)) {
			if((soup[f][c+1]==letraABuscar)) {
				return 1;
			}
		}
		
		//hacia abajo
		if((f+1<soup.length)) {
			if((soup[f+1][c])==letraABuscar) {
				return 2;
			}
		}

		//hacia arriba
		if((f-1>=0)) {
			if((soup[f-1][c])==letraABuscar) {
				return 4;
			}
		}

		//hacia la izquierda
		if((c-1>=0)) {
			if((soup[f][c-1]==letraABuscar)) {
				return 3;
			}
		}
		
		
		return 0;

	}
}







