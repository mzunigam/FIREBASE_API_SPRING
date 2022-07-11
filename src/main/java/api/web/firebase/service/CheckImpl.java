package api.web.firebase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;

import api.web.firebase.common.GenericServiceImpl;
import api.web.firebase.model.Check;
import api.web.firebase.model.CheckDTO;

@Service
public class CheckImpl extends GenericServiceImpl<Check, CheckDTO> implements CheckApi {

    @Autowired
    private Firestore firestore;

    @Override
    public CollectionReference getCollection() {
        return firestore.collection("checks");
    }
    
}
