package mr.test.execise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for shopping project.
 */
public class ShoppingTest {

	// Standard product types
	private ProductType bookType = new ProductType("book", true);
	private ProductType foodType = new ProductType("food", true);
	private ProductType genericType = new ProductType("generic", false);
	private ProductType medicalType = new ProductType("medical", true);

	// Standard products
	private Product book = new Product("book", new Double(12.49), bookType, false);
	private Product musicCd = new Product("music CD", new Double(14.99), genericType, false);
	private Product chocolateBar = new Product("chocolate bar", new Double(0.85), foodType, false);
	private Product impChocolate = new Product("imported box of chocolates", new Double(10.00), foodType, true);
	private Product impPerfumeHigh = new Product("imported bottle of perfume", new Double(47.50), genericType, true);
	private Product bottlePerfume = new Product("bottle of perfume", new Double(18.99), genericType, false);
	private Product packetPills = new Product("packet of headache pills", new Double(9.75), medicalType, false);
	private Product impPerfumeSmall = new Product("imported bottle of perfume", new Double(27.99), genericType, true);
	private Product impBoxChocolate = new Product("box of imported chocolates", new Double(11.25), foodType, true);

	private List<Product> shopping = new ArrayList<Product>();

	@Test
	public void testInputOne() {
		shopping.clear();
		shopping.add(book);
		shopping.add(musicCd);
		shopping.add(chocolateBar);
		ShoppingManager.print(ShoppingManager.calculate(shopping));
	}

	@Test
	public void testInputTwo() {
		shopping.clear();
		shopping.add(impChocolate);
		shopping.add(impPerfumeHigh);
		ShoppingManager.print(ShoppingManager.calculate(shopping));
	}

	@Test
	public void testInputThree() {
		shopping.clear();
		shopping.add(impPerfumeSmall);
		shopping.add(bottlePerfume);
		shopping.add(packetPills);
		shopping.add(impBoxChocolate);
		ShoppingManager.print(ShoppingManager.calculate(shopping));
	}

}
