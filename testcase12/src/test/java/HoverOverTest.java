import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class HoverOverTest extends Base{
    @Test
    public void hoverOverProducts() throws InterruptedException {


        hoversPage.hoverOverToProduct();
        Thread.sleep(1500);
        hoversPage.clickAddToCart();
        Thread.sleep(1500);
        hoversPage.clickContinueButton();
        Thread.sleep(1500);
        hoversPage.hoverOverToSecondProduct();
        Thread.sleep(1500);
        hoversPage.clickAddToCart2();
        Thread.sleep(1500);
        hoversPage.clickViewCart();
        assertEquals(cartPage.getFirstProductName(),"Blue Top","Wrong tshirt name");
        assertEquals(cartPage.getSecondProductName(),"Men Tshirt","Wrong tshirt name");

    }
}
