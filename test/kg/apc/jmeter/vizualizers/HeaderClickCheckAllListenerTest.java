package kg.apc.jmeter.vizualizers;

import java.awt.event.MouseEvent;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HeaderClickCheckAllListenerTest
{
   public HeaderClickCheckAllListenerTest()
   {
   }

   @BeforeClass
   public static void setUpClass()
        throws Exception
   {
   }

   @AfterClass
   public static void tearDownClass()
        throws Exception
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

   /**
    * Test of mouseClicked method, of class HeaderClickCheckAllListener.
    */
   @Test
   public void testMouseClicked()
   {
      System.out.println("mouseClicked");
      JTable table=new JTable();
      MouseEvent evt = new MouseEvent(table.getTableHeader(), 0, 0, 0, 0, 0, 0, true);
      HeaderClickCheckAllListener instance = new HeaderClickCheckAllListener();
      instance.mouseClicked(evt);
   }
}
