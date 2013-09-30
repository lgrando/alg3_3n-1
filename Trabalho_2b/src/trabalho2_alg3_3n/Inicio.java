package trabalho2_alg3_3n;

import java.io.IOException;
import java.util.Scanner;


public class Inicio {
	
	private static Imagem img = new Imagem(50, 50,"c");//criar a matriz da imagem
	private static Cor cor = new Cor(66);
	
	public static void main(String[] args) throws Exception {
		
		String comando = ""; //variavel para armazenar o comando digitado...
		Scanner teclado = new Scanner(System.in);
		
		while(!comando.equals("sair")){
			
			comando = teclado.nextLine();
			String[] tamanho = null;
			tamanho = comando.split(" ");
			
			if(comando.startsWith("salvar")){
				if(tamanho.length != 2)System.out.println("Comando incorreto\nVerifique os parametros");
				else salvar(comando);
			}
			if(comando.startsWith("imagem")){
				if(tamanho.length != 4)System.out.println("Comando incorreto\nVerifique os parametros");
				else imagem(comando);
			}
			if(comando.startsWith("cor")){
				cor(comando);
			}
			if(comando.startsWith("retangulo")){
				if(tamanho.length != 5)System.out.println("Comando incorreto\nVerifique os parametros");
				else retangulo(comando);
			}
			if(comando.startsWith("reta")){
				if(tamanho.length != 5)System.out.println("Comando incorreto\nVerifique os parametros");
				else reta(comando);
			}
			if(comando.startsWith("triangulo")){
				if(tamanho.length != 7)System.out.println("Comando incorreto\nVerifique os parametros");
				else triangulo(comando);
			}
			if(comando.startsWith("circulo")){
				if(tamanho.length != 4)System.out.println("Comando incorreto\nVerifique os parametros");
				else circulo(comando);
			}
			
		}


	}
	
	private static void salvar(String comando) throws IOException{
		String[] param = null;
		param = comando.split(" ");
		
		img.salvarImagem(param[1]);
	}
	
	private static void imagem(String comando){
		String[] param = null;
		param = comando.split(" ");
		
		img = new Imagem(Integer.parseInt(param[1]),Integer.parseInt(param[2]),param[3]);//criar a matriz da imagem
	}
	
	private static void cor(String comando){
		String[] param = null;
		param = comando.split(" ");
		
		cor.setGrey(Integer.parseInt(param[1]));
	}
	
	private static void retangulo(String comando) throws Exception{
		String[] param = null;
		param = comando.split(" ");
		
		Ponto ponto1 = new Ponto(Integer.parseInt(param[1]),Integer.parseInt(param[3]));// cria um ponto1
		Ponto ponto2 = new Ponto(Integer.parseInt(param[2]),Integer.parseInt(param[4]));// cria um ponto1
		
				
		Retangulo rt = new Retangulo();
		rt.setVertices(ponto1, ponto2);
		rt.drawRetangulo(Integer.parseInt(param[1]),Integer.parseInt(param[2]),Integer.parseInt(param[3]),Integer.parseInt(param[4]),cor,img);
	}
	
	private static void reta(String comando) throws Exception{
		String[] param = null;
		param = comando.split(" ");
		
		Ponto ponto1 = new Ponto(Integer.parseInt(param[1]),Integer.parseInt(param[3]));// cria um ponto
		Ponto ponto2 = new Ponto(Integer.parseInt(param[2]),Integer.parseInt(param[4]));// cria um ponto
		
		//reta.setVertices(ponto1, ponto2);
		//reta.drawReta(cor,img);
		Reta.drawReta(Integer.parseInt(param[1]),Integer.parseInt(param[2]),Integer.parseInt(param[3]),Integer.parseInt(param[4]),cor,img);
	}
	private static void triangulo(String comando) throws Exception{
		String[] param = null;
		param = comando.split(" ");
		
		Ponto ponto1 = new Ponto(Integer.parseInt(param[1]),Integer.parseInt(param[2]));// cria um ponto
		Ponto ponto2 = new Ponto(Integer.parseInt(param[3]),Integer.parseInt(param[4]));// cria um ponto
		Ponto ponto3 = new Ponto(Integer.parseInt(param[5]),Integer.parseInt(param[6]));// cria um ponto
		
		Triangulo triangulo = new Triangulo();
		//reta.setVertices(ponto1, ponto2);
		//reta.drawReta(cor,img);
		triangulo.drawTriangulo(Integer.parseInt(param[1]),Integer.parseInt(param[2]),Integer.parseInt(param[3]),Integer.parseInt(param[4]),Integer.parseInt(param[5]),Integer.parseInt(param[6]),cor,img);
	}
	private static void circulo(String comando) throws Exception{
		String[] param = null;
		param = comando.split(" ");
		
		Circulo circ = new Circulo();
		circ.drawCirculo(Integer.parseInt(param[1]),Integer.parseInt(param[2]),Integer.parseInt(param[3]),cor,img);
	}

}