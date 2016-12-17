/**
 * 
 */
package mr.test.execise;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import mr.test.execise.Receipt.ProductInfo;

/**
 * A manager for logical operations.
 * 
 * @author matteo.roscio
 */
public class ShoppingManager {

	private static final Double BASIC_SALE_TAX = new Double(0.10);
	private static final Double IMPORT_DUTY = new Double(0.05);
	private static final Double ROUND_VALUE = new Double(0.05);

	/**
	 * Calculate a receipt for provided products.
	 * 
	 * @param items
	 *            list of products for receipt.
	 * @return a receipt
	 */
	public static Receipt calculate(List<Product> items) {
		if (items == null || items.isEmpty()) {
			throw new IllegalArgumentException("Invalid input provided by user. Cannot calculate receipt!");
		}
		
		Map<Product, ProductInfo> shoppingMap = new HashMap<Product, ProductInfo>();
		Double net = new Double(0);
		Double tax = new Double(0);

		for (Product item : items) {
			net += item.getPrice();
			Double productTax = new Double(0);
			if (!item.getProductType().isTaxFree()) {
				productTax += round(item.getPrice() * BASIC_SALE_TAX);
			}
			if (item.isImported()) {
				productTax += round(item.getPrice() * IMPORT_DUTY);
			}
			tax += productTax;
			if (!shoppingMap.containsKey(item)) {
				shoppingMap.put(item, new ProductInfo(1, item.getPrice() + productTax));
			} else {
				shoppingMap.get(item).setQuantity(shoppingMap.get(item).getQuantity() + 1);
			}

		}
		Double total = net + tax;

		return new Receipt(shoppingMap, tax, total);
	}

	/**
	 * Print the provided receipt.
	 * 
	 * @param receipt
	 *            a receipt.
	 */
	public static void print(Receipt receipt) {
		if (receipt == null) {
			throw new IllegalArgumentException("Invalid input provided by user. Cannot print receipt!");
		}
		
		DecimalFormat f = new DecimalFormat("#0.00");
		DecimalFormatSymbols symbol = new DecimalFormatSymbols();
		symbol.setDecimalSeparator('.');
		f.setDecimalFormatSymbols(symbol);

		System.out.println("\n-------------------------------------------------------");
		for (Entry<Product, ProductInfo> item : receipt.getItems().entrySet()) {
			Product currentProduct = item.getKey();
			System.out.println(item.getValue().getQuantity() + " " + currentProduct.getName() + " at "
					+ f.format(item.getValue().getCost()));

		}

		System.out.println("Sales Taxes: " + f.format(receipt.getTax()));
		System.out.println("Total: " + f.format(receipt.getTotal()));
		System.out.println("-------------------------------------------------------");
	}

	private static double round(double value) {
		double factor = 1 / ROUND_VALUE;
		double roundedValue = (double) (Math.ceil(value * factor) / factor);
		return roundedValue;
	}

}
