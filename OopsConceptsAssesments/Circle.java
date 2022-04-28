package OopsConceptsAssesments;

public class Circle {
	   private double radius;
	   private String color;
	   
	   // Constructors (overloaded)
	   /* Constructs a Circle instance with default value for radius and color */
	   public Circle() {  // 1st (default) constructor
	      radius = 1.0;
	      setColor("red");
	   }
	   
	   /* Constructs a Circle instance with the given radius and default color */
	   public Circle(double r) {  // 2nd constructor
	      radius = r;
	      setColor("red");
	   }
	   /* Returns the radius */
	   public double getRadius() {
	     return radius; 
	   }
	   
	   /*Returns the area of this Circle instance */
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	}

