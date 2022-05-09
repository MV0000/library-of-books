package practise.lesson_15_refactoring.homework.level_6_middle.videostore;

import com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_6_middle.videostore.Movie;

class Rental {

	private com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_6_middle.videostore.Movie movie;
	private int daysRented;

	public Rental (com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_6_middle.videostore.Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}

	public com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_6_middle.videostore.Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}
}