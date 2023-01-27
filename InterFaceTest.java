package com.jsp.Interfacepack;

interface Ia
{
	public static final int a = 23;
	void m1();
	void m2();
	void m3();
}
interface Ib extends Ia
{
	void m3();
	void m4();
	void m5();
}
class A implements Ib
{
	@Override
	public void m1()
	{
		System.out.println("m1 implemented for class A");
		
	}
	@Override
	public void m2()
	{
		System.out.println("m2 implemented for class A");
		
	}@Override
	public void m3()
	{
		System.out.println("m3 implemented for class A");
		
	}@Override
	public void m4()
	{
		System.out.println("m4 implemented for class A");
		
	}@Override
	public void m5()
	{
		System.out.println("m5 implemented for class A");
		
	}
	public void specific() 
	{
		System.out.println("Spicific method for class A");
		
	}
	
	
}

public class InterFaceTest {

	public static void main(String[] args) 
	{
		Ib i=new A();
		
		i.m1();
		i.m4();
		System.out.println(i.a);
		((A)i).specific();
		
	}

}
