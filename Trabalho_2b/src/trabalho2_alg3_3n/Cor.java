package trabalho2_alg3_3n;


public class Cor {
	
	private int grey;
	private int red;
	private int green;
	private int blue;
	
	
	public Cor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	
	public Cor(int cinza) {
		this.grey = cinza;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public int getGrey() {
		return grey;
	}
	
	public void setGrey(int grey) {
		this.grey = grey;
	}

}
