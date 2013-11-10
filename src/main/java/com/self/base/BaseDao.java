package com.self.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

/**
 * dao抽象类
 * User: guodan
 * Date: 10/15/13
 * Time: 7:32 PM
 */
public abstract class BaseDao {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private JdbcTemplate jdbcTemplate;

    protected JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
