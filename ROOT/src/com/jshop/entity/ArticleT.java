package com.jshop.entity;

// Generated 2012-10-10 12:34:32 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ArticleT generated by hbm2java
 */
public class ArticleT implements java.io.Serializable {

	private String articleid;
	private String articleCategoryTid;
	private String title;
	private String metaKeywords;
	private String metaDes;
	private String contentvalue;
	private String status;
	private Date createtime;
	private String creatorid;
	private String author;
	private String ispublication;
	private String isrecommend;
	private String istop;
	private Integer readcount;
	private String htmlPath;
	private Integer pageCount;
	private String articleCategoryName;
	private String position;
	private String isnotice;
	private Date updatetime;
	private int versiont;

	public ArticleT() {
	}

	public ArticleT(String articleid, String articleCategoryTid, String title,
			String contentvalue, String status, Date createtime,
			String creatorid, String author, String ispublication,
			String isrecommend, String istop, String articleCategoryName,
			Date updatetime, int versiont) {
		this.articleid = articleid;
		this.articleCategoryTid = articleCategoryTid;
		this.title = title;
		this.contentvalue = contentvalue;
		this.status = status;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.author = author;
		this.ispublication = ispublication;
		this.isrecommend = isrecommend;
		this.istop = istop;
		this.articleCategoryName = articleCategoryName;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	public ArticleT(String articleid, String articleCategoryTid, String title,
			String metaKeywords, String metaDes, String contentvalue,
			String status, Date createtime, String creatorid, String author,
			String ispublication, String isrecommend, String istop,
			Integer readcount, String htmlPath, Integer pageCount,
			String articleCategoryName, String position, String isnotice,
			Date updatetime, int versiont) {
		this.articleid = articleid;
		this.articleCategoryTid = articleCategoryTid;
		this.title = title;
		this.metaKeywords = metaKeywords;
		this.metaDes = metaDes;
		this.contentvalue = contentvalue;
		this.status = status;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.author = author;
		this.ispublication = ispublication;
		this.isrecommend = isrecommend;
		this.istop = istop;
		this.readcount = readcount;
		this.htmlPath = htmlPath;
		this.pageCount = pageCount;
		this.articleCategoryName = articleCategoryName;
		this.position = position;
		this.isnotice = isnotice;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	public String getArticleid() {
		return this.articleid;
	}

	public void setArticleid(String articleid) {
		this.articleid = articleid;
	}

	public String getArticleCategoryTid() {
		return this.articleCategoryTid;
	}

	public void setArticleCategoryTid(String articleCategoryTid) {
		this.articleCategoryTid = articleCategoryTid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDes() {
		return this.metaDes;
	}

	public void setMetaDes(String metaDes) {
		this.metaDes = metaDes;
	}

	public String getContentvalue() {
		return this.contentvalue;
	}

	public void setContentvalue(String contentvalue) {
		this.contentvalue = contentvalue;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIspublication() {
		return this.ispublication;
	}

	public void setIspublication(String ispublication) {
		this.ispublication = ispublication;
	}

	public String getIsrecommend() {
		return this.isrecommend;
	}

	public void setIsrecommend(String isrecommend) {
		this.isrecommend = isrecommend;
	}

	public String getIstop() {
		return this.istop;
	}

	public void setIstop(String istop) {
		this.istop = istop;
	}

	public Integer getReadcount() {
		return this.readcount;
	}

	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}

	public String getHtmlPath() {
		return this.htmlPath;
	}

	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public String getArticleCategoryName() {
		return this.articleCategoryName;
	}

	public void setArticleCategoryName(String articleCategoryName) {
		this.articleCategoryName = articleCategoryName;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getIsnotice() {
		return this.isnotice;
	}

	public void setIsnotice(String isnotice) {
		this.isnotice = isnotice;
	}

	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

}
