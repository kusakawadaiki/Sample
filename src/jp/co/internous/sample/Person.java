package jp.co.internous.sample;

public class Person {

	private String firstName;
	private String familyName;
	private String birthday;
	private int age;
	
	public Person(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}
	
	public Person(String firstName, String familyName,String birthday, int age) {
		this.firstName = firstName;
		this.familyName = firstName;
		this.birthday = birthday;
		this.age = age;
	}
	
	public void setFirstName(String firstName) {
		this .firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	    }	
	
	public void setFamilyName(String familyName) {
		this .familyName = familyName;
		}
		
	public String getFamilyName() {
		return familyName;
		}
	
	public void setBirthday(String birthday) {
		this .birthday = birthday;
	}
	
	public String getBirthday() {
		return birthday;
	    }	
	
	public void setAge(int age) {
		this .age = age;
		}
		
	public int getAge() {
		return age;
		}
	
	public void jikoshokai() {
		System.out.println(familyName + firstName + "です。" + birthday + "生まれの" + age +"歳です。" );
	}
	
}
