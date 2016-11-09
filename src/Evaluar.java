import static org.junit.Assert.*;

import org.junit.Test;

public class Evaluar {
	
	@Test
	public void testGetFiguraGeometrica()
	{
		FiguraGeometrica f = new FiguraGeometrica("Azul");
		assertEquals("", "Azul", f.getColor());
		
		FiguraGeometrica f2 = new FiguraGeometrica("Rojo");
		assertEquals("", "Rojo", f2.getColor());
	}
	
	@Test
	public void testSetFiguraGeometrica()
	{
		FiguraGeometrica f = new FiguraGeometrica("Azul");
		f.setColor("Verde");
		assertEquals("", "Verde", f.getColor());
		
		FiguraGeometrica f2 = new FiguraGeometrica("Rojo");
		f2.setColor("Blanco");
		assertEquals("", "Blanco", f2.getColor());
	}
	
	@Test
	public void testHerenciaRectangulo()
	{
		Rectangulo r = new Rectangulo("Rojo",10,20);
		if(!(r instanceof FiguraGeometrica))
			fail("Not yet implemented");
	}
	
	@Test
	public void testHerenciaCirculo()
	{
		Circulo c = new Circulo("Verde",10);
		if(!(c instanceof FiguraGeometrica))
			fail("Not yet implemented");
	}

	@Test
	public void testGetRectangulo()
	{
		Rectangulo f = new Rectangulo("Azul",15,32.5);
		assertEquals("", (int)15, (int)f.getbase());
		assertEquals("", (int)32, (int)f.getaltura());
		
		Rectangulo f2 = new Rectangulo("Verde",5,7);
		assertEquals("", (int)5, (int)f2.getbase());
		assertEquals("", (int)7, (int)f2.getaltura());		
	}
	
	@Test
	public void testGetCirculo()
	{
		Circulo f = new Circulo("Azul",4);
		assertEquals("", (int)4, (int)f.getradio());
		
		Circulo f2 = new Circulo("Gris",9);
		assertEquals("", (int)9, (int)f2.getradio());
	}
	
	@Test
	public void testSetRectangulo()
	{
		Rectangulo f = new Rectangulo("Azul",4,54);
		f.setBase(6);
		f.setaltura(2);
		assertEquals("", (int)6, (int)f.getbase());
		assertEquals("", (int)2, (int)f.getaltura());
		
		Rectangulo f2 = new Rectangulo("Azul",65,21);
		f2.setBase(54);
		f2.setaltura(23);
		assertEquals("", (int)54, (int)f2.getbase());
		assertEquals("", (int)23, (int)f2.getaltura());
	}
	
	@Test
	public void testSetCirculo()
	{
		Circulo f = new Circulo("Azul",4);
		f.setradio(7);
		assertEquals("", (int)7, (int)f.getradio());
		
		Circulo f2 = new Circulo("Gris",9);
		f2.setradio(2);
		assertEquals("", (int)2, (int)f2.getradio());
	}
	
	@Test
	public void getAreaRectangulo()
	{
		Rectangulo f = new Rectangulo("Azul",5,3);
		assertEquals("", (int)15, (int)f.getarea());
		
		Rectangulo f2 = new Rectangulo("Azul",2,8);
		assertEquals("", (int)16, (int)f2.getarea());
	}
	
	@Test
	public void getAreaCirculo()
	{
		Circulo f = new Circulo("Azul",4);
		assertEquals("", (int)50, (int)f.getarea());
		
		Circulo f2 = new Circulo("Azul",7);
		assertEquals("", (int)153, (int)f2.getarea());
	}
}
