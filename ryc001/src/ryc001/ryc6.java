
import student.Student; 
public class StudentTest {  
public static void main(String args[]){ 
System.out.println("���ڹ���"+Student.getCount()+"��ѧ����"); 
Student stu1=new Student("1001","������",'��',20); 
System.out.println(stu1.toString()); 
System.out.println("���ڹ���"+stu1.getCount()+"��ѧ����"); 
Student stu2=new Student("1002","�����",'Ů',19); 
System.out.println(stu2.toString()); 
System.out.println("���ڹ���"+Student.getCount()+"��ѧ����");   	stu2.setSage(21); 
System.out.println(stu2.toString()); 
System.out.println(stu1.getSno()); 
	Systm.out.println(stu1.getSname()); 
System.out.println(stu1.getSsex()); 
System.out.println(stu1.getSage()); 
} 
} 
