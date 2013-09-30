package trabalho2_alg3_3n;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class Imagem  { 

	private int largura;
	private int altura;
	private int[][] matrizImage;
	private String cor;

	public Imagem(int width, int heigth,String cor){

		this.largura = width;
		this.altura = heigth;
		this.matrizImage = new int [width][heigth];
		this.cor = cor;
	}

	public void setPixel(Ponto ponto,Cor cor) throws Exception{

		if(cor.getGrey() < 0) cor.setGrey(0);
		if(cor.getGrey() > 255) cor.setGrey(66);
		
		if(ponto.getX() < 0 || ponto.getX() >= largura)
			throw new Exception("Ponto x fora do tamanho maximo");
		if(ponto.getY() < 0 || ponto.getY() >= altura)
			throw new Exception("Ponto y fora do tamanho maximo");
		
		matrizImage[ponto.getX()][ponto.getY()] = cor.getGrey();
	}
	
	
	public void salvarImagem(String fileName) throws IOException {
		
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName + ".pnm"));
		
		out.write(String.format("P2\n%d %d\n255\n", matrizImage[0].length, matrizImage.length));
		
		for (int[] linha:matrizImage) {
			for(int v: linha) {
				out.write(String.format("%d ", v));
			}
		}
		out.close();
			
	}
	
	private int getPixel(int x, int y) {

		return matrizImage[x][y];
	}
	
	public void imagemOutSys(PrintStream out){

		out.println(String.format("P2\n%d  %d\n255\n", largura, altura));


		for (int x = 0; x < largura; x++) {

			for (int y = 0; y < altura; y++) {

				out.print(getPixel(x, y));
				out.print(" ");
			}

		}

	}

}