/**
 * 
 */
package com.metacube.webservices;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author gourav gandhi
 *
 */
@RunWith(Parameterized.class)
public class ConversionTest {

		 @Parameters
		    public static Collection<Object[]> data() {
		        return Arrays.asList(new Object[][] {
		                 {33.0, 0.55 }, { 32.0, 0.00 }, { 45, 7.22 }, { 76, 24.45 }, { 4, -15.56 }  
		           });
		    }

		    @Parameter public double fInput;
		    @Parameter(1) public double fExpected;
		    @Test
		    public void test() {
		        Conversion obj=new Conversion();
		        double actual=obj.convertFtoC((fInput));
		    	assertEquals(fExpected, actual,0.1);
		   
		    }
}
