package com.oracle.datago.model;

public class Suggest {

	private String keyword;
	private String associatedKeyword;
	private Double score;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getAssociatedKeyword() {
		return associatedKeyword;
	}

	public void setAssociatedKeyword(String associatedKeyword) {
		this.associatedKeyword = associatedKeyword;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
