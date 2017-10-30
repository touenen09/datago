package com.oracle.datago.model;

import java.util.List;

public class Response {

	private List<Document> documents;
	private List<Suggest> suggests;
	private List<Faq> faqs;

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<Suggest> getSuggests() {
		return suggests;
	}

	public void setSuggests(List<Suggest> suggests) {
		this.suggests = suggests;
	}

	public List<Faq> getFaqs() {
		return faqs;
	}

	public void setFaqs(List<Faq> faqs) {
		this.faqs = faqs;
	}

}
