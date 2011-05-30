package com.isensen.junit4.test;

//静态引入
//这是一个类,不是一个包,类里直接有很多静态方法
//可以把这些类的方法引入进来不用加   类.方法
//可以直接用方法
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import com.isensen.junit4.T;
import static org.hamcrest.Matchers.*;

public class TTest {
	
	@BeforeClass  //任何测试之前，甚至类初始化之前运行beforeClass,类初始化之前都就运行，所以要static
				  //什么地方用？
				  //当我们测试之前要取到一些资源，如连接数据库
	public static void beforeClass(){
		System.out.println("beforeClass");
	}
	
	@AfterClass   //所有测试之后，运行afterClass
	public static void afterClass(){
		System.out.println("afterClass");
	}
	@Before//执行每一个@Test方法前都要执行before方法
	public void before(){
		System.out.println("before");
	}
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int z = new T().add(5, 3);
		assertEquals(z, 8);						//JUnit3
		assertTrue(z > 3);						//JUnit3
//		assertTrue("#z too small#",z > 10);		//JUnit3
		
		assertThat(z, is(8));
		assertThat(z, allOf(greaterThan(5), lessThan(10)));
	}
	
	@Test
	public void testDivide(){
		int z = new T().divide(8, 2);
		assertThat(z, is(4));
	}
	
	@Ignore   //暂时忽略这个测试方法
	@Test(expected = java.lang.ArithmeticException.class, timeout=100) //期望抛出异常，并且期望100MS以内完成下面测试
	public void testDivide2(){
		int z = new T().divide(8, 0); //除以0 后抛出异常
	}
	
	@After
	public void after(){
		System.out.println("after");
	}

	
}
