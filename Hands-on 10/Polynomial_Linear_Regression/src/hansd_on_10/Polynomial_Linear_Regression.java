package hansd_on_10;

public class Polynomial_Linear_Regression {
	Polynomial_Linear_Regression(double x[] , double y[]) {
		System.out.println("-----Polynomial_linear_Regression-----");
		date_set date = new date_set();
		
		//calculo medias
		double mediax=0, mediay=0;
		for(int i=0;i<=date.x.length-1;i++) {
			mediax += date.x[i]/date.x.length;
			mediay += date.y[i]/date.y.length;
		}//end for
		
		
		//calculo de sumatorias y cuadrados
		double sumax=0,sumay=0,sumaxy=0,sumacy=0,sumacx=0;
		for(int i=0;i<=date.x.length-1;i++) {
			sumax += date.x[i]-mediax;
			sumay += date.y[i]-mediay;
			sumaxy += (date.x[i]-mediax)*(date.y[i]-mediay);
			sumacy += Math.pow((date.y[i]-mediay),2);
			sumacx += Math.pow((date.x[i]-mediax),2);
		}//end for
		
		
		double B0 =0, B1=0;
		B1=sumaxy/sumacx;
		B0= mediay-(B1*mediax);
		System.out.println("B0: "+B0);
		System.out.println("B1: "+B1);
		
		double[] predicciones = new double[date.x.length];
		
		for(int i=0;i<=date.x.length-1;i++) {
			predicciones[i]=B0+(B1*date.x[i]);
			//System.out.println("prediccion "+(i+1)+" : "+predicciones[i]);
			
		}//end for
		
		//calculo de R2
		double syp=0,R2=0;
		
		for(int i=0;i<=date.x.length-1;i++) {
			syp += Math.pow((date.y[i]-predicciones[i]),2);
		}//end for
		
		R2=1-syp/sumacy;
		System.out.println("R2: "+R2);
		System.out.println("Formula de prediccion: B0+B1X");
		double X=120,test=0;//Cambiar la X para las predicciones
		test=B0+(B1*X);
		System.out.println("La Prediccion usando "+X+" es: "+test);
		
	}//end Polynomial_Linear_Regression

}//end class Polynomial_Linear_Regression
