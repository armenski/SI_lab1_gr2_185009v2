import java.util.ArrayList;
import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades = new ArrayList<Integer>();
	//TODO constructor
	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}
	//TODO seters & getters
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public double getAverage() {
		//TODO
		int total = 0;
		for(int gr : grades){
			total = total + gr;
		}
		double averageGrade = (double) total / grades.size();
	}

	public int ECTSCredits() {
		//TODO
		int totalCredits = 0;
		for(int tc : grades){
			if(tc > 5 && tc <= 10){
				totalCredits += 6;
			}
		}
		return totalCredits;
	}
	class Faculty{
		List<Student> lista = new ArrayList<Student>();
		String FacultyName;

		double AverageGrade(){
			double avg;
			double totalAvg = 0;
			for(Student s : lista){
				double avgStudent = s.getAverage();
				totalAvg += avgStudent;
			}
			avg = totalAvg / lista.size();
			return avg;

		}

		double AverageCredits(){
			double totalAvg = 0;
			double avgCredits;
			for(Student s : lista){
				double cdeditStudent = s.ECTSCredits();
				totalAvg += cdeditStudent;
			}
			avgCredits = totalAvg / lista.size();
			return  avgCredits;


		}
	}
}
