package com.example.JdbcTemplateDemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JdbcController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @RequestMapping("/insert")
    public String index(){
        jdbcTemplate.execute("insert into sonoo.emp(id,name,age)values('3','Bagavathy','55')");
        return "data inserted Successfully";
    }
}
