package br.edu.insper.desagil.backend.model;

import java.util.HashMap;
import java.util.Map;

public class Media{
	private String name;
	private int duration;
	private Map<String, Integer> ratings;
	
	public Media(String name, int duration) {
		this.name = name;
		this.duration = duration;
		this.ratings = new HashMap<>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getDurationString() {
		int seg = 0;
		int min = 0;
		int h = 0;
		String dura = "";
		if (this.duration < 60) {
			seg = this.duration;
			if(this.duration < 10) {
				dura = "0:00:0" + seg;
			}
			else {
				dura = "0:00" + seg;
			}
		}
		if (60 <= this.duration && this.duration < 3600) {
			min = this.duration/60;
			seg = (this.duration%60)*60;
			dura = "00:" + min + ":" + seg;
		}
		if (this.duration >= 3600) {
			h = (this.duration/3600);
			min = (this.duration%3600)*60;
			int i = (int) min;
			double d = min - i;
			seg = (int) (d*(60.0));
			dura = h + ":"+min+":"+ seg;		
		}
		return dura;
	}
	
	public void putRating(String name, int rating) {
		this.ratings.put(name, rating);
	}
	
	public int numberRatings() {
		return this.ratings.size();
	}
	
	public double averageRatings() {
		double soma = 0.0;
		for(String nota : this.ratings.keySet()) {
			soma += this.ratings.get(nota);
		}
		double media = soma / this.ratings.size();
		return media;
	}
	
}