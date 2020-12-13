/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *     Clase que centraliza los validadores para reutilizar
 * @
 */



/*

usuario
sin espacios 
minimo de caracteres y maximo 8-20 
sin caracteres especiales

contraseña
sin espacios 
minimo de caracteres y maximo 8-20 
contraseñas iguales

email
q tenga 1 solo arroba
formato:xxxx@xxxx.com
sin espacios 
min/max 5/254

dni
sin espacios
solonumericos
8 digitos
sin puntos
*/


public class Validador {

    private final String palabra;

    public Validador(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    
   
    public boolean tamañoMinino(String palabra,int tope){
    
    int contador= palabra.length();
        
    if (contador<tope){
        return true;
    }else{
        return false;
    }
    }
    
    public boolean tamañoMaximo(String palabra,int tope){
    int contador= palabra.length();
        
    if (contador>tope){
        return true;
    }else{
        return false;
    }
    }

    public boolean esNumerico(String palabra){
    
    //metodo charAt devuelve el caracter del indice especificado
    
    String numerico="0123456789";
    
    for(int indice=0; indice<palabra.length(); indice++){
        for (int jindice=0;jindice<numerico.length(); jindice++){
            if ((palabra.charAt(indice) == numerico.charAt(jindice))){  
                return true;
            }
        }
    }
            return false;
    }
    

    public boolean hayCaracteresEspeciales(String palabra){
    
    String caracteresprohibidos="|!\"#$%&()=?'¡*¨´[[{~~_:;;,.-";
    
    
    for(int indice=0; indice<palabra.length(); indice++){
        for (int jindice=0;jindice<caracteresprohibidos.length(); jindice++){
            if ((palabra.charAt(indice) == caracteresprohibidos.charAt(jindice))){  
                return true;
            }
        }
    }
            return false;
    }

    public boolean hayEspacio (String palabra){
    
    String espacio=" ";    
    
        for(int indice=0; indice<palabra.length(); indice++){
            
            if ((palabra.charAt(indice))== espacio.charAt(0)){  
                return true;

        }
             }
        return false;
    }
        
    public boolean chequearContraseña(String palabra1, String palabra2){
    
    for(int indice=0; indice<palabra1.length(); indice++){
        for (int jindice=0;jindice<palabra2.length(); jindice++){
            if ((palabra1.charAt(indice) == palabra2.charAt(jindice))){  
                return true;
            }
        }
    }
        return false;    
    }

    public boolean hayarroba(String palabra){
    
    String arroba="@";
    
    if (palabra.equals("")){  //si esta vacio
            return false;
        }        
        if (palabra.length()<3){   //si es menor a 3 caracteres
            return false;
        }    
    for(int indice=0; indice<palabra.length(); indice++){
            if (palabra.contains(arroba)){
                return true;
            }
        }
    return false;
    }
    
    public boolean haypuntos(String palabra){
    
    String punto=".";
    
    for(int indice=0; indice<palabra.length(); indice++){
            if (palabra.contains(punto)){
                return true;
            }
        }
    return false;
    }

    
}