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

}
