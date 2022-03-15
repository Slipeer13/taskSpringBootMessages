package com.example.taskSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessagesRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Messages> findAll(String messageName) {
        List<Messages> messages = jdbcTemplate.query("select * from sales.messages where name=" +"'" + messageName + "'", new BeanPropertyRowMapper<>(Messages.class));
        return messages;
    }

    public void save(Messages messages) {
        jdbcTemplate.update(
                "INSERT INTO sales.messages (message, name) VALUES (?, ?)", messages.getMessage(), messages.getName());
    }

}
