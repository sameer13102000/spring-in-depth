package com.sameer.spring.basics.springDemo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

//    public void setJdbcConnection(JdbcConnection jdbcConnection) {
//        this.jdbcConnection = jdbcConnection;
//    }

    public int getgreatestOfAll(){
        int greatestValue = Integer.MIN_VALUE;
        int[] data = jdbcConnection.fetchAll();
        for(int value: data){
            if(value > greatestValue)
                greatestValue = value;
        }
        return greatestValue;
    }

}
