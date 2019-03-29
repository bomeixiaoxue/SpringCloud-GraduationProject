package com.hao.ssoservice.sso.dao;

import com.hao.ssoservice.sso.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hao
 * @date 2019/3/28 20:32
 * description
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
