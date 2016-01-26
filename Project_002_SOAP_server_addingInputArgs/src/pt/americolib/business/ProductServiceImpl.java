package pt.americolib.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	//ATTRIBUTES
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();

	//CONSTRUCTOR
	public ProductServiceImpl() {
		//BOOKS
		bookList.add("Inferno");
		bookList.add("Joy");
		bookList.add("Casa Blanca");
		
		//MUSICS
		musicList.add("xxxxxxxx");
		musicList.add("yyyyyyyy");
		musicList.add("zzzzzzzzz");

		//MOVIES
		movieList.add("Terminator");
		movieList.add("Rambo");
		movieList.add("Rocky");
	}
	
	/** */
	public List<String> getProductCategories() {
		//LIST
		List<String> categories = new ArrayList<String>();
		categories.add("Books"); 
		categories.add("Musics"); 
		categories.add("Movies"); 
		return categories;
	}
	
	/** FUNCTION: returns a list of data */
	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "musics":
			return musicList;
		case "movies":
			return movieList;
		default:
			break;
		}
		return null;
	}
	
	/** FUNCTION: add products */
	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "musics":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return true;
		}
		return true;
	}
}
