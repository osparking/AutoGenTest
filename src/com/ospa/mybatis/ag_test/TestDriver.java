package com.ospa.mybatis.ag_test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDriver {

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
					new String[] { "applicationContext-myBatis.xml" });

			EmployeeInfoManager employeeInfoManager = (EmployeeInfoManager)
					appContext.getBean("employeeInfoManager");

			employeeInfoManager.inserUser();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
