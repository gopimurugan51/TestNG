package org.tcs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {
	@Test
	
	private void tc1() {
		System.out.println("tc1");
	}
	
	
	@Test
	private void tc2() {
	Assert.assertTrue(false);
System.out.println("tc2");

	}
		
			
	@Test	
	private void tc3() {
		System.out.println("tc3");
				
				

	}

}
