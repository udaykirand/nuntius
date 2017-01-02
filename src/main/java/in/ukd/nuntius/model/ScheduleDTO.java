package in.ukd.nuntius.model;

public class ScheduleDTO {

	private boolean executeNow;
	
	private String startDate;
	
	private String endDate;
	
	private int repeatInterval;
	
	private String repeatUnit;

	public boolean isExecuteNow() {
		return executeNow;
	}

	public void setExecuteNow(boolean executeNow) {
		this.executeNow = executeNow;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getRepeatInterval() {
		return repeatInterval;
	}

	public void setRepeatInterval(int repeatInterval) {
		this.repeatInterval = repeatInterval;
	}

	public String getRepeatUnit() {
		return repeatUnit;
	}

	public void setRepeatUnit(String repeatUnit) {
		this.repeatUnit = repeatUnit;
	}
	
	
}
