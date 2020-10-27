import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class StudentOne {
	private String firstName;
	private String lastName;
	private String email;
	private int freePass;
	private String postalCode;
	private String phoneNumber;
	private String CourseCode;
	
	public StudentOne() {}

	public String getFirstName() {
		return firstName;
	}
	
	public void validateCourseCode(FacesContext context, UIComponent component, Object userInput) throws ValidatorException {
		if(userInput == null) {
			return;
		}
		
		String data = userInput.toString();
		
		// User input must start with PT
		if(!data.startsWith("PT")) {
			FacesMessage message = new FacesMessage("Course code must start with PT");
			throw new ValidatorException(message);
		}
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFreePass() {
		return freePass;
	}

	public void setFreePass(int freePass) {
		this.freePass = freePass;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCourseCode() {
		return CourseCode;
	}

	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	
}
