package com.sample.Junit_Tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Junit
{
	@Test
	void test1()
	{
		Remove_A removea=new Remove_A();
		String result=removea.removeA("ABCD");
		assertEquals("BCD",result);
	}
	@Test
	void test2()
	{
		Remove_A removea=new Remove_A();
		String result=removea.removeA("AACD");
		assertEquals("CD",result);
	}
	@Test
	void test3()
	{
		Remove_A removea=new Remove_A();
		String result=removea.removeA("BACD");
		assertEquals("BCD",result);
	}
	@Test
	void test4()
	{
		Remove_A removea=new Remove_A();
		String result=removea.removeA("AABAA");
		assertEquals("BAA",result);
	}
	@Test
	void test5()
	{
		Remove_A removea=new Remove_A();
		String result=removea.removeA("BBAA");
		assertEquals("BBAA",result);
	}
}
