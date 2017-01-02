package in.ukd.nuntius.model;

public abstract class AbstractResponse {
	
    protected ResponseStatus status  = null;
    protected String message = null;
    protected ResponseErrorMessage error   = null;
    
    protected AbstractResponse() {
    }

    protected AbstractResponse(ResponseStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    protected AbstractResponse(ResponseErrorMessage error) {
        this.status = ResponseStatus.FAILURE;
        this.error = error;
    }

    protected AbstractResponse(String message) {
        this.message = message;
    }

    protected AbstractResponse(String message, ResponseErrorMessage error) {
        this.status = ResponseStatus.FAILURE;
        this.message = message;
        this.error = error;
    }

    public ResponseErrorMessage getError() {
        return error;
    }

    public void setError(ResponseErrorMessage error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

}
