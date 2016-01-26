package pt.americolib.webservice;

import java.util.List;

import javax.jws.WebService;

import pt.americolib.business.ProductServiceImpl;
import pt.americolib.interfaces.ProductCatalogInterface;
import pt.americolib.model.Product;

@WebService(portName="TestMartCatalogPort", serviceName="ProductCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	
	//ATTRIBUTES
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	@Override
	public List<Product> getProducts_v2(String category) {
		return productService.getProducts_v2(category);
	}
}
