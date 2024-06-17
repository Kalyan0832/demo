package com.vTiger.crm.contactTest;

import org.testng.annotations.Test;

import com.vTiger.crm.base.BaseClass;

public class Demo {
@Test(threadPoolSize = 0)
public void m1() {
	int []a= {10,20,30};
	
	System.out.println(a[0]);
	
}
}
