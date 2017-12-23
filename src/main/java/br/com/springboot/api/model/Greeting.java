package br.com.springboot.api.model;

public class Greeting {

	public Greeting() {}
	
	public Greeting(Long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	private Long id;
	private String content;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
