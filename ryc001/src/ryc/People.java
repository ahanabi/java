package ryc;

public class People {
    private String pName;//姓名
    private int pAge;//年龄
    private String pSex;//性别
    //创建所有属性的构造方法
    public String getNema() {
        return pName;
    }
    public void setNema(String nema) {
        this.pName = nema;
    }
    public int getAge() {
        return pAge;
    }
    public void setAge(int age) {
        this.pAge = age;
    }
    public String getSex() {
        return pSex;
    }
    public void setSex(String sex) {
        this.pSex = sex;
    }
    //成员方法
    public String  getSay()
    {
        return "你好";
    }
    public int getAccount(int a,int b)//计算a+b返回int
    {
        return a+b;
    }
}