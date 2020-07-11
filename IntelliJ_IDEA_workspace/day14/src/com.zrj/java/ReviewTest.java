package com.zrj.java;

//import org.junit.Test;

public class ReviewTest {
    public static void main(String[] args) {
        ReviewTest reviewTest = new ReviewTest();
//        reviewTest.test3();
        reviewTest.test2();
        reviewTest.test1();
    }
	
	//关于toString()

	public void test3(){
		String s = "abc";
		s = null;
		System.out.println(s);//null
		System.out.println("*********");
//		System.out.println(s.toString());//出现NullPointerException
	}
	
	//区别手动写的和自动生成的equals()

	public void test2(){
		Person p = new Man("Tom", 12);
		Man m = new Man("Tom", 12);

		System.out.println(p instanceof  Person);
		
		System.out.println(m.equals(p));
	}
	
	//数组也作为Object类的子类出现，可以调用Object类中声明的方法

	public void test1(){
		int[] arr = new int[]{1,2,3};
		print(arr);
		
		System.out.println(arr.getClass());
		
	}

	public void print(Object obj){
		System.out.println(obj);
	}

}
