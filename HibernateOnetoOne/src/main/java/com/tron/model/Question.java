package com.tron.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question 
{
	@Id
	@Column(name="question_id")
	private Integer id;
	
	private String question;
	
	//Reference variable for has a relationship
	//cascade - what ever happens to question will happen to answer
	//This will remove any exception which occurs when operating on question
	//If persist is used on question then it will be done to answer as  well
	@OneToOne(cascade=CascadeType.ALL)
	private Answer answer;
	
	public Question()
	{
		System.out.println("Zero Param Constructor of Question");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
}
