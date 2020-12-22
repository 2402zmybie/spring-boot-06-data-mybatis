package com.hr.springboot;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
class SpringBoot06DataMybatisApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @SneakyThrows
    @Test
    void contextLoads() {
        DataSource dataSource = jdbcTemplate.getDataSource();
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
