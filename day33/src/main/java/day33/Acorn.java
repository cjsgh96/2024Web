package day33;

//학생 정보를 저장할 자료형을 정의하는 것
public class Acorn {
	
	//클래스 멤버변수 , 인스턴스 변수
	String id;
	String pw;
	String name;
	public Acorn(String id, String pw, String name) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public Acorn() {
		
	}

	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
