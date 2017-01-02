package in.ukd.nuntius.model;

import org.springframework.http.HttpStatus;

public final class ResponseErrorMessage {
    private final String message;
    private final int code;

    public ResponseErrorMessage(String errorMessage, int code) {
        this.code = code;
        this.message = errorMessage;
    }
    public ResponseErrorMessage(String errorMessage) {
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
        this.message = errorMessage;
    }
    
    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    /**
     * Returns a copy of this ResponseErrorMessage with the codeParam altered.
     * @param codeParam the http code to set in the result
     * @return a <code>ResponseErrorMessage</code> with http code altered.
     */
    public ResponseErrorMessage withCode(int codeParam) {
        return new ResponseErrorMessage(message, codeParam);
    }

    /**
     * Returns a copy of this ResponseErrorMessage with the message altered.
     * @param messageParam the message to set in the result
     * @return a <code>ResponseErrorMessage</code> with message altered.
     */
    public ResponseErrorMessage withMessage(String messageParam) {
        return new ResponseErrorMessage(messageParam, code);
    }
}
