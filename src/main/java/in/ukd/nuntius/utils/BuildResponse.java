package in.ukd.nuntius.utils;

import in.ukd.nuntius.model.ResponseStatus;
import in.ukd.nuntius.model.Result;

public class BuildResponse {

	public static Result buildErrorResponse(String message) {
		return new Result(ResponseStatus.FAILURE, message, null);
	}

	public static Result buildSuccessResponse(Object data) {
		return new Result(ResponseStatus.SUCCESS, null, data);
	}
}
