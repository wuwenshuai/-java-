package cn.carryshuai.spring源码分析.test;


import cn.carryshuai.spring源码分析.aop.MathCalculator;
import cn.carryshuai.spring源码分析.config.MainConfigOfAOP;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class IOCTest_AOP {

	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

		//1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

		mathCalculator.div(1, 1);

		applicationContext.close();
	}

}
