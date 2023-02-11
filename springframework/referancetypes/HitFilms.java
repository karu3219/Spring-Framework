package com.maven.springframework.referancetypes;
import java.util.List;
public class HitFilms {
	private List<String> filmslist;
	public void setFilmslist(List<String> filmslist)
	{
		this.filmslist = filmslist;
	}
	public List<String> getFilmslist()
	{
		return filmslist;
	}
	@Override
	public String toString() {
		return "HitFilms [filmslist=" + filmslist + "]";
	}
	
}
