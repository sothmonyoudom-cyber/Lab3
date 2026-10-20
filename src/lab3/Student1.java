package lab3;
class Student{
	String name;
	int id;
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	Student(){
		this.name = "Unknown";
		this.id = 0;
	}
	public void print() {
		System.out.printf("%d %s \n", id, name);
	}
	public String getName() {
		return name;
	}
}
