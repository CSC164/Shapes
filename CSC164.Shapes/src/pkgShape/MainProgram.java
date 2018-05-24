package pkgShape;

import java.util.ArrayList;

public class MainProgram {


	
	public static void main(String[] args) throws Exception {

		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Rectangle(10,20));
		shapes.add(new Triangle(7));
		
		for (Shape s: shapes)
		{
			if (s instanceof Shape)
				System.out.println("this is a shape");
			
			if (s instanceof Rectangle)
				System.out.println("this is a rectangle");
			
			if (s instanceof Triangle)
				System.out.println("this is a triangle");
			System.out.println("");
			//System.out.println(s.Area());
		}

	}

}
