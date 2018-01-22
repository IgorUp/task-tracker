package tracker.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tracker.dto.UserDto;
import tracker.model.User;
import tracker.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by igor
 */
@Api
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "user", notes = "")
    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    @ResponseBody
    private ResponseEntity<List<UserDto>> list() {
        List<User> users = userService.userList();
        List<UserDto> userDtoList = users.stream().map(UserDto::new).collect(Collectors.toList());
        return ResponseEntity.ok(userDtoList);
    }

}
