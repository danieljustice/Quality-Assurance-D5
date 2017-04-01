package com.laboon;

import java.util.*;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Test methods in ModPinningTest class
 */


public class ModPinningTest {
	
    public ProgramExecutor _e = null;

    // Create simple executor before each test
    // Consists of a program "123++@" and a stack that already has
    // the values [2, 3, 4] (4 being the "top" of the stack)
    @Before
    public void setup() {
    	ProgramStack ps = new ProgramStack();

    	ProgramArea pa = new ProgramArea("123++@");
    	MainPanel mp = new MainPanel();
    	_e = new ProgramExecutor(mp, ps, pa);
    }

	// Test double negitive values
    @Test
    public void negDoubleModulo() {
	_e._ps.push(-5);
	_e._ps.push(-10);
	_e.modulo();
	assertEquals(-5, _e._ps.peek());
	}

	// Test zero first value
    @Test
    public void zeroFirstModulo() {
	_e._ps.push(0);
	_e._ps.push(11);
	_e.modulo();
	assertEquals(0, _e._ps.peek());
	}
	
	// Max Int Mod test
    @Test
    public void maxIntModulo() {
	_e._ps.push(2147483647);
	_e._ps.push(2147483647);
	_e.modulo();
	assertEquals(0, _e._ps.peek());
	}
	
	// Test zero as the second input for mod.
	// Should throw an acception, need to catch it.
	@Test(expected=ArithmeticException.class)
	public void zeroSecondModulo(){
		_e._ps.push(5);
		_e._ps.push(0);
		_e.modulo();
		// Exception should have occured
	}
	
    
}
