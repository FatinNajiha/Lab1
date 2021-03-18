package Exercise7;
import java.util.Scanner;

public class calculate {
	double mass;

	public calculate(double mass){
		this.mass = mass;
	}

	void setMass(double mass) {
		this.mass = mass;
	}

	public void totalweight() {
		double earth = mass * 9.80665;
		double mars = mass * 3.711;

		System.out.println("\nMass: "+mass+"KG\nWeight on Earth: " +earth+"N\nWeight on Mars: "+mars+"N");
	}
}
