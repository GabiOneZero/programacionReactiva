package programacionFuncional02;

import java.math.BigDecimal;

public class Product {
	
	public String name;
	public BigDecimal price;
	public Tax tax;
	
	public Product(String name, BigDecimal price, Tax tax) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	
	
}
