/**
 * 
 */
package mr.test.execise;

/**
 * @author matteo.roscio
 */
public class Product {

	private String name;
	private Double price;
	private ProductType productType;
	private boolean imported;

	public Product(String name, Double price, ProductType productType, boolean imported) {
		super();
		this.name = name;
		this.price = price;
		this.productType = productType;
		this.imported = imported;
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
	 * Standard getter for price.
	 * 
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Standard getter for productType.
	 * 
	 * @return the productType
	 */
	public ProductType getProductType() {
		return productType;
	}

	/**
	 * Standard getter for imported.
	 * 
	 * @return the imported
	 */
	public boolean isImported() {
		return imported;
	}

}
