
package com.laboon;

import java.util.*;

import java.lang.Integer;

import static org.junit.Assert.*;

import org.junit.*;

import com.laboon.ProgramArea;

/**
 * Pinning Tests for getOpCode method in ProgramArea class
 */

public class GetOpCodePinningTest{

    //Given a ProgramArea with a default size and arguments
    //of MaxInt getOpCode should successfully return (char)0
    @Test
    public void testGetOpCodeExtremeIntegers(){
        ProgramArea pa = new ProgramArea();
        assertEquals(pa.getOpCode(Integer.MAX_VALUE, Integer.MAX_VALUE), (char)0);
    }

    //When given negative arguments getOpCode should return (char)0
    @Test
    public void testGetOpCodeNegatives(){
        ProgramArea pa = new ProgramArea();
        assertEquals(pa.getOpCode(0, -1), (char)0);
        assertEquals(pa.getOpCode(-1, 0), (char)0);
        assertEquals(pa.getOpCode(-1, -1), (char)0);
    }


    //When reading a '0' character getOpCode should return the character
    //for '0' (ascii 48) and not the character for 'nul' (ascii 0)
    @Test
    public void testGetOpCodeZero(){
        ProgramArea pa = new ProgramArea(" 0");
        assertNotEquals(pa.getOpCode(0, 1), (char)0);
        assertEquals(pa.getOpCode(0, 1), '0');

    }
}