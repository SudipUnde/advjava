package day10.model;

public class StudentProgress {
	private String name;
	private int totalMarks;
	public StudentProgress() {
		// TODO Auto-generated constructor stub
	}
	public StudentProgress(String name, int totalMarks) {
		super();
		this.name = name;
		this.totalMarks = totalMarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "StudentProgress [name=" + name + ", totalMarks=" + totalMarks + "]";
	}

}
