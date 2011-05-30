package com.isensen.junit4.test;

//��̬����
//����һ����,����һ����,����ֱ���кܶྲ̬����
//���԰���Щ��ķ�������������ü�   ��.����
//����ֱ���÷���
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
	
	@BeforeClass  //�κβ���֮ǰ���������ʼ��֮ǰ����beforeClass,���ʼ��֮ǰ�������У�����Ҫstatic
				  //ʲô�ط��ã�
				  //�����ǲ���֮ǰҪȡ��һЩ��Դ�����������ݿ�
	public static void beforeClass(){
		System.out.println("beforeClass");
	}
	
	@AfterClass   //���в���֮������afterClass
	public static void afterClass(){
		System.out.println("afterClass");
	}
	@Before//ִ��ÿһ��@Test����ǰ��Ҫִ��before����
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
	
	@Ignore   //��ʱ����������Է���
	@Test(expected = java.lang.ArithmeticException.class, timeout=100) //�����׳��쳣����������100MS��������������
	public void testDivide2(){
		int z = new T().divide(8, 0); //����0 ���׳��쳣
	}
	
	@After
	public void after(){
		System.out.println("after");
	}

	
}
