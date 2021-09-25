package com.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class XMLPersonDAO {
    XMLJdbcConnection jdbcConnection;

    public XMLJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
