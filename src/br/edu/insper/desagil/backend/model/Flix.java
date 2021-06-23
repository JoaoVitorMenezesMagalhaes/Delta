package br.edu.insper.desagil.backend.model;

public class Flix {
	private Series series;
	private double rating;

	public Flix(Series series, double rating) {
		this.series = series;
		this.rating = rating;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}
