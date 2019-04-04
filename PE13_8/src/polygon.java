public class polygon{
	 public polygon(int[] x,int[] y) {
		 xArray=x;
		 yArray=y;
	 }
	 public double getArea() {
		 double x1;
		 double x2;
		 double x3;
		 double y1;
		 double y2;
		 double y3;
		 int l= xArray.length;
		 if (l<3) {
		
			 return 0.0;
			 
		 }
		 double storage = 0;
		
				 x1=xArray[0]; x2=xArray[1]; x3=xArray[2];
				 y1=yArray[0]; y2=yArray[1]; y3=yArray[2];
				storage+=((x1*y2)+(x2*y3)+(x3*y1)-(y1*x2)-(y2*x3)-(y3*x1))/-2;
			
			
		
			 
		 int [] xArrayTemp=new int [l-1];
		 int [] yArrayTemp=new int [l-1];
			 int k=0;
			 for(int i=0; i<xArray.length; i++) {
				 if(i==1) {
					 k=1;
				 }
				 else{
				 xArrayTemp[i-k]=xArray[i];
				 yArrayTemp[i-k]=yArray[i];
				 }
			 }
			 polygon temp= new polygon(xArrayTemp,yArrayTemp);
			 
				 return storage+= temp.getArea();
			
		 
	 }
	 int [] xArray;
	 int [] yArray;
}