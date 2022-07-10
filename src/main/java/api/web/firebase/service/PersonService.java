package api.web.firebase.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import api.web.firebase.model.User;

@Service
public class PersonService {
    
    public String savePerson(User user) throws InterruptedException, ExecutionException{
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("usuario", user.getUsuario());
        userMap.put("password", user.getPassword());
        Firestore db =  FirestoreClient.getFirestore();
        ApiFuture<DocumentReference> collection = db.collection("user").add(userMap);
        return "Successfully added "+collection.get().getId();
    }


}
