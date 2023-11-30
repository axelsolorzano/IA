package Hansd_on_9;

public class Multiple_Linear_Regressiontest {

	public Multiple_Linear_Regressiontest(double x[][], double y[]) {
		
		Data_Set date = new Data_Set();
		//calculo de medias
		double mediax1 = 0, mediax2 = 0 , mediay = 0;

		for (int i = 0; i < date.y.length-1; i++) {
			mediax1 += date.x[i][0];
			mediax2 += date.x[i][1];
			mediay += date.y[i];
	    }//end for
	    mediax1 = mediax1/ date.y.length;
	    mediax2 = mediax2/ date.y.length;
	    mediay = mediay/ date.y.length;
        
        
        System.out.println("Media de X1: "+mediax1);
        System.out.println("Media de X2: "+mediax2);
        System.out.println("Media de Y: "+mediay);

		//Calculo de sumas
        
        double sumax1 = 0, sumax2=0, sumay=0;

        for (int i = 0; i < date.y.length-1; i++) {
            sumax1 += date.x[i][0];
            sumax2 += date.x[i][1];
            sumay += date.y[i];
        }//end for
        
        System.out.println("Suma de X1: "+sumax1);
        System.out.println("Suma de X2: "+sumax2);
        System.out.println("Suma de Y: "+sumay);
        
        //Calculo suma de cuadrados
        
        double scx1 = 0, scx2=0, smx1y=0, smx2y=0, smx1x2=0;
        
        for (int i = 0; i < date.y.length-1; i++) {
            scx1 += Math.pow((date.x[i][0] - mediax1), 2);
            scx2 += Math.pow((date.x[i][1] - mediax2), 2);
            smx1y += (date.x[i][0] - mediax1) * (date.y[i] - mediay);
            smx2y += (date.x[i][1] - mediax2) * (date.y[i] - mediay);
            smx1x2 += (date.x[i][0] - mediax1) * (date.x[i][1] - mediax2);
        }//end for
        
        System.out.println("Suma cuadrados de X1: "+scx1);
        System.out.println("Suma cuadratos de X2: "+scx2);
        System.out.println("Suma productos de X1Y: "+smx1y);
        System.out.println("Suma productos de X2Y: "+smx2y);
        System.out.println("Suma productos de X1X2: "+smx1x2);
        
        //calculo Betas
        
        double B0 = 0, B1 = 0, B2 = 0;
        
        B1 = ((smx1y * scx2) - (smx1x2 * smx2y)) / ((scx1 * scx2) - (smx1x2 * smx1x2));
        B2 = ((smx2y * scx1) - (smx1x2 * smx1y)) / ((scx1 * scx2) - (smx1x2 * smx1x2));
        B0 = mediay - (B1 * mediax1) - (B2 * mediax2);
        
        System.out.println("B0: "+B0);
       	System.out.println("B1: "+B1);
       	System.out.println("B2: "+B2);
        
        //Calculo de prediccion
        
       	System.out.println("Formula de prediccion: B0+B1X1+B2X2...BnXn");	
       	double[] predicciones = new double[date.y.length];
       	for (int i = 0; i < date.y.length-1; i++) {
           predicciones[i] = B0 + (B1 * date.x[i][0]) + (B2 * date.x[i][1]);
           System.out.println("Prediccion "+(i + 1) + ": " + predicciones[i]);
       	}
       
       
       	//Calculo de R2
       
       	double tsc = 0, scr=0, R2=0;
       	for (int i = 0; i < date.y.length-1; i++) {
    	   tsc += Math.pow((date.y[i] - mediay), 2);
    	   scr += Math.pow((date.y[i] - predicciones[i]), 2);
       	}//end for
       	R2 = 1- (scr/tsc);
       	System.out.println("R2: "+R2);
       	double testeo=0;
       	System.out.println("Testeo de Predicciones");
       	
       	double X1=80.5,X2=35.2;	//Aqui Editar los valores para los testeos de prediccion.
       	testeo = B0+(B1*X1)+(B2*X2);
       	System.out.println("Prediccion del testeo X1="+X1+", X2="+X2+" : "+testeo);
       	
	}//end Multiple_Linear_Regression
	
}//end class Multiple_Linear_Regression
