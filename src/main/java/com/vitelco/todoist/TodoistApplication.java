package com.vitelco.todoist;

import com.vitelco.todoist.model.Task;
import com.vitelco.todoist.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class TodoistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoistApplication.class, args);

		/*User user = new User(1l , "Ozlem" , "Iskender" , 23);
		Task task1 = new Task(1, "kitap okuma" , user , Task.Category.PERSONAL);
		Task task2 = new Task(1, "kitap okuma" , user , Task.Category.WORK); */

		//log.info("Task1: {} - Task2: {}" , task1 , task2);
	}

}
