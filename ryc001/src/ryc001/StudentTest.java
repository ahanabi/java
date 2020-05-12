package ryc001; 
public class StudentTest {  
public static void main(String args[]){ 
System.out.println("现在共有"+Student.getCount()+"个学生。"); 
Student stu1=new Student("1001","小宇",'男',23); 
System.out.println(stu1.toString()); 
System.out.println("现在共有"+Student.getCount()+"个学生。"); 
Student stu2=new Student("1002","小晨",'女',19); 
System.out.println(stu2.toString()); 
System.out.println("现在共有"+Student.getCount()+"个学生。");   	
System.out.println("两个学生年龄大的学生为："+stu1.getSname()); 
} 
} 

