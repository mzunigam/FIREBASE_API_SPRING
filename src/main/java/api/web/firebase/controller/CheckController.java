package api.web.firebase.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import api.web.firebase.model.Check;
import api.web.firebase.model.CheckDTO;
import api.web.firebase.service.CheckApi;


@RestController
@RequestMapping("api/check")
@CrossOrigin("*")
public class CheckController {
       
    @Autowired
    private CheckApi CheckApi;

    @PostMapping(value = "/save/{id}")
	public ResponseEntity<String> save(@RequestBody Check Check, @PathVariable String id) throws Exception {
		if (id == null || id.length() == 0 || id.equals("null")) {
			id = CheckApi.save(Check);
		} else {
			CheckApi.save(Check, id);
		}
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}

	@GetMapping(value = "/findall")
	public List<CheckDTO> getAll() throws Exception {
		return CheckApi.getAll();
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<CheckDTO> delete(@PathVariable String id) throws Exception {
		CheckDTO Check = CheckApi.get(id);
		if (Check != null) {
			CheckApi.delete(id);
		} else {
			return new ResponseEntity<CheckDTO>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<CheckDTO>(Check, HttpStatus.OK);
	}
}
