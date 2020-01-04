package movieassignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.List;
//import java.util.Scanner;

public class MovieImpl {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			boolean goAgain=true;//Scanner input = new Scanner(System.in);
		   while(goAgain) {
			System.out.println("Enter Details for Movie:\n");
		System.out.println("Enter Id: ");
		int id = Integer.parseInt(input.readLine());
		System.out.println("Enter Name: ");
		String name = input.readLine().trim().toUpperCase();
		System.out.println("Enter Show Date: ");
		String showDate = input.readLine().trim().toUpperCase();
		System.out.println("Enter Show Time: ");
		String showTime = input.readLine().trim().toUpperCase();
		System.out.println("Enter Movie Status: ");
		String status = input.readLine().trim().toUpperCase();

		if(!(status.equals("AVAILABLE")||status.equals("UNAVAILABLE"))) {
			System.out.println("Movie status entered is invalid, try again!");
		}
		else {
			Movie obj = new Movie(id,name,showDate,showTime,status);
			List<Movie> mList = Movie.addToList(obj);
			System.out.println("Movie Details submitted successfully!");
			System.out.println("Printing Movie Object details from list:");
			mList.forEach(m->System.out.println(m.toString()));
			System.out.println("\nFetch details by id?\n 1.Yes  2.No - press any key");
			int fetchChoice = Integer.parseInt(input.readLine());
			if(fetchChoice==1) {
			System.out.println("\n\nEnter id to fetch movie details: ");
			//System.out.println(mList.toString());
			int fetchId = Integer.parseInt(input.readLine());
			System.out.println(mList.get(fetchId-1).toString());
			}
			System.out.println("Go Again?\n1.Yes 2.No");
			int ch = Integer.parseInt(input.readLine());
			if(ch==2)
				{goAgain=false;
				System.out.println("BYE!");
				}
		}
		}
		}
		catch(IOException e) {
			System.out.println("IOException encountered!");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Movie data not present");
		}
		catch(InputMismatchException | NumberFormatException e) {
			System.out.println("input format error");
		}
		
	}

}
