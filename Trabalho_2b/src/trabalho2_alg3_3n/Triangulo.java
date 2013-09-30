package trabalho2_alg3_3n;

public class Triangulo {
	private Ponto p0;
	private Ponto p1;
	private Ponto p2;
	
	
	public void setVertices(Ponto p0, Ponto p1,Ponto p2){
		this.p0 = p0;
		this.p1 = p1;		
		this.p2 = p2;		
	}
	
	public void drawTriangulo(int x1,int y1,int x2,int y2,int x3,int y3,Cor cor,Imagem img) throws Exception{
		
		Reta.drawReta(x1, y1, x2, y2,cor,img);
		Reta.drawReta(x1, y1, x3, y3,cor,img);
		Reta.drawReta(x2, y2, x3, y3,cor,img);
		
				
	}
}
