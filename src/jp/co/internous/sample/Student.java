package jp.co.internous.sample;

public class Student {
	private String name;
	
	public Student() {
		this.name = "佐藤花子";
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void introduceName() {
		System.out.println("私の名前は" + name + "です。");
	}
	
}
