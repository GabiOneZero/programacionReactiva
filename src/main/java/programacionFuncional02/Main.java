package programacionFuncional02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Product> shoppingCart = List.of(
				new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread",new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese",new BigDecimal("3.59") , Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Wiskey", new BigDecimal("19.90"), Tax.NORMAL)
				);
		
				
	
		
		// CÁLCULO COSTE TOTAL CON INMPUESTOS //
		BigDecimal totalWithTaxes = shoppingCart.stream()
				.map(product -> product.price.add(product.price.multiply(new BigDecimal(product.tax.percent)).divide(new BigDecimal(100))))
				.reduce(BigDecimal.ZERO, BigDecimal::add).setScale(2, RoundingMode.CEILING);
		
		System.out.println("Coste total de la compra: " + totalWithTaxes + "€");
		
		
		// Listar todos los productos 
		
		
	}

}
