import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ProductTest extends Base{

    @Test
    public void productPage(){
        assertEquals(product.getAllProductTxt(),"ALL PRODUCTS","WRONG TXT");
        product.clickViewProduct();
        //assertEquals(product.getProductsName(),"Blue Top","Wrong name");
        assertEquals(product.getCategoryTxt(),"Category: Women > Tops");
        assertEquals(product.getPriceTxt(),"Rs. 500");
        assertEquals(product.getAvailabilityTxt(),"Availability: In Stock");
        assertEquals(product.getConditionTxt(),"Condition: New");
        assertEquals(product.getBrandTxt(),"Brand: Polo");

    }
}
