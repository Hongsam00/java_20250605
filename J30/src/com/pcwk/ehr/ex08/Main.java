/**
 * Package Name : com.pcwk.ehr.ex08 <br/>
 * 파일 명: Main.java <br/>
 */
package com.pcwk.ehr.ex08;

public class Main {

	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	//avg()
	
	private static double avg(Function<Student> function) {
		int sum = 0;
        for(Student student : students) {
            sum += function.apply(student);
        }
        
        double avg = (double) sum / students.length;
        return avg;
	}
	
	public static void main(String[] args) {
//		double englishAvg = avg(s -> s.getEnglishScore());
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println("영어 평균 점수: " + englishAvg);
		
//		double mathAvg = avg(s -> s.getMathScore());
		double mathAvg = avg(Student::getMathScore);
		System.out.println("수학 평균 점수: " + mathAvg);
	}

}
