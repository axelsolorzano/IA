package search;
import java.util.Stack;
public class Depth_First_Search {
	
public Depth_First_Search (Stack pila_abierta, Stack pila_cerrada) {
	
	Nodos vuelos = new Nodos();

	System.out.print("--Stack Open--");
	System.out.print("--Stack Close--\n");
	pila_abierta.push("B");
	System.out.print("   "+pila_abierta+"		"+pila_cerrada+"\n");
	
		while(pila_abierta.empty()==false){
	

			if(pila_abierta.empty()) {
				System.out.print("PASS");//Esta linea es solo para que pase el IF
			}else{
				pila_cerrada.add(pila_abierta.pop());
		
				System.out.print("   "+pila_abierta+"		"+pila_cerrada+"\n");
				if(pila_cerrada.lastElement()=="A") {
	
					for(int i=0; i<=vuelos.A.length-1; i++){
						pila_abierta.add(vuelos.A[i]);
						System.out.print("   "+pila_abierta+"		"+pila_cerrada+"\n");
				
					}//fin for
				}//fin if
				if(pila_cerrada.lastElement()=="B") {
					
					for(int i=0; i<=vuelos.B.length-1; i++){
						pila_abierta.add(vuelos.B[i]);
						System.out.print("   "+pila_abierta+"		"+pila_cerrada+"\n");
				
					}//fin for
				}//fin if
				if(pila_cerrada.lastElement()=="D") {
				
					for(int i=0; i<=vuelos.TOR.length-1; i++){
						pila_abierta.add(vuelos.D[i]);
						System.out.print("   "+pila_abierta+"		"+pila_cerrada+"\n");
			
					}//fin for
				}//fin if
				if(pila_cerrada.lastElement()=="C") {
				
					for(int i=0; i<=vuelos.DEN.length-1; i++){
						pila_abierta.add(vuelos.C[i]);
						System.out.print("   "+pila_abierta+"		"+pila_cerrada+"\n");
			
					}//fin for
				}//fin if
				if(pila_cerrada.lastElement()=="HOW") {
				
				for(int i=0; i<=vuelos.HOW.length-1; i++){
					pila_abierta.add(vuelos.HOW[i]);
					System.out.print("   "+pila_abierta+"		"+pila_cerrada+"\n");
			
				}//fin for
				}//fin if
			
				if(pila_cerrada.lastElement()=="X") {
					System.out.print("You arraived to X!!!!!!!\n");
					pila_cerrada.pop();
				if(pila_cerrada.lastElement()=="HOW") {
					pila_cerrada.pop();
				}//fin if
				if(pila_cerrada.lastElement()=="TOR") {
						pila_cerrada.pop();
					}//fin if
				}//fin if
				if(pila_cerrada.lastElement()=="URB") {
					System.out.print("URB no tiene vuelos ;(\n");
						pila_cerrada.clear();
						pila_cerrada.push("NY");
					}//fin if
				if(pila_cerrada.lastElement()=="CALG") {
					System.out.print("CALG no tiene vuelos ;(\n");
					pila_cerrada.pop();
				}//fin if
			}//fin else
		}//fin where
	}//fin Depth_First_Search
}//fin class Depth_First_Search