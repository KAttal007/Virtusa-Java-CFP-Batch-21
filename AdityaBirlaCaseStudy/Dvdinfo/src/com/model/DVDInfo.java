

package com.model;

public class DVDInfo implements Comparable<DVDInfo> {
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
	@Override
	public int compareTo(DVDInfo o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.getTitle());
	}
	
}
