package ryc001; 
public class StudentTest {  
public static void main(String args[]){ 
System.out.println("���ڹ���"+Student.getCount()+"��ѧ����"); 
Student stu1=new Student("1001","С��",'��',23); 
System.out.println(stu1.toString()); 
System.out.println("���ڹ���"+Student.getCount()+"��ѧ����"); 
Student stu2=new Student("1002","С��",'Ů',19); 
System.out.println(stu2.toString()); 
System.out.println("���ڹ���"+Student.getCount()+"��ѧ����");   	
System.out.println("����ѧ��������ѧ��Ϊ��"+stu1.getSname()); 
} 
} 

