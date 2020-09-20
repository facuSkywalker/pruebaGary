package Cerradura;

public class Cerradura {
	
	Integer claveDeApertura = 0;
	Integer cantidadDeFallosConsecutivosQueLaBloquean = 0;
	Boolean abierto = false;
	Integer contador = 0;	
	Boolean bloqueo = false;
	Integer aciertos = 0;
		public Cerradura(Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean) {
			
			this.claveDeApertura = claveDeApertura;
			this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		}
		public Boolean abrir(Integer clave)
	    {
	        if(this.abierto.equals(false) && this.claveDeApertura.equals(clave) && this.cantidadDeFallosConsecutivosQueLaBloquean>contador && this.bloqueo.equals(false))
	       
	        {
	            this.abierto=true;
	            aciertos++;
	            return this.abierto;
	           
	        }
	       
	        else {
	            contador++;
	        }
	            if(this.cantidadDeFallosConsecutivosQueLaBloquean<contador)
	       
	        {
	            this.bloqueo = true;
	        }
	       
	           return this.abierto;
	           
	       
	    }
		
		
		
		public void cerrar() {
			if(abierto.equals(true)) {
				abierto = false;
			}
		}
		
		public Boolean estaAbierta() {
			if(abierto.equals(true)) {
				return abierto;
				
		}return abierto;
		}
		
		public Boolean estaCerrada() {if(abierto.equals(false)) {
			return abierto;
			
	}return abierto;
	}
		
		public Boolean fueBloqueada() {
			if(bloqueo.equals(true)) {
				return bloqueo;
		}else return bloqueo;
                                 }
		
		public Integer contarAperturasExitosas() {
			return aciertos;
		}
		
		public Integer contarAperturasFallidas() {
			return contador;
		}
		}
	
	
	


