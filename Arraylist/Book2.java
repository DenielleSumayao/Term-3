package Attendance;

public class Book2 {
	private final String title;
	private int price;
	private boolean favorite;
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isFavorite() {
		return favorite;
	}
	
	public void SetFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Book2(String title, int price, boolean favorite) {
		this.title = title;
		this.price = price;
		this.favorite = favorite;
	}

}
