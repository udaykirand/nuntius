package in.ukd.nuntius.service;

import org.springframework.stereotype.Service;

import in.ukd.nuntius.model.NuntiusDTO;

@Service
public interface NuntiusJobService {

	String createJob(NuntiusDTO nuntiusDto);

}
