package trabalho2_alg3_3n;


public class Retangulo {
	
	private Ponto p0;
	private Ponto p1;
	
	public void setVertices(Ponto p0, Ponto p1){
		this.p0 = p0;
		this.p1 = p1;		
	}
	
	public void drawRetangulo(int x0,int y0,int x1,int y1,Cor cor,Imagem img) throws Exception{
		
		Reta.drawReta(x0,y0,x1,x0,cor,img);
		
		Reta.drawReta(x0,y0,x0,y1,cor,img);
		Reta.drawReta(x0,y1,y0,y1,cor,img);
		Reta.drawReta(y0,x0,y0,y1,cor,img);
		
	}
	
	

}
