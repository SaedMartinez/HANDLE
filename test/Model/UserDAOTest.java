package Model;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;


public class UserDAOTest {
    
    public UserDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of ValidateL method, of class UserDAO / Test unitario de metodo ValidateL (Validar login con DB ON)
     */
    
    @Test
    public void testValidateL() {
        System.out.println("ValidateL");
        String muser = "admin";
        String mpass = "admin";
        UserDAO instance = new UserDAO();
        User result = instance.ValidateL(muser, mpass);
        assertNotNull(result);
    }


    /**
     * Test of ListU method, of class UserDAO / Test unitario de metodo ListU ( Listar Usuarios con DB ON)
     */
    
    @Test
    public void testListU() {
        System.out.println("ListU");
        UserDAO instance = new UserDAO();
        List result = instance.ListU();
        assertNotNull(result);
    }    
    
    /**
     * Test of AddU method, of class UserDAO /  Test unitario de metodo AddU ( Añadir Usuarios con DB ON)
     */
    
    @Test
    public void testAddU() {
        User us = new User();
        us.setId(7);
        us.setName("Usuario Test");
        us.setPass("test");
        us.setPnum("1234");
        us.setStatus("1");
        us.setUser("test");
        
        System.out.println("AddU");
        User usTest = us;
        UserDAO instance = new UserDAO();
        int expResult=0;
        int result = instance.AddU(usTest);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of ListId method, of class UserDAO /  Test unitario de metodo ListId ( Listar Usuarios por id con DB ON)
     */
    @Test
    public void testListId() {
        System.out.println("ListId");
        int id = 2;
        UserDAO instance = new UserDAO();
        User result = instance.ListId(id);
        assertNotNull(result);
    }
    
     /**
     * Test of Update method, of class UserDAO / Test unitario de metodo Update (Actualizar usuarios con DB ON)
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        User us = new User();
        us.setId(7);
        us.setName("Usuario Test");
        us.setPass("test");
        us.setPnum("1234");
        us.setStatus("1");
        us.setUser("test");
        
        UserDAO instance = new UserDAO();
        int expResult = 0;
        int result = instance.Update(us);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of Desactivate method, of class UserDAO / Test unitario de metodo Desactivate (Desactivar usuarios con DB ON)
     */
    @Test
    public void testDesactivate() {
        System.out.println("Desactivate");
        User us = new User();
        us.setId(7);
        us.setStatus("1");
        
        UserDAO instance = new UserDAO();
        int expResult = 0;
        int result = instance.Desactivate(us);
        assertEquals(expResult, result);
    }
}
