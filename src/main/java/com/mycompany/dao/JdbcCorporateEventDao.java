package com.mycompany.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcCorporateEventDao implements CorporateEventDao {

  private JdbcTemplate jdbcTemplate;

  public void setDataSource(DriverManagerDataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  // JDBC-backed implementations of the methods on the CorporateEventDao follow...

}
