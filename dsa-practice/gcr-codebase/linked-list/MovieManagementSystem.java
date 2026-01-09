package ObjectOrientedProgrammin;

class MovieNode {
	String title;
	String director;
	int year;
	double rating;
	MovieNode next;
	MovieNode prev;

	MovieNode(String title, String director, int year, double rating) {
		this.title = title;
		this.director = director;
		this.year = year;
		this.rating = rating;
		this.next = null;
		this.prev = null;
	}

	@Override
	public String toString() {
		return "Movie Title : " + this.title + "\n" + "Director : " + this.director + "\n" + "Releasing year : "
				+ this.year + "\n" + "Movie Rating : " + this.rating + "\n";
	}
}

public class MovieManagementSystem {
	private static MovieNode head;
	private static MovieNode tail;

	public static void addMovie(MovieNode newMovie) {
		if (head == null) {
			head = newMovie;
			tail = newMovie;
		} else {
			newMovie.prev = tail;
			tail.next = newMovie;
			tail = newMovie;
		}
	}

	public static void deleteMovieRecord(String movieTitle) {
		MovieNode temp = head;
		while (temp != null && !temp.title.equals(movieTitle)) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("No movie present with this movie title");
		} else if (temp.prev == null) {
			if (temp == tail) {
				tail = null;
			}
			head = temp.next;
		} else {
			temp.prev.next = temp.next;
		}
	}

	public static MovieNode serachMovie(String director) {
		MovieNode temp = head;
		while (temp != null) {
			if (temp.director.equals(director))
				return temp;
		}
		return temp;
	}

	public static void display() {
		MovieNode temp = head;
		while (temp != null) {
			System.out.println(temp);
			temp = temp.next;
		}
	}

	public static void updateRating(String movieTitle, double rating) {
		MovieNode temp = head;
		while (temp != null) {
			if (temp.title.equals(movieTitle))
				break;
		}
		if (temp != null) {
			temp.rating = rating;
		}

	}

	public static void main(String[] args) {
		MovieNode movie1 = new MovieNode("Kabir singh", "Raj Bahadur", 2025, 5);
		MovieNode movie2 = new MovieNode("Dhurendar", "Akshay Kumar", 2025, 8);
		MovieNode movie3 = new MovieNode("Kanatar", "Raj Mouli", 2024, 9);
		MovieNode movie4 = new MovieNode("Krrish", "Rohit", 2015, 8);
		MovieNode movie5 = new MovieNode("Koi Mill Gya", "Hritik Roshan", 2014, 6);

		addMovie(movie1);
		addMovie(movie2);
		addMovie(movie3);
		addMovie(movie4);
		addMovie(movie5);

		display();
	}

}
