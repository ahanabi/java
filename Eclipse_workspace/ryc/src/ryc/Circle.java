package ryc;

class Circle{
	  private double radius;
	  double PI=3.1415926;
	  Circle(double radius){
	    this.radius = radius;
	  }
	  Circle(){
	    this.radius = 0;
	  }
	  public void setRadius(double r){
	    this.radius = r;
	  }
	  public double getRadius(){
	    return this.radius;
	  }
	  public double area(){
	    double ar=this.PI*this.radius*this.radius;
	    return ar;
	  }
	  public double perimeter(){
	   double per=2*this.PI*this.radius;
	   return per;
	  }
	  public void resize(double n){
	   this.radius=this.radius*n;
	  }
	  public String toString(){
	   return "Circle(r:"+this.radius+")";
	  }
	}
	class PlainCircle extends Circle{
	  private double x;
	  private double y;
	  PlainCircle(double radius,double x,double y){
	   setRadius(radius);
	   this.x=x;
	   this.y=y;
	  }
	  PlainCircle(){
	   setRadius(0);
	   this.x=0;
	   this.y=0;
	  }
	  public boolean isInside(double x,double y){
	   if((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y)<=(this.getRadius()*this.getRadius()))
	    return true;
	    else return false;
	  }
	  public String toString(){
	   return "Circle(r:"+this.getRadius()+",x:"+this.x+",y:"+this.y+")";
	  }
	}