import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {
	private String tourOption;
	
	public TourBean() {}

	public String startTheTour() {
		if(tourOption != null && tourOption.equals("city")) {
			return "cityTour";
		} else {
			return "countryTour";
		}
	}
	
	public String getTourOption() {
		return tourOption;
	}

	public void setTourOption(String tourOption) {
		this.tourOption = tourOption;
	}
	
	
}
