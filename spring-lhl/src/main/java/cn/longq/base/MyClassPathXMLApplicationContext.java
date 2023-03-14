package cn.longq.base;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:  自定义属性资源文件 initPropertySources方法
 * @author: Liu Hualong
 * @created: 2023/03/14 13:29
 */
public class MyClassPathXMLApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXMLApplicationContext(String... configLocal){
		super(configLocal);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("-------q");
		getEnvironment().setRequiredProperties("username");
	}
}
