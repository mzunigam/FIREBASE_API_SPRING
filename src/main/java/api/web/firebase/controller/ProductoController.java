package api.web.firebase.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import api.web.firebase.model.ProductoDTO;
import api.web.firebase.service.ProductoApi;

@RestController
@RequestMapping("api/producto")
@CrossOrigin("*")
public class ProductoController {

    private final ProductoApi productoApi;

    public ProductoController(ProductoApi productoApi) {
		this.productoApi = productoApi;
	}

    @GetMapping(value = "/find")
    public List<ProductoDTO> getAll() throws Exception {
        return productoApi.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public ProductoDTO getById(@PathVariable("id") String id) throws Exception {
        return productoApi.get(id);
    }

    @PostMapping(value = "/save")
    public String save(@RequestBody String productoDTO) throws Exception {
        return productoApi.save(null, productoDTO);
    }

    @PutMapping(value = "/update")
    public String update(@RequestBody String productoDTO) throws Exception {
        return productoApi.save(null, productoDTO);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") String id) throws Exception {
        productoApi.delete(id);
    }

}
