
public class Circulo extends FiguraGeometrica {
  
	private double radio;
	
	
	protected Circulo(String Color, double radio){
		super(Color);
		this.radio=radio;
	}
	 double getradio(){
		return radio;
	}
	 void setradio(double radio){
		this.radio=radio;
	}
	 double getarea(){
		return (radio)*(radio)*3.14;
}
}
