package ryc001;

public class Box {  
private double length;  
private double width;  
private double height;  
public Box(){ 
} 
public Box(double l,double w,double h){   	
length=l;   	
width=w;   
height=h; 
} 
public void setLength(double l){   	
length=l;  
} 
public double getLength(){   	
return length; 
} 
public void setWidth(double w){ 
width=w; 
} 
public double getWidth(){   	
return width; 
} 
public void setHeight(double h){   	
height=h; 
} 
public double getHeight(){   	
return height; 
} 
public double getArea(){   	
return 2*(length*width+length*height+width*height); 
} 
public double getVolume(){   	
return length*width*height; 
} 
}
