package Lab10;

import java.util.Random;

public class CannonSolution
{
	private Double a=null, v=null;
	
	
public CannonSolution(Double angle, Double vel)
{
if(angle>=25 && angle<=55) {
	a=angle;
}else {
	a=CS2004.UR(25.0, 55.0);
}
if(vel >=1500 && vel <=1650) {
	v=vel;
}else {
	v = CS2004.UR(1500.0, 1650.0);
}


}

public CannonSolution(){
	a=CS2004.UR(25.0, 55.0);
	v = CS2004.UR(1500.0, 1650.0);
	
}

public void smallChange() {
	Double swap = CS2004.UR(-1.0, 1.0);
	if (swap==0.0) {
		smallChange();
	}else {
		a += swap;
		if(a>55.0)  {
			a = 55.0;
		}else if(a<25) {
			a=25.0;
		}
	}
	
	swap = CS2004.UR(-3.0, 3.0);
	if (swap==0.0) {
		smallChange();
	}else {
		v += swap;
		if(v>1650.0)  {
			v = 1650.0;
		}else if(v<1500.0) {
			v=1500.0;
		}
	}
	
}

public double getA() {
	return a;
	
}
public double getV() {
	return v;
	
}




}
