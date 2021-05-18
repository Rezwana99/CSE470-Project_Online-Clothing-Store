/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ocs.systemMethods;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;

/**
 *
 * @author Rezwana Hasan
 */
public class systemMethodsTest {
    
    systemMethods m;
   
    
    @Before
    public void setUp() throws Exception {
        m = new systemMethods();
    }
      
    @Test
    public void testsignUp(){
        String n = "Rezwana";
        String u = "Rezwana";
        int p = 123;
        int ph = 123456;
        String a = "Banani";
        boolean b = m.signUp(n,u,p,ph,a);
        assertTrue(b);   
    }
    
    @Test
    public void testLogin(){
        String u = "Rezwana";
        int p = 123;
        boolean b = m.login(u, p);
        assertTrue(b);   
    }
    
    
    @Test
    public void testAddItem() {
      assertEquals("Tk2000", m.AddItem(811));
    }
    
    @Test
    public void testSearchUser(){
       assertEquals(Arrays.asList("Rezwana","123456","Dhaka").contains("Rezwana"), m.SearchUser());
    }
    
    
    
    @Test
    public void testCheck_amount(){
        
        String ID = "811";
     
       assertEquals("Amount : 2000 taka", m.Check_amount(ID));
        
    }
    
    
    @Test
    public void testViewCart_details(){   
        assertEquals("Your cart contains the following items : Kurta,T-shirt", m.ViewCart_details());   
    }
    
    @Test
    public void testViewProducts(){   
        assertEquals("You can now view the products",m.ViewProducts());   
    }
    
    @Test 
    public void testFeedback(){
        assertEquals("Feedback recorded.",m.Feedback("Good"));
    }
    
    
    @Test
    public void testDiscount() {
       assertEquals("Discount allowed",m.discount(6000));
    }
    
    
    @Test
    public void testMembership(){
        
        assertEquals("Membership card is ready",m.membership(11000));  
    
    }
    
}
  