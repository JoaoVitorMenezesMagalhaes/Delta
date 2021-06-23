package br.edu.insper.desagil.backend.model.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.edu.insper.desagil.backend.core.Endpoint;
import br.edu.insper.desagil.backend.model.Episode;
import br.edu.insper.desagil.backend.model.Flix;
import br.edu.insper.desagil.backend.model.Series;
import br.edu.insper.desagil.backend.model.User;

public class FlixEndpoint extends Endpoint<Flix> {
	private Series series;

	public FlixEndpoint() {
		super("/series");

		Episode s1e1 = new Episode("Winter Is Coming", 5, 1);
		s1e1.putRating(new User("a"), 10);
		s1e1.putRating(new User("b"), 9);
		s1e1.putRating(new User("c"), 8);

		Episode s1e2 = new Episode("The Kingsroad", 5, 1);
		s1e2.putRating(new User("a"), 7);
		s1e2.putRating(new User("b"), 6);

		Episode s2e1 = new Episode("The North Remembers", 5, 2);
		s2e1.putRating(new User("a"), 5);

		Episode s3e1 = new Episode("Valar Dohaeris", 5, 3);

		List<Episode> episodes = new ArrayList<>();
		episodes.add(s1e1);
		episodes.add(s1e2);
		episodes.add(s2e1);
		episodes.add(s3e1);

		series = new Series("Game of Thrones", episodes);
	}

	@Override
	public Flix get(Map<String, String> args) {
		return new Flix(series, series.seasonRating(1));
	}
}
