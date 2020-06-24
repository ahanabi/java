package ryc001; 
public class Student{  
private String sno;  
private String sname;  
private char ssex;  
private int sage;  
private static 
int count=0; 

public Student(String no,String name,char sex,int age){ 
sno=no;   	sname=name;   	ssex=sex;   	sage=age;   	
count++; 
} 
  
public void setSno(String no){ 
sno=no; 
} 
public String getSno(){   	return sno; 
} 
public void setSname(String name){ 
sname=name; 
} 
public String getSname(){   	return sname; 
} 
public void setSsex(char sex){   	ssex=sex; 
} 
public char getSsex(){  
return ssex; 
} 
public void setSage(int age){ 
sage=age; 
} 
public int getSage(){   
return sage; 
} 
  
public String toString(){ 
return "学号："+sno+"；姓名："+sname+"；性别："+ssex+"；年龄："+sage+"。"; 
} 
public static int getCount(){   	return count; 
} 
} 
