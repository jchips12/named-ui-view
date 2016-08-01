package com.jchips12.nameduiview;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jchips12.nameduiview.entity.User;
import com.jchips12.nameduiview.service.UserService;

@SpringBootApplication
public class NamedUiViewApplication implements CommandLineRunner{
    
    @Autowired
    private UserService service;

	public static void main(String[] args) {
		SpringApplication.run(NamedUiViewApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        String bday = "05/30/1984";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        User user = new User("John Carlo", "Hipolito", sdf.parse(bday));
        service.insert(user);
    }
	
	
}
