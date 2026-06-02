package com.tron.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer 
{
	@Id
	//Need to rename the id to avoid exception
	@Column(name="answer_id")
	private Integer id;
	
	private String answer;
	
	public Answer()
	{
		System.out.println("Zero Param Contrctor of Answer");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}
}
