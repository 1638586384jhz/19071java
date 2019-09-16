package cn.itcast.ssm.pojo;

import java.util.Date;

public class Item {

	private int id;
	private String name;
	private double price;
	private String detail;
	private Date createTime;
	private String pic;
	public Item(int id, String name, double price, String detail, Date createTime, String pic) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.createTime = createTime;
		this.pic = pic;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", detail=" + detail + ", createTime="
				+ createTime + "]";
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name, double price, String detail, Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
