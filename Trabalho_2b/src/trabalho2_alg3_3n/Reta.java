package trabalho2_alg3_3n;


public class Reta {
	
	private Ponto p0;
	private Ponto p1;
	
	private Ponto t0;
	private Ponto t1;
	
	public void setVertices(Ponto p0, Ponto p1){
		this.p0 = p0;
		this.p1 = p1;		
	}
	

	public static void drawReta(int x0,int y0,int x1,int y1,Cor cor,Imagem img) throws Exception
	{
	    int slope;
	    float dx, dy, incE, incNE, d, x, y;
	    
	    dx = Math.abs(x1-x0);
	    dy = Math.abs(y1-y0);

	    if(x0 <= x1) incE = 1;
	    else incE = -1;		
	    
	    if(y0 <= y1) incNE = 1;
	    else incNE = -1;
	    
	    int err = (int) (dx - dy);

	    while(true)
	    {	
	    	
	       Ponto pontob1 = new Ponto(x0, y0);
    	   img.setPixel(pontob1, cor);
	        
        if ((x0 == x1) && (y0 == y1))break;

	        slope = err * 2;

	        if(slope > -dy) {
	          
	        	
	        	err -= dy;
	            x0 += incE;
	        }

	        
	        if(slope < dx) {
	            err += dx;
	            y0 += incNE;
	        }
	    }
	}
	
	    
	
//	public static void drawReta(int x1,int y1,int x2,int y2,Cor cor,Imagem img) throws Exception{
//		int slope;
//		int dx, dy, incE, incNE, d, x, y;
//		
//				
//		if (x1 > x2){
//			drawReta(x2, y2, x1, y1,cor,img);
//			return;
//		}  
//		
//		dx = x2 - x1;
//		dy = y2 - y1;
//		
//		if (dy < 0){            
//			slope = -1;
//			dy = -dy;
//		}
//		else{            
//			slope = 1;
//		}
//		
//		incE = 2 * dy;
//		incNE = 2 * dy - 2 * dx;
//		d = 2 * dy - dx;
//		y = y1;       
//		for (x = x1; x <= x2; x++){
//			
//			
//			Ponto pontob1 = new Ponto(x, y);
//			img.setPixel(pontob1, cor);
//			
//			if (d <= 0){
//				d += incE;
//			}
//			else{
//				d += incNE;
//				y += slope;
//			}
//		}
//		
//	}
	

}
