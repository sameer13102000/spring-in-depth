package com.sameer.spring.basics.component.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class componentDAO {

    @Autowired
    componentJdbcConnection jdbcConnection;

    public componentJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(componentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
