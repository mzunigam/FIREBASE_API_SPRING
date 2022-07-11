package api.web.firebase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import api.web.firebase.model.Report;
import api.web.firebase.model.ReportDTO;
import api.web.firebase.service.ReportApi;

@RestController
@RequestMapping("api/report")
@CrossOrigin("*")
public class ReportController {
    
    @Autowired
    private ReportApi reportApi;

    @PostMapping(value = "/save/{id}")
	public ResponseEntity<String> save(@RequestBody Report Report, @PathVariable String id) throws Exception {
		if (id == null || id.length() == 0 || id.equals("null")) {
			id = reportApi.save(Report);
		} else {
			reportApi.save(Report, id);
		}
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}

	@GetMapping(value = "/findall")
	public List<ReportDTO> getAll() throws Exception {
		return reportApi.getAll();
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<ReportDTO> delete(@PathVariable String id) throws Exception {
		ReportDTO Report = reportApi.get(id);
		if (Report != null) {
			reportApi.delete(id);
		} else {
			return new ResponseEntity<ReportDTO>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<ReportDTO>(Report, HttpStatus.OK);
	}
}
