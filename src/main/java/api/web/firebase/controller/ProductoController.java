package api.web.firebase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import api.web.firebase.model.Producto;
import api.web.firebase.model.ProductoDTO;
import api.web.firebase.service.ProductoApi;

@RestController
@RequestMapping("api/producto")
@CrossOrigin("*")
public class ProductoController {
    
    @Autowired
    private ProductoApi ProductoApi;

    @PostMapping(value = "/save/{id}")
	public ResponseEntity<String> save(@RequestBody Producto Producto, @PathVariable String id) throws Exception {
		if (id == null || id.length() == 0 || id.equals("null")) {
			id = ProductoApi.save(Producto);
		} else {
			ProductoApi.save(Producto, id);
		}
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}

	@GetMapping(value = "/findall")
	public List<ProductoDTO> getAll() throws Exception {
		return ProductoApi.getAll();
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<ProductoDTO> delete(@PathVariable String id) throws Exception {
		ProductoDTO Producto = ProductoApi.get(id);
		if (Producto != null) {
			ProductoApi.delete(id);
		} else {
			return new ResponseEntity<ProductoDTO>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<ProductoDTO>(Producto, HttpStatus.OK);
	}
}
