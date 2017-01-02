package in.ukd.nuntius.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.ukd.nuntius.model.NuntiusDTO;
import in.ukd.nuntius.model.Result;
import in.ukd.nuntius.service.NuntiusJobService;
import in.ukd.nuntius.utils.BuildResponse;

@RestController
@RequestMapping(value = "/api/v1/job")
public class NuntiusController {

	public static final Logger LOG = LoggerFactory.getLogger(NuntiusController.class);
	
	@Autowired
	private NuntiusJobService nuntiusJobService;
	

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public Result getBase() {
		return BuildResponse.buildSuccessResponse("RUNNING");
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Result createJob(@RequestBody @Validated final NuntiusDTO nuntiusDto, HttpServletRequest request) {
		LOG.info("Request [" + nuntiusDto+"]");
		String jobId = nuntiusJobService.createJob(nuntiusDto);
		return BuildResponse.buildSuccessResponse(jobId);
	}

}
