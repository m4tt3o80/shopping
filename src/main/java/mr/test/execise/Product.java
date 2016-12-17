/**
 * 
 */
package mr.test.execise;

/**
 * A simple bean for product data.
 * 
 * @author matteo.roscio
 */
public class Product {

	private String name;
	private Double price;
	private ProductType productType;
	private boolean imported;

	/**
	 * Create a new product.
	 * 
	 * @param name
	 *            product name
	 * @param price
	 *            product price
	 * @param productType
	 *            product type
	 * @param imported
	 *            if product is imported
	 */
	public Product(String name, Double price, ProductType productType, boolean imported) {
		super();
		this.name = name;
		this.price = price;
		this.productType = productType;
		this.imported = imported;
	}

	/**
	 * Get the product name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the product price.
	 * 
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Get the product type.
	 * 
	 * @return the productType
	 */
	public ProductType getProductType() {
		return productType;
	}

	/**
	 * Get <code>true</code> for imported product, <code>false</code> otherwise.
	 * 
	 * @return the imported
	 */
	public boolean isImported() {
		return imported;
	}

}
