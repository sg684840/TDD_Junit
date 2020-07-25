package com.Soumya.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

@SuppressWarnings("unused")
public class Validate extends TestCase {
	
	@Test
	public void test() {
		String_Validate obj=new String_Validate();
		String output1=obj.check("ABCD");
		assertEquals("BCD",output1);
		String output2=obj.check("AACD");
		assertEquals("CD",output2);
		String output3=obj.check("BACD");
		assertEquals("BCD",output3);
		String output4=obj.check("BBAA");
		assertEquals("BBAA",output4);
		String output5=obj.check("AABAA");
		assertEquals("BAA",output5);
	}

}
