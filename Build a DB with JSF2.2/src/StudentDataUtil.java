import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	private List<Student> students;
	
	public StudentDataUtil() {
		loadSampleData();
	}
	
	public void loadSampleData() {
		students = new ArrayList();
		
		students.add(new Student("Petros", "Trak", "pit.trak@gmail.com"));
		students.add(new Student("Maggie", "Trak", "maggie@gmail.com"));
		students.add(new Student("Eleni", "Apost", "eleni@gmail.com"));
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
}
