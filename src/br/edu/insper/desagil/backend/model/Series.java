package br.edu.insper.desagil.backend.model;


import java.util.List;

public class Series extends Collection{
	private List<Episode> episodes;

	public Series(String title, List<Episode> episodes) {
		super(title);
		this.episodes = episodes;
	}
	
	public double seasonRating(int season) {
		int i = 0;
		double d = 0.0;
		int f = 1;
		double media = 0.0;
		for (Episode episode : this.episodes) {
			i += episode.numberRatings();
		}
		for (Episode episode : this.episodes) {
			d += episode.averageRatings();
		}
		if (season == f) {
			media = d*i/i;
		}
		else {
			media = 0.0;
		}
		f += 1;
		return media;
	}
	
}