package com.maven.springframework.referancetypes;

public class KannadaHitFilms {
	private HitFilms films;
	public void setFilms(HitFilms films)
	{
		this.films=films;
	}
	public HitFilms getFilms()
	{
		return films;
	}
	@Override
	public String toString() {
		return "KannadaHitFilms [films=" + films + "]";
	}
	
}
