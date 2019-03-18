package com.calculator.group19;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import com.calculator.group19.CalculatorMain;

public class CalculatorTest {

private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	// The following test cases are used to test the calculator
	@Test
	public void testAdd() {// test adding
		assertEquals(6, calc.add(4,2));//4+2 = 6
	}
	@Test
	public void testSub() {// test subtracting
		assertEquals(2, calc.sub(4,2));//4-2 = 2
	}
	@Test
	public void testMul() {// test multiplying
		assertEquals(9, calc.mul(3,3));//3*3 = 9
	}
	@Test
	public void testDiv() {// test dividing
		assertEquals(2, calc.div(4,2));//4/2 = 2
	}
	@Test
	public void testDivByZero() {// test dividing when the value of denominator is zero
		assertEquals(0, calc.div(3,0));// 3/0 = 0
	}
	@Test
	public void testPresedence() {// test the precedence of adding function, multiplying function and dividing function
		assertEquals(20, calc.add(calc.mul(2, 5), calc.div(10, 1)));//2*5+10/1 = 20
	}
	@Test
	public void testAbsoluteValue() {// test absolute value
		assertEquals(10, calc.abs(-10));//|-10| = 10
	}
	@Test
	public void testPower() {// test powering
		assertEquals(8,calc.power(2, 3));//2^3 = 6
	}
	@Test
	public void testPowerByZero() {// test powering by zero
		assertEquals(1,calc.power(4, 0));//4^0 = 1
	}
	@Test
	public void testPowerByMinus() {// test powering by minus 
		assertEquals(0,calc.power(3, -1));//3^-1 = 0
		//��Because our calculator is calculated in the integer range, 
		//we set the specified result is 0 when the value of power is a negative number.��
	}
	@Test
	public void testSquare() {// test squaring
		assertEquals(4, calc.square(2));//2^2 = 4
	}
	@Test
	public void testIntegration( ) {// test the integration of adding function, subtracting function and absolute value function
		assertEquals(-5,calc.add(calc.sub(calc.abs(-1), 1),-5));//|-1|-1+(-5) = -5
	}
	@Test
	public void testIntegration1() {// test the integration of powering function, subtracting function, dividing function and squaring function
		assertEquals(1, calc.power(calc.sub(calc.div(10, 2), calc.square(2)), 3));//((10/2)-2^2)^3 = 1
	}
	@Test
	public void testIntegration2() {// test the integration of subtracting function, powering function, dividing function, squaring function and adding function
		
		assertEquals(8,calc.sub(calc.power(2, 4),calc.div(calc.square(4),calc.add(1, 1))));//(2^4)-(4^2)/(1+1) = 8
	}
	@Test
	public void testIntegration3() {// test the integration of absolute value function, subtracting function, squaring function and dividing function
		assertEquals(5,calc.abs(calc.sub(calc.square(2),calc.div(27,3))));//|2^2-27/3| = 5
	}
	@Test
	public void testIntegration4() {// test the integration of absolute value function, subtracting function, squaring function and dividing function
		assertEquals(10,calc.abs(calc.sub(calc.square(-2),calc.div(42,3))));//|(-2)^2-42/3| = 10
	}
	@Test
	public void testIntegration5() {// test the integration of multiplying function, subtracting function, powering function and subtracting function
		assertEquals(6,calc.mul(calc.sub(calc.power(3, 2), calc.sub(10, 2)),6));//(3^2-(10-2))*6 = 6
	}

}
