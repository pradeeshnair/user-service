package tech.tm7.request;

import tech.tm7.domain.User;

/**
 * UserSaveRequest
 */
public class UserSaveRequest {

    private String _id;

    private String firstName;

    private String lastName;

    private String email;

    public String get_id() {
        return _id;
    }

    public void set_id(final String _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public User toUser() {
        User user = new User();
        user.set_id(this._id);
        user.setEmail(this.email);
        user.setFirstName(this.firstName);
        user.setLastname(this.lastName);
        return user;
    }

}