
import student.Student; 
public class StudentTest {  
public static void main(String args[]){ 
System.out.println("现在共有"+Student.getCount()+"个学生。"); 
Student stu1=new Student("1001","撒打算",'男',20); 
System.out.println(stu1.toString()); 
System.out.println("现在共有"+stu1.getCount()+"个学生。"); 
Student stu2=new Student("1002","三大殿",'女',19); 
System.out.println(stu2.toString()); 
System.out.println("现在共有"+Student.getCount()+"个学生。");   	stu2.setSage(21); 
System.out.println(stu2.toString()); 
System.out.println(stu1.getSno()); 
	Systm.out.println(stu1.getSname()); 
System.out.println(stu1.getSsex()); 
System.out.println(stu1.getSage()); 
} 
} 
