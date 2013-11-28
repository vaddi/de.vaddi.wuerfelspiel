public class Wuerfel {

	private int wert = 0;
	private int wurf = 0;
	
	int getWert() {
		return wert;
	}

	public void setWert(int wert){
		if (wert > 10) {
			this.wert = wert - 10;
		} else {
			this.wert = wert;
		}
		
	}
	
	int getWurf() {
		return wurf;
	}

	public void wuerfeln() {
		this.wert = (int) (Math.random() * 6 + 1);
		this.wurf++;
	}
	
	public void neu(){
		this.wert = 0;
		this.wurf = 0;
	}
}
