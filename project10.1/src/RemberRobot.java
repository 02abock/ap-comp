public class RemberRobot extends Robot {
public RemberRobot(Object obj){
	super(obj);
}
public void run(){
	
while (!(super.getColum()==7&&super.getRow()==8)){
movmentDesignater=super.MovmentDierection();
moved[super.getRow()][super.getColum()]=1;



if(movmentDesignater==0){
	if(!testMoveLeft()){
		if(!testMoveRight()){
			if(!testMoveUp()) {
				if(!testMoveDown()) {
					if(!super.RoMoveleft()) {
						if(!super.RoMoveRight()) {
							if(!super.RoMoveDown()) {
								if(!super.RoMoveUp()) {
									
								}
							}
						}
					}
				}
			}
		}
	}
	

}
else if(movmentDesignater==1){
	if(!testMoveRight()){
		if(!testMoveLeft()){
			if(!testMoveUp()) {
				if(!testMoveDown()) {
					if(!super.RoMoveRight()) {
						if(!super.RoMoveleft()) {
							if(!super.RoMoveUp()) {
								if(!super.RoMoveDown()) {
									
								}
							
							}	
						}
					}
				}
			}
		}
	}

}
else if(movmentDesignater==2){
	if(!testMoveUp()){
		if(!testMoveRight()){
			if(!testMoveLeft()) {
				if(!testMoveDown()) {
					if(!super.RoMoveUp()) {
						if(!super.RoMoveleft()) {
							if(!super.RoMoveRight()) {
								if(!super.RoMoveDown()) {
									
								}
							
							}	
						}
					}
				}
			}
		}
	}

}
else{
	if(!testMoveDown()){
		if(!testMoveRight()){
			if(!testMoveUp()) {
				if(!testMoveLeft()) {
					if(!super.RoMoveDown()) {
						if(!super.RoMoveleft()) {
							if(!super.RoMoveRight()) {
								if(!super.RoMoveUp()) {
									
								}
							
							}	
						}
					}
				}
			}
		}
	}
	

}
}
}
public boolean testMoveLeft() {
	if (moved[super.getRow()][super.getColum()-1]==1) {
		return false;
	}
	return super.RoMoveleft();
}
public boolean testMoveRight() {
	if (moved[super.getRow()][super.getColum()+1]==1) {
		return false;
	}
	return super.RoMoveRight();
}
public boolean testMoveUp() {
	if (moved[super.getRow()+1][super.getColum()]==1) {
		return false;
	}
	return super.RoMoveUp();
}
public boolean testMoveDown() {
	if (moved[super.getRow()-1][super.getColum()]==1) {
		return false;
	}
	return super.RoMoveDown();
}
int movmentDesignater;
int [][] moved=new int [9][9];
	
	}
