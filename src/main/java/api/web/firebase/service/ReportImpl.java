package api.web.firebase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;

import api.web.firebase.common.GenericServiceImpl;
import api.web.firebase.model.Report;
import api.web.firebase.model.ReportDTO;

@Service
public class ReportImpl extends GenericServiceImpl<Report, ReportDTO> implements ReportApi {
    @Autowired
    private Firestore firestore;

    @Override
    public CollectionReference getCollection() {
        return firestore.collection("reports");
    }

}

