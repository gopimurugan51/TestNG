package org.tcs;

import org.testng.Assert;
import org.testng.annotations.Test;


	

public class AutomaticRerun {
	@Test
	
	private void tc1() {
		System.out.println("tc1");
	}
	
	
	@Test(retryAnalyzer = Failed.class)
	private void tc2() {
	Assert.assertTrue(true);
    System.out.println("tc2");

	}
		
			
	@Test(retryAnalyzer = Failed.class)	
	private void tc3() {
		Assert.assertTrue(true);
		System.out.println("tc3");
				
				
	
	}
}
