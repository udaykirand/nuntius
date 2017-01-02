package in.ukd.nuntius.model;

public class Response extends AbstractResponse {

	private Object data = null;

    /**
     * This empty constructor is for Jackson while converting response (especially from test cases)
     */
    public Response() {

    }
	public Response(ResponseErrorMessage errorMessage) {
        super(errorMessage);
    }

    public Response(String message) {
        super(message);
    }

    public Response(String message, ResponseErrorMessage errorMessage) {
        super(message, errorMessage);
    }

    public Response(ResponseStatus status, String message) {
        super(status, message);
    }

    public Response(ResponseStatus status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Response(Object data) {
        this.status = ResponseStatus.SUCCESS;
        this.data = data;
    }

    public Response(String message, Object data) {
        super(message);
        this.status = ResponseStatus.SUCCESS;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
	
}
