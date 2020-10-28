import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class CounterClass {
	private int counter = 0;
	
	public CounterClass() {}

	public String increment() {
		counter ++;
		return "counterTwo";
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
}
