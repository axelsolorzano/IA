package search;
import java.util.HashMap;
import java.util.Map;

public class Nodos {
	
	public String[]  NY = {"DEN", "TOR", "CHI"};
	public String[]  CHI = {"DEN"};
	public String[]  TOR = {"LA", "CALG"};
	public String[]  DEN = {"URB", "HOW", "LA"};
	public String[]  HOW = {"LA"};
	
	public String[]  A = {"C" , "B"};
	public String[]  C = {"x"};
	public String[]  D = {"x"};
	public String[]  B= {"D","C","X"};
	
	///////////////////////////////////////////////
	public Map<String, Integer> a = new HashMap<>();
	public Map<String, Integer> b = new HashMap<>();
	public Map<String, Integer> c = new HashMap<>();
	public Map<String, Integer> d = new HashMap<>();
	public Map<String, Integer> e = new HashMap<>();
	
	public void agregarelemntos() {
		a.put("e" , 75);
		a.put("d" , 100);
		a.put("c" , 125);
		a.put("b" , 100);
		
		b.put("e" , 125);
		b.put("a" , 100);
		b.put("d" , 75);
		b.put("c" , 50);
		
		c.put("e" , 125);
		c.put("b" , 50);
		c.put("a" , 125);
		c.put("d" , 100);
		
		d.put("e" , 50);
		d.put("c" , 100);
		d.put("b" , 75);
		d.put("a" , 100);
		
		e.put("a" , 75);
		e.put("b" , 125);
		e.put("c" , 125);
		e.put("d" , 50);
		}
}
