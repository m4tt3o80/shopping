/**
 * 
 */
package mr.test.execise;

import java.util.Map;

/**
 * A simple bean for a receipt.
 * 
 * @author matteo.roscio
 */
public class Receipt {

	private Map<Product, ProductInfo> items;
	private Double tax;
	private Double total;

	/**
	 * A simple bean for product info required by receipt.
	 */
	public static class ProductInfo {
		private Integer quantity;
		private Double cost;

		/**
		 * Create a product info.
		 * 
		 * @param quantity
		 *            a product quantity
		 * @param cost
		 *            a product cost
		 */
		public ProductInfo(Integer quantity, Double cost) {
			this.quantity = quantity;
			this.cost = cost;
		}

		/**
		 * Get the product quantity for receipt.
		 * 
		 * @return the quantity
		 */
		public Integer getQuantity() {
			return quantity;
		}

		/**
		 * Set the product quantity for receipt.
		 * 
		 * @param quantity
		 *            the quantity to set
		 */
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		/**
		 * Get the product cost for receipt.
		 * 
		 * @return the cost
		 */
		public Double getCost() {
			return cost;
		}

	}

	/**
	 * Create a receipt.
	 * 
	 * @param items
	 *            a collection of products
	 * @param tax
	 *            the tax amount
	 * @param total
	 *            the total amount
	 */
	public Receipt(Map<Product, ProductInfo> items, Double tax, Double total) {
		super();
		this.items = items;
		this.tax = tax;
		this.total = total;
	}

	/**
	 * Get the collection of products.
	 * 
	 * @return the items
	 */
	public Map<Product, ProductInfo> getItems() {
		return items;
	}

	/**
	 * Get the tax amount.
	 * 
	 * @return the tax
	 */
	public Double getTax() {
		return tax;
	}

	/**
	 * Get the total amount.
	 * 
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

}
