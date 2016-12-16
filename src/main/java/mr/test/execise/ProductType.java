/**
 * 
 */
package mr.test.execise;

/**
 * @author matteo.roscio
 */
public class ProductType {

	private String name;
	private boolean taxFree;

	public ProductType(String name, boolean taxFree) {
		super();
		this.name = name;
		this.taxFree = taxFree;
	}

	/**
	 * Standard getter for name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Standard getter for taxFree.
	 * 
	 * @return the taxFree
	 */
	public boolean isTaxFree() {
		return taxFree;
	}

}
