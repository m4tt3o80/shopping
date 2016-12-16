package mr.test.execise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testInput1() {
		// Init product types
		ProductType bookType = new ProductType("book", true);
		ProductType foodType = new ProductType("food", true);
		ProductType genericType = new ProductType("generic", false);

		// Init products
		Product book = new Product("book", new Double(12.49), bookType, false);
		Product musicCd = new Product("music CD", new Double(14.99), genericType, false);
		Product chocolateBar = new Product("chocolate bar", new Double(0.85), foodType, false);

		List<Product> shopping = new ArrayList<Product>();
		shopping.add(book);
		shopping.add(musicCd);
		shopping.add(chocolateBar);

		ShoppingUtil.print(ShoppingUtil.calculate(shopping));
	}

	@Test
	public void testInput2() {
		// Init product types
		ProductType foodType = new ProductType("food", true);
		ProductType genericType = new ProductType("generic", false);

		// Init products
		Product importedChocolate = new Product("imported box of chocolates", new Double(10.00), foodType, true);
		Product importedPerfumeHigh = new Product("imported bottle of perfume", new Double(47.50), genericType, true);

		List<Product> shopping = new ArrayList<Product>();
		shopping.add(importedChocolate);
		shopping.add(importedPerfumeHigh);

		ShoppingUtil.print(ShoppingUtil.calculate(shopping));
	}

	@Test
	public void testInput3() {
		// Init product types
		ProductType foodType = new ProductType("food", true);
		ProductType medicalType = new ProductType("medical", true);
		ProductType genericType = new ProductType("generic", false);

		// Init products
		Product bottlePerfume = new Product("bottle of perfume", new Double(18.99), genericType, false);
		Product packetPills = new Product("packet of headache pills", new Double(9.75), medicalType, false);
		Product importedPerfumeSmall = new Product("imported bottle of perfume", new Double(27.99), genericType, true);
		Product importedBoxChocolate = new Product("box of imported chocolates", new Double(11.25), foodType, true);

		List<Product> shopping = new ArrayList<Product>();
		shopping.add(importedPerfumeSmall);
		shopping.add(bottlePerfume);
		shopping.add(packetPills);
		shopping.add(importedBoxChocolate);

		ShoppingUtil.print(ShoppingUtil.calculate(shopping));
	}

}
