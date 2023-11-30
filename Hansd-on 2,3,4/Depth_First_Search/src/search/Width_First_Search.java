package search;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class Width_First_Search {

	public Width_First_Search( Queue cola_abierta, Stack pila_cerrada) {
	
		Nodos vuelos = new Nodos();

		System.out.print("--Tail Open--");
		System.out.print("--Stack Close--\n");
		cola_abierta.add("NY");
		System.out.print("   "+cola_abierta+"		"+pila_cerrada+"\n");
		
			while(cola_abierta.isEmpty()==false){
		

				if(cola_abierta.isEmpty()) {
					System.out.print("PASS");//Esta linea es solo para que pase el IF ;p
				}else{
					pila_cerrada.add(cola_abierta.poll());
			
					System.out.print("   "+cola_abierta+"		"+pila_cerrada+"\n"); 
					if(pila_cerrada.lastElement()=="NY") {
		
						for(int i=0; i<=vuelos.NY.length-1; i++){
							cola_abierta.add(vuelos.NY[i]);
							System.out.print("   "+cola_abierta+"		"+pila_cerrada+"\n");
					
						}//fin for
					}//fin if
					
					if(pila_cerrada.lastElement()=="CHI") {
						
						for(int i=0; i<=vuelos.CHI.length-1; i++){
							cola_abierta.add(vuelos.CHI[i]);
							System.out.print("   "+cola_abierta+"		"+pila_cerrada+"\n");
					
						}//fin for
					}//fin if
					if(pila_cerrada.lastElement()=="TOR") {
						
						for(int i=0; i<=vuelos.TOR.length-1; i++){
							cola_abierta.add(vuelos.TOR[i]);
							System.out.print("   "+cola_abierta+"		"+pila_cerrada+"\n");
				
						}//fin for
					}//fin if
					if(pila_cerrada.lastElement()=="DEN") {
						
						for(int i=0; i<=vuelos.DEN.length-1; i++){
							cola_abierta.add(vuelos.DEN[i]);
							System.out.print("   "+cola_abierta+"		"+pila_cerrada+"\n");
				
						}//fin for
					}//fin if
					if(pila_cerrada.lastElement()=="HOW") {
						
						for(int i=0; i<=vuelos.HOW.length-1; i++){
							cola_abierta.add(vuelos.HOW[i]);
							System.out.print("   "+cola_abierta+"		"+pila_cerrada+"\n");
					
						}//fin for
					}//fin if
				
					if(pila_cerrada.lastElement()=="LA") {
						System.out.print("You arraived to LA!!!!!!!\n");
						pila_cerrada.pop();
					}//fin if 
					
				}//fin else		
			}//fin where
	}//fin width_first_search
}//fin class width_first_search
