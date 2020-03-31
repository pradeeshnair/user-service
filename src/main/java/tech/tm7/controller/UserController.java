package tech.tm7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tech.tm7.domain.User;
import tech.tm7.request.UserSaveRequest;
import tech.tm7.response.UserSaveResponse;
import tech.tm7.service.UserService;

/**
 * usercontroller
 */
@RestController
@RequestMapping(value = { "/user" })
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserSaveResponse> save(@RequestBody UserSaveRequest req) {
        System.out.println("Inside save method");
        User user = userService.save(req.toUser());
        UserSaveResponse res = new UserSaveResponse();
        res.fromUser(user);
        return ResponseEntity.ok().body(res);

    }
}