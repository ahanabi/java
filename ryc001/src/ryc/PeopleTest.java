package ryc;

public class PeopleTest {
	 public static void main(String[] args){
		People pp=new People();
	    pp.setNema("张三");
	    pp.setSex("男");
	    pp.setAge(18);
	    System.out.println("姓名："+pp.getNema()+"\r性别："+pp.getSex()+"\r年龄："+pp.getAge() 
	            );
   }
}
