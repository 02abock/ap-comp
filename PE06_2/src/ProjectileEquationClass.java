public class ProjectileEquationClass{
	Double velocity;
	Double distance=0.0;	
	public ProjectileEquationClass(Double givenVelocity){
		velocity=givenVelocity;
	}
	public double claculate(int givenCount) {
		distance=-0.5*9.81*((givenCount/100)*(givenCount/100))+velocity*(givenCount/100);
		return distance;
	}
}