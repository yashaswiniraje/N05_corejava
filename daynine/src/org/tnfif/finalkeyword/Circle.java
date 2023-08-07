package org.tnfif.finalkeyword;
//The type Circle cannot subclass the final class Shape
public class Circle extends Shape {

		final float area=34.6f;
		//Cannot override the final method from Shape
		/*void printShapeType()
		{
			System.out.println(area + "sq.cm");
		}*/
		public void printShapeType(float area) {
			System.out.println(area+"sq.cm");
		}

	}


