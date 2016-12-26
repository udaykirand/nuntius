package in.ukd.nuntius.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.ukd.nuntius.model.Result;
import in.ukd.nuntius.model.ResultStatus;

@RestController
@RequestMapping(value = "/api/v1/job")
public class NuntiusBaseController {
	
	public static final Logger LOG = LoggerFactory.getLogger(NuntiusBaseController.class); 
	
	@RequestMapping(method = RequestMethod.GET)
	public Result getBase() {
		return new Result(ResultStatus.SUCCESS, "STARTED", null);
	}

}
