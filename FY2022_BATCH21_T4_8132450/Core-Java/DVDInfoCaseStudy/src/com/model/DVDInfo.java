package com.model;

public class DVDInfo implements Comparable<DVDInfo>{
	String title;
	String genre;
	String leadActor;
	
	public DVDInfo(String title,String genre,String leadActor) {
		this.title=title;
		this.genre=genre;
		this.leadActor=leadActor;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getLeadActor() {
		return leadActor;
	}
	public int compareTo(DVDInfo d) {
	//	return title.compareTo(d.getTitle());
		return d.getTitle().compareTo(title);
	}
	
}
