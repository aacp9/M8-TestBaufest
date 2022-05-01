package cl.acabrera.alphabetSoup;

public class WordSearcher {
	//atributo
	   private char soup[][];
	   
	   //constructor
	    public WordSearcher(char soup[][]){
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
	    	String unirPalabra="";
	    	char primeraLetra=word.charAt(0);
	    	int largoPalabra=word.length();
	    	int largoMatrizFilas=soup.length;
	    	int largoMatrizColumnas=soup[0].length;
	    	
	    	//busqueda en horizontal DERECHA FUNCIONANDO
	    	for (int i=0; i<largoMatrizFilas;i++) {
		    	for (int j=0; j<largoMatrizColumnas;j++) {
		    
		    		if((soup[i][j]==primeraLetra) &&((j+largoPalabra)<largoMatrizColumnas)) {
		    			for(int x=0;x<largoPalabra;x++) {
			    			unirPalabra=unirPalabra+soup[i][j+x];
		    			}
	//	    			System.out.println("Palabra formada: "+unirPalabra);
		    			if(unirPalabra.equals(word)) {
		    				return true;
		    			}else {
		    				unirPalabra="";
		    						
		    			}
		    		}
		    	}
	    	}
	    	
	    	//busqueda en horizontal IZQUIERDA
	    	for (int i=largoMatrizFilas-1; i>=0;i--) {
		    	for (int j=largoMatrizColumnas-1; j>=0;j--) {
		    		if((soup[i][j]==primeraLetra)&&((j-largoPalabra)>=0)) {
		    			for(int x=0;x<largoPalabra;x++) {
			    			unirPalabra=unirPalabra+soup[i][j-x];
		    			}
		//    			System.out.println("Palabra formada: "+unirPalabra);
		    			if(unirPalabra.equals(word)) {
		    				return true;
		    			}else {
		    				unirPalabra="";
		    						
		    			}
		    		}
		    	}
	    	}
	    	
//BUSQUEDA VERTICAL HACIA ARRIBA
	    	for (int j=0; j<largoMatrizColumnas;j++) {
		    	for (int i=largoMatrizFilas-1; i>=0;i--) {
	    
	    		if((soup[i][j]==primeraLetra) &&((i-largoPalabra)>=0)) {
	    			for(int x=0;x<largoPalabra;x++) {
		    			unirPalabra=unirPalabra+soup[i-x][j];
	    			}
	    //			System.out.println("Palabra formada: "+unirPalabra);
	    			if(unirPalabra.equals(word)) {
	    				return true;
	    			}else {
	    				unirPalabra="";
	    						
	    			}
	    		}
	    	}
    	}

	    	//BUSQUEDA VERTITAL HACIA abajo
	    	for (int j=0; j<largoMatrizColumnas;j++) {
		    	for (int i=0; i<largoMatrizFilas;i++) {
	    
	    		if((soup[i][j]==primeraLetra) &&((i+largoPalabra)<largoMatrizFilas)) {
	    			for(int x=0;x<largoPalabra;x++) {
		    			unirPalabra=unirPalabra+soup[i+x][j];
	    			}
	    //			System.out.println("Palabra formada: "+unirPalabra);
	    			if(unirPalabra.equals(word)) {
	    				return true;
	    			}else {
	    				unirPalabra="";
	    						
	    			}
	    		}
	    	}
    	}
	    	
	    	
	    	
//	    	System.out.println("word: "+word);
	    	return false;

	       // throw new UnsupportedOperationException();
	    }
}
