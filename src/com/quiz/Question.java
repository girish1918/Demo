package com.quiz;

public class Question {
	private String Question;
	private String opt_1;
	private String opt_2;
	private String opt_3;
	private String opt_4;

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOpt_1() {
		return opt_1;
	}

	public void setOpt_1(String opt_1) {
		this.opt_1 = opt_1;
	}

	public String getOpt_2() {
		return opt_2;
	}

	public void setOpt_2(String opt_2) {
		this.opt_2 = opt_2;
	}

	public String getOpt_3() {
		return opt_3;
	}

	public void setOpt_3(String opt_3) {
		this.opt_3 = opt_3;
	}

	public String getOpt_4() {
		return opt_4;
	}

	public void setOpt_4(String opt_4) {
		this.opt_4 = opt_4;
	}

	public Question(String question, String opt_1, String opt_2, String opt_3, String opt_4) {
		super();
		Question = question;
		this.opt_1 = opt_1;
		this.opt_2 = opt_2;
		this.opt_3 = opt_3;
		this.opt_4 = opt_4;
	}

	@Override
	public String toString() {
		return "Questions [Question=" + Question + ", opt_1=" + opt_1 + ", opt_2=" + opt_2 + ", opt_3=" + opt_3
				+ ", opt_4=" + opt_4 + "]";
	}

}
