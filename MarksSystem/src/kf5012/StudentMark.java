package kf5012;

public class StudentMark implements Comparable<StudentMark> {
	private int mark;
	private String name;
	
	public StudentMark(){
		name = "Not set";
		mark =0;
	}
	
	public void setName(String studentName) {
		name = studentName;
	}
	
	public void setMark(int newMark) {
		mark = newMark;
	}
	
	public int getMark() {
		return mark;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean hasPassed(){
		return (mark>=40);
	}

	@Override
	public int compareTo(StudentMark o) {
		return o.mark-this.mark;
	}
}