package com.jshop.entity;

// Generated 2012-10-10 12:34:32 by Hibernate Tools 3.4.0.CR1

/**
 * SystemMailM generated by hbm2java
 */
public class SystemMailM implements java.io.Serializable {

	private String smailid;
	private String sysSendmail;
	private String sysMailSmtp;
	private String sysMailPort;
	private String smtpusername;
	private String smtppwd;
	private String state;
	private String userid;
	private String nick;

	public SystemMailM() {
	}

	public SystemMailM(String smailid, String sysSendmail, String sysMailSmtp,
			String sysMailPort, String smtpusername, String smtppwd,
			String state, String userid, String nick) {
		this.smailid = smailid;
		this.sysSendmail = sysSendmail;
		this.sysMailSmtp = sysMailSmtp;
		this.sysMailPort = sysMailPort;
		this.smtpusername = smtpusername;
		this.smtppwd = smtppwd;
		this.state = state;
		this.userid = userid;
		this.nick = nick;
	}

	public String getSmailid() {
		return this.smailid;
	}

	public void setSmailid(String smailid) {
		this.smailid = smailid;
	}

	public String getSysSendmail() {
		return this.sysSendmail;
	}

	public void setSysSendmail(String sysSendmail) {
		this.sysSendmail = sysSendmail;
	}

	public String getSysMailSmtp() {
		return this.sysMailSmtp;
	}

	public void setSysMailSmtp(String sysMailSmtp) {
		this.sysMailSmtp = sysMailSmtp;
	}

	public String getSysMailPort() {
		return this.sysMailPort;
	}

	public void setSysMailPort(String sysMailPort) {
		this.sysMailPort = sysMailPort;
	}

	public String getSmtpusername() {
		return this.smtpusername;
	}

	public void setSmtpusername(String smtpusername) {
		this.smtpusername = smtpusername;
	}

	public String getSmtppwd() {
		return this.smtppwd;
	}

	public void setSmtppwd(String smtppwd) {
		this.smtppwd = smtppwd;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

}
