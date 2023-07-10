package api.web.firebase.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import api.web.firebase.model.Producto;
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
    public ProductoDTO find(@PathVariable String id) throws Exception {
        return productoApi.get(id);
    }

    @PostMapping(value = "/save/{id}")
    public String save(@RequestBody Producto producto, @PathVariable String id) throws Exception {
        if (id == null || id.length() == 0 || id.equals("null")) {
            id = productoApi.save(producto);
        } else {
            productoApi.save(producto, id);
        }
        return id;
    }

    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable String id) throws Exception {
        productoApi.delete(id);
    }


}
