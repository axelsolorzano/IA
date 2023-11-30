package search;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
//System.out.print("Hello world"+pila_abierta+"\n");
//"CALG","LA", "DEN","HOW","TOR","CHI","NY"
public class Search {
	
	static Stack pila_abierta = new Stack();
	static Stack pila_cerrada = new Stack();
	
	static Queue cola_abierta = new LinkedList();
	//static Queue cola_cerrada = new LinkedList();
	
	public static void main(String[] argumentos){
		
		//Depth_First_Search depth_search = new Depth_First_Search(pila_abierta, pila_cerrada);
		//Width_First_Search width_search = new Width_First_Search(cola_abierta, pila_cerrada); 
		//testeo test =new testeo(pila_abierta, pila_cerrada);
		Heuristic_Search heuristic_search = new Heuristic_Search(pila_abierta, pila_cerrada);
	}//fin main
	
}//fin public class
