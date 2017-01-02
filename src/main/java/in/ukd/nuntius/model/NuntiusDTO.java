package in.ukd.nuntius.model;

public class NuntiusDTO {

	private String id;
	
	private String name;
	
	private String callbackUrl;
	
	private String failureEmail;
	
	private ScheduleDTO schedule;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getFailureEmail() {
		return failureEmail;
	}

	public void setFailureEmail(String failureEmail) {
		this.failureEmail = failureEmail;
	}

	public ScheduleDTO getScheduleDTO() {
		return schedule;
	}

	public void setScheduleDTO(ScheduleDTO schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "NuntiusDTO [id=" + id + ", name=" + name + ", callbackUrl=" + callbackUrl + ", failureEmail="
				+ failureEmail + ", schedule=" + schedule + "]";
	}
}
