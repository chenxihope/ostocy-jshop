package com.jshop.entity;

// Generated 2012-10-10 12:34:32 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MsgtextT generated by hbm2java
 */
public class MsgtextT implements java.io.Serializable {

	private String msgtextid;
	private String text;
	private Date sendtime;

	public MsgtextT() {
	}

	public MsgtextT(String msgtextid, String text, Date sendtime) {
		this.msgtextid = msgtextid;
		this.text = text;
		this.sendtime = sendtime;
	}

	public String getMsgtextid() {
		return this.msgtextid;
	}

	public void setMsgtextid(String msgtextid) {
		this.msgtextid = msgtextid;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}

}
