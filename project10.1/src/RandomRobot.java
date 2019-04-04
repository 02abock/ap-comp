public class RandomRobot extends Robot {
public RandomRobot(Object obj){
	super(obj);
}
public void run(){
	
while (!(super.getColum()==7&&super.getRow()==8)){
movmentDesignater=super.MovmentDierection();
if(movmentDesignater==0){
	super.RoMoveleft();
	System.out.println("Lran");

}
else if(movmentDesignater==1){
	super.RoMoveRight();	
	System.out.println("Rran");

}
else if(movmentDesignater==2){
	super.RoMoveUp();
	System.out.println("Uran");

}
else{
	super.RoMoveDown();
	System.out.println("Dran");
	

}
}
}
int movmentDesignater;
	
	}
