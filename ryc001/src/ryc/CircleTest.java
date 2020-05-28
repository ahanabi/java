package ryc;

public class CircleTest{
	  public static void main(String[] args){
	   PlainCircle a = new PlainCircle(10,10,10);
	   double area=a.area();
	   double perimeter=a.perimeter();
	   System.out.println("area="+area);
	   System.out.println("perimeter="+perimeter);
	   double x=18.5,y=17.2;
	   if(a.isInside(x,y))
	     System.out.println("point (18.5，17.2) is in the Circle(r:10.0,x:10.0,y:10.0)");
	     else System.out.println("point (18.5，17.2) isn't in the Circle(r:10.0,x:10.0,y:10.0)");
	   a.resize(1.5);
	   if(a.isInside(x,y))
	     System.out.println("point (18.5，17.2) is in the Circle(r:15.0,x:15.0,y:15.0)");
	     else System.out.println("point (18.5，17.2) isn't in the Circle(r:15.0,x:15.0,y:15.0)");
	   
	  }
	}