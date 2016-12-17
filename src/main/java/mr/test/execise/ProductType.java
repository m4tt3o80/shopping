/**
 * 
 */
package mr.test.execise;

/**
 * A simple bean for product type data.
 * 
 * @author matteo.roscio
 */
public class ProductType {

	private String name;
	private boolean taxFree;

	/**
	 * Create a product type.
	 * 
	 * @param name
	 *            the product type name
	 * @param taxFree
	 *            if product type is tax free
	 */
	public ProductType(String name, boolean taxFree) {
		super();
		this.name = name;
		this.taxFree = taxFree;
	}

	/**
	 * Get the product type name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get <code>true</code> for tax free product type, <code>false</code> otherwise.
	 * 
	 * @return the taxFree
	 */
	public boolean isTaxFree() {
		return taxFree;
	}

}
