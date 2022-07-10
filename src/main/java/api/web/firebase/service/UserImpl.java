package api.web.firebase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;

import api.web.firebase.common.GenericServiceImpl;
import api.web.firebase.model.User;
import api.web.firebase.model.UserDTO;

@Service
public class UserImpl extends GenericServiceImpl<User,UserDTO> implements UserApi {

    @Autowired
    private Firestore firestore;

    @Override
    public CollectionReference getCollection() {
        return firestore.collection("users");
    }

    
}
