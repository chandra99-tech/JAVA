package Di;

public class Car {
	
	IEngine eng;

	

	public Car(IEngine eng) {
		super();
		this.eng = eng;
	}



	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
	
	int status=eng.start();
	if(status>=1) {
		System.out.println("engine start");
	}
	else {
		System.out.println("engine not start");
	}

}
}
