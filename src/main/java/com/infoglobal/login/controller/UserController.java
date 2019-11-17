package com.infoglobal.login.controller;


import com.infoglobal.login.entity.IGUser;
import com.infoglobal.login.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Component
@RestController
@RequestMapping(value = "/user")
@Api(tags = "User Login Controller")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ApiOperation(value = "Create User Entry", notes = "Returns a whole user object with added id")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error"),})
    public IGUser create(@RequestBody IGUser user) {
        return userService.create(user);
    }
}
