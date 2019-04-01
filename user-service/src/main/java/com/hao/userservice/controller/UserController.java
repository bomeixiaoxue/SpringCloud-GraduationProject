package com.hao.userservice.controller;

import com.hao.base.MapperFactory;
import com.hao.base.entity.UserEntity;
import com.hao.base.vo.ResponseVO;
import com.hao.userservice.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author hao
 * @date 2019/3/31 15:57
 * description
 */
@RestController
public class UserController {

    @Resource
    private IUserService iUserService;

    @Resource
    private MapperFactory mapperFactory;

    @RequestMapping(value = "/get")
    public ResponseVO get(UserEntity userEntity){
        return iUserService.get(userEntity);
    }

    @RequestMapping(value = "/getList")
    public ResponseVO getList(UserEntity userEntity){
        return iUserService.getList(userEntity);
    }

    @RequestMapping(value = "/createUser")
    public ResponseVO createUser(UserEntity userEntity){
        return iUserService.add(userEntity);
    }

    @RequestMapping(value = "/deleteUser")
    public ResponseVO deleteUser(UserEntity userEntity){
        return iUserService.delete(userEntity);
    }

    @RequestMapping(value = "/updateUser")
    public ResponseVO updateUser(UserEntity userEntity){
        return iUserService.update(userEntity);
    }

    @RequestMapping(value = "/name")
    public String name(){
        System.err.println(mapperFactory.getUserEntityMapper().selectUser("admin"));
        return "林广豪";
    }



//    @Autowired
//    UserService userService;
//
//    @ApiOperation(value = "注册", notes = "username和password为必选项")
//    @PostMapping("/registry")
//    @SysLogger("registry")
//    public User createUser(@RequestBody User user) {
//        //参数判读省略,判读该用户在数据库是否已经存在省略
//        String entryPassword = BPwdEncoderUtils.BCryptPassword(user.getPassword());
//        user.setPassword(entryPassword);
//        return userService.createUser(user);
//    }
//
//    @ApiOperation(value = "登录", notes = "username和password为必选项")
//    @PostMapping("/login")
//    @SysLogger("login")
//    public RespDTO login(@RequestParam String username, @RequestParam String password) {
//        //参数判读省略
//        return userService.login(username, password);
//    }
//
//    @ApiOperation(value = "根据用户名获取用户", notes = "根据用户名获取用户")
//    @PostMapping("/{username}")
////    @PreAuthorize("hasRole('USER')")
//    @SysLogger("getUserInfo")
//    // @PreAuthorize("hasAnyAuthority('ROLE_USER')")
//    public RespDTO getUserInfo(@PathVariable("username") String username) {
//        //参数判读省略
//        User user = userService.getUserInfo(username);
//        return RespDTO.onSuc(user);
//    }

//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//    @GetMapping("/test")
//    public void test(){
//        rabbitTemplate.convertAndSend(RabbitConfig.queueName, "Hello from RabbitMQ!");
//    }
}
