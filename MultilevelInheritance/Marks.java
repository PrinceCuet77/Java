package MultilevelInheritance;

public class Marks extends Person {
	private int theoryMarks, labMarks;
	
	public void setTheoryMarks(int theoryMarks) {
		this.theoryMarks = theoryMarks;
	}
	
	public int getTheoryMarks() {
		return this.theoryMarks;
	}
	
	public void setLabMarks(int labMarks) {
		this.labMarks = labMarks;
	}
	
	public int getLabMarks() {
		return this.labMarks;
	}
	
	public int totalResult() {
		return this.labMarks + this.theoryMarks;
	}
}
