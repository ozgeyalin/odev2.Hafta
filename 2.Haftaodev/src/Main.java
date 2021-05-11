
public class Main {

	public static void main(String[] args){
		Course course1 = new Course(1, " Kamp", "C + Angular", "Engin Demirog",
				"ÜCRETSZ");
		Course course2 = new Course(2, " Kamp", "Java + React", "Engin Demirog",
				"ÜCRETSZ");
		Course course3 = new Course(3, "Programlamaya Giris için Temel Kurs", "Python, Java, C#", "Engin Demirog",
				"ÜCRETSZ");

		Course[] courses = { 
				course1, 
				course2, 
				course3 
		};
		
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		
		System.out.println("----------");
		
		Author author1 = new Author(1,"Engine Demirog");
		
		Author[] authors = {
			author1	
		};
		
		for (Author author : authors) {
			System.out.println(author.author);
		}
		
		System.out.println("----------");
		
		CourseManager courseManager = new CourseManager();
		courseManager.detailOfProgram(course1);
		courseManager.applyToProgram(course1);
		
		courseManager.detailOfProgram(course2);
		courseManager.applyToProgram(course2);

	}

}
