/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlkaindorf.zach;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabianzach
 */
public class AnlageTest
{
  
  public AnlageTest()
  {
  }
  
  @Test
  public void testJahresAfa()
  {
    Anlage a = new Anlage(2000.0,10);
    assertEquals(200.0, a.jahresAfa(),0.01);
  }
  
  @Test
  public void testBuchwert1()
  {
    Anlage a = new Anlage(2000.0,10);
    a.updateBuchwert(5);
    assertEquals(1000, a.jahresAfa(),0.01);
  }
  
  @BeforeClass
  public static void setUpClass()
  {
  }
  
  @AfterClass
  public static void tearDownClass()
  {
  }
  
  @Before
  public void setUp()
  {
  }
  
  @After
  public void tearDown()
  {
  }

  @org.junit.Test
  public void testSomeMethod()
  {
     
  }
  
}
