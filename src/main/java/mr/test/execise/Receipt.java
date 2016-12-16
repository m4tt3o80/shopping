/**
 * 
 */
package mr.test.execise;

import java.util.Map;

/**
 * @author matteo.roscio
 */
public class Receipt {

	private Map<Product, ProductInfo> items;
	private Double tax;
	private Double total;

	public static class ProductInfo {
		private Integer quantity;
		private Double cost;

		public ProductInfo(Integer quantity, Double cost) {
			this.quantity = quantity;
			this.cost = cost;
		}

		/**
		 * Standard getter for quantity.
		 * 
		 * @return the quantity
		 */
		public Integer getQuantity() {
			return quantity;
		}

		/**
		 * Standard setter for quantity.
		 * 
		 * @param quantity
		 *            the quantity to set
		 */
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		/**
		 * Standard getter for cost.
		 * 
		 * @return the cost
		 */
		public Double getCost() {
			return cost;
		}

	}

	public Receipt(Map<Product, ProductInfo> items, Double tax, Double total) {
		super();
		this.items = items;
		this.tax = tax;
		this.total = total;
	}

	/**
	 * Standard getter for items.
	 * 
	 * @return the items
	 */
	public Map<Product, ProductInfo> getItems() {
		return items;
	}

	/**
	 * Standard getter for tax.
	 * 
	 * @return the tax
	 */
	public Double getTax() {
		return tax;
	}

	/**
	 * Standard getter for total.
	 * 
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

}
