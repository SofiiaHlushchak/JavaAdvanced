package ua.lviv.lgs.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.dao.StudentDao;

@SpringBootApplication
public class App {
	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
		Student student = (Student) ctx.getBean("student");
		StudentDao studentDao = (StudentDao) ctx.getBean("studentDao");
		ConsoleEventLogger consoleEventLogger = (ConsoleEventLogger) ctx.getBean("consoleEventLogger");

		consoleEventLogger.logEvent("create " + studentDao.addStudent(student).toString());

		consoleEventLogger.logEvent("Read first student ---> " + studentDao.readStudent(0).toString());

		consoleEventLogger.logEvent("Read all Students ---> " + studentDao.readAll());

		consoleEventLogger.logEvent("Read all Students ---> " + studentDao.update(new Student( 1, "Taras", 21)));

		studentDao.removeStudent(0);

		consoleEventLogger.logEvent("Read all Students ---> " + studentDao.readAll());

	}

}