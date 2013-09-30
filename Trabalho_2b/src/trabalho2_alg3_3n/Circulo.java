package trabalho2_alg3_3n;

public class Circulo {
	
	private Ponto centro;
	private int raio;
	private int grau;
	
	private float fator;
	
	public Ponto getCentro() {
		return centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public float getFator() {
		return fator;
	}

	public void setFator(float fator) {
		this.fator = fator;
	}

	public  void drawCirculo(int x,int y,int raio,Cor cor,Imagem img) throws Exception
	{
		fator = (float)(Math.PI/180.0);
	    

	    for (grau=0; grau < 360; ++grau)
	    {
	    	int x1 = (int) Math.abs(Math.cos(grau * fator) * raio + x);
	    	int y1 = (int) Math.abs(Math.sin(grau * fator) * raio + y);
		    
		    centro = new Ponto(x1,y1);
	        img.setPixel(centro,cor);
	    }
	}
}
