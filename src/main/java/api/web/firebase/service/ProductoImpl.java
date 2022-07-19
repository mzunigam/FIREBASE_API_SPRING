package api.web.firebase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;

import api.web.firebase.common.GenericServiceImpl;
import api.web.firebase.model.Producto;
import api.web.firebase.model.ProductoDTO;

@Service
public class ProductoImpl extends GenericServiceImpl<Producto, ProductoDTO> implements ProductoApi {
    
    @Autowired
    private Firestore firestore;

    @Override
    public CollectionReference getCollection() {
        return firestore.collection("productos");
    }
    
}
