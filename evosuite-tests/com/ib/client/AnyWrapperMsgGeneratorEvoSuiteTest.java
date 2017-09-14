/*
 * This file was automatically generated by EvoSuite
 */

package com.ib.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.ib.client.AnyWrapperMsgGenerator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AnyWrapperMsgGeneratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.error("UffG}");
      assertEquals("UffG}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      AnyWrapperMsgGenerator anyWrapperMsgGenerator0 = new AnyWrapperMsgGenerator();
      assertEquals("Connection Closed", anyWrapperMsgGenerator0.connectionClosed());
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.ioError((Exception) null);
      assertEquals("Error - null", string0);
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.error(0, 0, "UffG}");
      assertEquals("0 | 0 | UffG}", string0);
      assertNotNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.connectionClosed();
      assertEquals("Connection Closed", string0);
  }
}
