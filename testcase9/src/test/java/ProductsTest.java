import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ProductsTest extends Base{


    @Test
    public void verifyAndClick(){
        assertEquals(products.getAllProductTxt(),"ALL PRODUCTS","WRONG TEXT!");
        products.fillTextBox("Men Tshirt");
        products.clickSearch();
        assertEquals(products.getSearchedProductsTxt(),"SEARCHED PRODUCTS");


    }
}
