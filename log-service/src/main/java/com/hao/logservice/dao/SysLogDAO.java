package com.hao.logservice.dao;

import com.hao.logservice.entity.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysLogDAO extends JpaRepository<SysLog, Long> {
}
