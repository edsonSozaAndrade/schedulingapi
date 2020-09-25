package com.scheduling.common;

public class Response {
    private Boolean IsCorrect;  
	private Object Content;
	
	//Getters
	
    public Boolean getIsCorrect() {
		return IsCorrect;
	}
	public Object getContent() {
		return Content;
	}
		
	//Setters

	public void setContent(Object content) {
		Content = content;
	}
	public void setIsCorrect(Boolean isCorrect) {
		IsCorrect = isCorrect;
	}
}
