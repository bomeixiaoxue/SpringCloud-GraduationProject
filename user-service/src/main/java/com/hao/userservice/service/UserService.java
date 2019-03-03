package com.hao.userservice.service;


import com.forezp.dto.RespDTO;
import com.forezp.exception.CommonException;
import com.forezp.exception.ErrorCode;
import com.hao.userservice.client.AuthServiceClient;
import com.hao.userservice.dao.UserDao;
import com.hao.userservice.dto.LoginDTO;
import com.hao.userservice.entity.JWT;
import com.hao.userservice.entity.User;
import com.hao.userservice.util.BPwdEncoderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    AuthServiceClient authServiceClient;

    public User createUser(User user) {
        return userDao.save(user);
    }

    public User getUserInfo(String username) {
        return userDao.findByUsername(username);
    }

    public RespDTO login(String username, String password) {
        User user = userDao.findByUsername(username);
        if (null == user) {
            throw new CommonException(ErrorCode.USER_NOT_FOUND);
        }
        if (!BPwdEncoderUtils.matches(password, user.getPassword())) {
            throw new CommonException(ErrorCode.USER_PASSWORD_ERROR);
        }

        JWT jwt = authServiceClient.getToken("Basic dWFhLXNlcnZpY2U6MTIzNDU2", "password", username, user.getPassword());
        // 获得用户菜单
        if (null == jwt) {
            throw new CommonException(ErrorCode.GET_TOKEN_FAIL);
        }
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUser(user);
        loginDTO.setToken(jwt.getAccess_token());
        return RespDTO.onSuc(loginDTO);
    }
}
