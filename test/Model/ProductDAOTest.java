package Model;


import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class ProductDAOTest {
    
    public ProductDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of UpsdateS method, of class ProductDAO / Test unitario de metodo UpdateS, (Actualizar cantidad de producto con DB ON)
     */
    @Test
    public void testUpsdateS() {
        System.out.println("UpsdateS");
        int stock = 1;
        int id = 2;
        ProductDAO instance = new ProductDAO();
        int expResult = 0;
        int result = instance.UpsdateS(stock, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of ListP method, of class ProductDAO / Test unitario de metodo ListP, (Listar productos con DB ON)
     */
    @Test
    public void testListP() {
        System.out.println("ListP");
        ProductDAO instance = new ProductDAO();
        List result = instance.ListP();
        assertNotNull(result);
        
    }

    /**
     * Test of AddP method, of class ProductDAO / Test unitario de metodo AddP, (Actualizar añadir productos con DB ON)
     */
    @Test
    public void testAddP() {
        System.out.println("AddP");
        Product p = new Product();
        ProductDAO instance = new ProductDAO();
        int expResult = 0;
        int result = instance.AddP(p);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of SearchP method, of class ProductDAO / Test unitario de metodo SearchP, (Actualizar añadir productos con DB ON)
     */
    @Test
    public void testSearchP() {
        System.out.println("SearchP");
        int id = 0;
        ProductDAO instance = new ProductDAO();
        Product result = instance.SearchP(id);
        assertNotNull(result);
    }    
}
