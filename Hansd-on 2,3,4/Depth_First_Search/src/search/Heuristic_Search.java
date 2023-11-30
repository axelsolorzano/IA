package search;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
public class Heuristic_Search {
	public Heuristic_Search (Stack<String> pila_abierta, Stack<String> pila_cerrada) {
		 Nodos letras = new Nodos();
	        letras.agregarelemntos();

	        System.out.print("--Stack Open--");
	        System.out.print("--Stack Close--\n");

	        pila_abierta.push("e");//letra inicial elegida

	        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");

	        Set<String> nodosVisitados = new HashSet<>();

	        while (!pila_abierta.empty()) {
	            String n = pila_abierta.peek();
	            
	            if(n == null) {
	            	break;
	            }//end if

	            switch (n) {
	                case "a":
	                	if (!nodosVisitados.contains("a")) {
	                        pila_cerrada.add(pila_abierta.pop());
	                        nodosVisitados.add("a");
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");

	                        int valorm = Integer.MAX_VALUE;
	                        String clavem = null;

	                        for (Map.Entry<String, Integer> entry : letras.a.entrySet()) {
	                            String clave = entry.getKey();
	                            int val = entry.getValue();

	                            if (val < valorm && !nodosVisitados.contains(clave)) {
	                                valorm = val;
	                                clavem = clave;
	                            }//end if
	                        }//end for

	                        pila_abierta.add(clavem);
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");
	                    }/*end if*/ else {
	                        pila_abierta.pop();  // Evita el ciclo infinito
	                    }//end else
	                    break;

	                case "b":
	                	if (!nodosVisitados.contains("b")) {
	                        pila_cerrada.add(pila_abierta.pop());
	                        nodosVisitados.add("b");
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");

	                        int valorm = Integer.MAX_VALUE;
	                        String clavem = null;

	                        for (Map.Entry<String, Integer> entry : letras.b.entrySet()) {
	                            String clave = entry.getKey();
	                            int val = entry.getValue();

	                            if (val < valorm && !nodosVisitados.contains(clave)) {
	                                valorm = val;
	                                clavem = clave;
	                            }//end if
	                        }//end for

	                        pila_abierta.add(clavem);
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");
	                    }/*end if*/ else {
	                        pila_abierta.pop();  // Evita ciclos infinitos
	                    }//end else
	                    break;

	                case "c":
	                	if (!nodosVisitados.contains("c")) {
	                        pila_cerrada.add(pila_abierta.pop());
	                        nodosVisitados.add("c");
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");

	                        int valorm = Integer.MAX_VALUE;
	                        String clavem = null;

	                        for (Map.Entry<String, Integer> entry : letras.c.entrySet()) {
	                            String clave = entry.getKey();
	                            int val = entry.getValue();

	                            if (val < valorm && !nodosVisitados.contains(clave)) {
	                                valorm = val;
	                                clavem = clave;
	                            }//end if
	                        }//end for

	                        pila_abierta.add(clavem);
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");
	                    }/*end if*/ else {
	                        pila_abierta.pop();  // Evita ciclos infinitos
	                    }//end else
	                    break;

	                case "d":
	                	if (!nodosVisitados.contains("d")) {
	                        pila_cerrada.add(pila_abierta.pop());
	                        nodosVisitados.add("d");
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");

	                        int valorm = Integer.MAX_VALUE;
	                        String clavem = null;

	                        for (Map.Entry<String, Integer> entry : letras.d.entrySet()) {
	                            String clave = entry.getKey();
	                            int val = entry.getValue();

	                            if (val < valorm && !nodosVisitados.contains(clave)) {
	                                valorm = val;
	                                clavem = clave;
	                            }//end if
	                        }//end for

	                        pila_abierta.add(clavem);
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");
	                    }/*end if*/ else {
	                        pila_abierta.pop();  // Evita ciclos infinitos
	                    }//end else
	                    break;

	                case "e":
	                	if (!nodosVisitados.contains("e")) {
	                        pila_cerrada.add(pila_abierta.pop());
	                        nodosVisitados.add("e");
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");

	                        int valorm = Integer.MAX_VALUE;
	                        String clavem = null;

	                        for (Map.Entry<String, Integer> entry : letras.e.entrySet()) {
	                            String clave = entry.getKey();
	                            int val = entry.getValue();

	                            if (val < valorm && !nodosVisitados.contains(clave)) {
	                                valorm = val;
	                                clavem = clave;
	                            }//end if
	                        }//end for

	                        pila_abierta.add(clavem);
	                        System.out.print("   " + pila_abierta + "        " + pila_cerrada + "\n");
	                    }/*end if*/ else {
	                        pila_abierta.pop();  // Evita ciclos infinitos
	                    }//end else
	                    break;
	                default:
	                    System.out.print("esa letra no esta en el pentagrama");
	            }//end switch

	        }//end while
	}//end Heuristic_search
}//end Heuristic_search class