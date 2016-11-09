
public class Rectangulo extends FiguraGeometrica{
  
	private double base;
	private double altura;
	
	protected Rectangulo(String color, double base, double altura){
		super(color);
		this.base=base;
		this.altura=altura;
		
	
	}
	 double getbase(){
		return base;
	}
	 double getaltura(){
		return altura;
	}
	 void setBase(double base){
		this.base=base;
	}
	 void setaltura(double altura){
		this.altura=altura;
	}
	 double getarea(){
		return base*altura;
}
	
	
}
