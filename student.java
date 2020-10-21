//creating object 

public class Student{
	private String name;
	private double[] G;
	private int currentNumberOfStudents;

	//creating constructor with arguments
	public student(String name, double[] G){
		this.name=name;
		this.G=G;
	}
	// creating getters and setters method
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setGrades(double[] grades){
		this.G=G;
	}
	public double [] getGrades(){
		return grades;
	}
	public int getNumberOfStudents(){
		// generating randon number of students up to 100
		currentNumberOfStudents=(int)(Math.random()* 100);
		return currentNumberOfStudents;
	}
	public double getAverageGrades(){
		double sum=0;
		double average=0;
	for(int i=0; i<grades.length;i++){
		sum += grades[i];
		average=sum/grades.length;
	}
	return average;
	}
	public String getPrintStudentsDetails(){
		String details = "Your name is "+getName()+", you have an average grade of: " +getAverageGrades()+" and current number of Students is: "+this.currentNumberOfStudents;
		return details;

	}

}