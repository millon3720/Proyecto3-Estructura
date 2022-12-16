package Proyecto3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josed
 */
public class Arbol {
   private Nodo raiz;
        private String cad="";
        private int cont=0;
        
	public Arbol(String dato) {
		raiz=new Nodo(dato);
		raiz.setIzquierda(null);
		raiz.setDerecha(null);
	}
	public void insertarIzquierda(String dato, Nodo ref) {
		if(ref!=null) {
			Nodo nuevo=new Nodo(dato);
			ref.setIzquierda(nuevo);
		}
	 }
	 public void insertarDerecha(String dato, Nodo ref) {
		 if(ref!=null) {
				Nodo nuevo=new Nodo(dato);
				ref.setDerecha(nuevo);
		 }
	 }
	 public String preOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                     	cad=cad+" "+ref.getDato(); 
                        preOrden(ref.getIzquierda());
			preOrden(ref.getDerecha());
		 }
                 return cad; 
	 }
	 public String inOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
			inOrden(ref.getIzquierda());
			cad=cad+" "+ref.getDato(); 
                        inOrden(ref.getDerecha());
		 }
            return cad; 
	 }
	 public String posOrden(Nodo ref) {
		 if(ref!=null) {
			if(ref==raiz){
                            cad="";
                        }			
                        posOrden(ref.getIzquierda());
			posOrden(ref.getDerecha());
			cad=cad+" "+ref.getDato(); 
		 }
                 return cad; 
	 }      
         public String Mujeres(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                        Mujeres(ref.getIzquierda());
			cad=cad+" "+ref.getDato(); 
                        
		 }
            return cad; 
	 }
      	 public Nodo getRaiz() {
		 return raiz; 
	 }
    
}