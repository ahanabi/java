package ryc002;

class User {
	String id;
	String name;
	String password;
	protected String getId() {
		return id;
	}
	protected void setId(String id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getPassword() {
		return password;
	}
	protected void setPassword(String password) {
		this.password = password;
	}
	
}

public class Usertest{
	public static void main(String[] args) {
		User u = new User();
		System.out.println("101"+" "+"张三丰");
		System.out.println("102"+" "+"李四海");
		System.out.println("105"+" "+"王后");
		System.out.println("109"+" "+"张娜");
	}
	
}