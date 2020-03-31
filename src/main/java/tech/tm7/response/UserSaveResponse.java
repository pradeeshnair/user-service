package tech.tm7.response;

import tech.tm7.domain.User;

/**
 * UserSaveResponse
 */
public class UserSaveResponse {

    private String _id;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void fromUser(User user) {
        this._id = user.get_id();
    }

}