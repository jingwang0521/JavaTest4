package com.hand.domain.entity;


import java.util.Date;

public class FilmE {

	private int  filmId;

	private  String description;

	private String title;

	private int languageId;

	private int originalLanguageId;

	private int rental_duration;

	private int length;

	private double rentalRate;

	private Date lastUpdate;

	private double  replacementCost;

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
}
