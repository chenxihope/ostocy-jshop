package com.jshop.entity;

// Generated 2012-10-10 12:34:32 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ProductT generated by hbm2java
 */
public class ProductT implements java.io.Serializable {

	private String productid;
	private Double price;
	private Double memberprice;
	private Double cost;
	private Double saleprice;
	private Integer freezeStore;
	private Integer store;
	private String isDefault;
	private String isSalestate;
	private String productName;
	private String productSn;
	private String specificationsValue;
	private String warehouseLocation;
	private String placeStore;
	private String weight;
	private String goodsid;
	private String creatorid;
	private Date createtime;
	private String specificationsid;
	private String specificationsName;

	public ProductT() {
	}

	public ProductT(String productid, String isDefault, String isSalestate,
			String productName, String specificationsValue, String goodsid,
			String creatorid, Date createtime, String specificationsid,
			String specificationsName) {
		this.productid = productid;
		this.isDefault = isDefault;
		this.isSalestate = isSalestate;
		this.productName = productName;
		this.specificationsValue = specificationsValue;
		this.goodsid = goodsid;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.specificationsid = specificationsid;
		this.specificationsName = specificationsName;
	}

	public ProductT(String productid, Double price, Double memberprice,
			Double cost, Double saleprice, Integer freezeStore, Integer store,
			String isDefault, String isSalestate, String productName,
			String productSn, String specificationsValue,
			String warehouseLocation, String placeStore, String weight,
			String goodsid, String creatorid, Date createtime,
			String specificationsid, String specificationsName) {
		this.productid = productid;
		this.price = price;
		this.memberprice = memberprice;
		this.cost = cost;
		this.saleprice = saleprice;
		this.freezeStore = freezeStore;
		this.store = store;
		this.isDefault = isDefault;
		this.isSalestate = isSalestate;
		this.productName = productName;
		this.productSn = productSn;
		this.specificationsValue = specificationsValue;
		this.warehouseLocation = warehouseLocation;
		this.placeStore = placeStore;
		this.weight = weight;
		this.goodsid = goodsid;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.specificationsid = specificationsid;
		this.specificationsName = specificationsName;
	}

	public String getProductid() {
		return this.productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getMemberprice() {
		return this.memberprice;
	}

	public void setMemberprice(Double memberprice) {
		this.memberprice = memberprice;
	}

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Double getSaleprice() {
		return this.saleprice;
	}

	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}

	public Integer getFreezeStore() {
		return this.freezeStore;
	}

	public void setFreezeStore(Integer freezeStore) {
		this.freezeStore = freezeStore;
	}

	public Integer getStore() {
		return this.store;
	}

	public void setStore(Integer store) {
		this.store = store;
	}

	public String getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getIsSalestate() {
		return this.isSalestate;
	}

	public void setIsSalestate(String isSalestate) {
		this.isSalestate = isSalestate;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductSn() {
		return this.productSn;
	}

	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}

	public String getSpecificationsValue() {
		return this.specificationsValue;
	}

	public void setSpecificationsValue(String specificationsValue) {
		this.specificationsValue = specificationsValue;
	}

	public String getWarehouseLocation() {
		return this.warehouseLocation;
	}

	public void setWarehouseLocation(String warehouseLocation) {
		this.warehouseLocation = warehouseLocation;
	}

	public String getPlaceStore() {
		return this.placeStore;
	}

	public void setPlaceStore(String placeStore) {
		this.placeStore = placeStore;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getSpecificationsid() {
		return this.specificationsid;
	}

	public void setSpecificationsid(String specificationsid) {
		this.specificationsid = specificationsid;
	}

	public String getSpecificationsName() {
		return this.specificationsName;
	}

	public void setSpecificationsName(String specificationsName) {
		this.specificationsName = specificationsName;
	}

}
