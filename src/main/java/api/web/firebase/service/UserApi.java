package api.web.firebase.service;

import org.springframework.stereotype.Repository;

import api.web.firebase.common.GenericServiceAPI;
import api.web.firebase.model.User;
import api.web.firebase.model.UserDTO;

@Repository
public interface UserApi extends GenericServiceAPI<User, UserDTO> {
}
