package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MyStackTest
    extends TestCase
{
    public MyStackTest(String testName )
    {
        super( testName );
    }

    public void testMyStack()
    {
       MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);

        assertEquals(Integer.valueOf(2), stack.pop());

        //assertEquals(true, stack.isEmpty());

    }
}
