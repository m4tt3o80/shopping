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
 * @author matteo.roscio
 */
public class ShoppingUtil {

	private static final Double BASIC_SALE_TAX = new Double(0.10);
	private static final Double IMPORT_DUTY = new Double(0.05);

	public static Receipt calculate(List<Product> items) {
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

	public static void print(Receipt receipt) {
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
		double factor = 1 / 0.05;
		double roundedValue = (double) (Math.ceil(value * factor) / factor);
		return roundedValue;
	}

}
