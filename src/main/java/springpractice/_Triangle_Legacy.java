package main.java.springpractice;

public class _Triangle_Legacy {
	private String type;
	private int height;
	public _Triangle_Legacy(String type) {
		this.type=type;
	}
	
	public _Triangle_Legacy(String type,int height) {
		this.type = type;
		this.height = height;
	}
	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}

	public int getHeight() {
		return height;
	}

	public void draw() {
		System.out.println(getType()+" Triangle drawn of height "+getHeight());
	}
	
}
