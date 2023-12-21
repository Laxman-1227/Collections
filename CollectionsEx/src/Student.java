import java.io.Serializable;

public class Student implements Serializable {
	
	String name;
	String address;
	int id;
	transient String passWord;
	
	
	public Student(String name, String address, int id, String passWord) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", id=" + id + ", passWord=" + passWord + "]";
	}
	
	
	

}
