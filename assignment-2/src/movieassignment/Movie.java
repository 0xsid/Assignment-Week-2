package movieassignment;

import java.util.ArrayList;

public class Movie {

	
	private int id;
	private String name;
	private String showDate;
	private String showTime;
	private String status;
	public static ArrayList<Movie> mList = new ArrayList<>();
	
	
	
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", showDate=" + showDate + ", showTime=" + showTime + ", status="
				+ status + "]";
	}



	public static ArrayList<Movie> addToList(Movie obj){
		mList.add(obj);
		return mList;
	}
	
	
	
	public Movie() {
		
	}
	
	public Movie(int id, String name, String showDate, String showTime, String status) {
		super();
		this.id = id;
		this.name = name;
		this.showDate = showDate;
		this.showTime = showTime;
		this.status = status;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getShowDate() {
		return showDate;
	}


	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}


	public String getShowTime() {
		return showTime;
	}


	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	
}
