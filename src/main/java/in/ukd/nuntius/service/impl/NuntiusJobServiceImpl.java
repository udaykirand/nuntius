package in.ukd.nuntius.service.impl;

import org.springframework.stereotype.Service;

import in.ukd.nuntius.model.NuntiusDTO;
import in.ukd.nuntius.service.AbstractNuntiusService;
import in.ukd.nuntius.service.NuntiusJobService;

@Service
public class NuntiusJobServiceImpl extends AbstractNuntiusService implements NuntiusJobService {

	@Override
	public String createJob(NuntiusDTO nuntiusDto) {
		return "job-created";
	}

}
