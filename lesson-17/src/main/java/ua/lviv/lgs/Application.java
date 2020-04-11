package ua.lviv.lgs;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UnivercityService service = ctx.getBean(UnivercityService.class);

		Univercity univercity = new Univercity();

		univercity.setName("PNU");
		univercity.setLevel(4);
		univercity.setQtyInstitutes(4);
		univercity.setQtyStudents(5000);
		univercity.setAdress("IF, street Chornovola");
		
		service.saveUnivercity(univercity);
		
		System.out.println(service.findByIdUnivercity((long) 1));
		
		Univercity univercityUpdate = service.findByIdUnivercity((long) 3);
		univercityUpdate.setLevel(10);
		service.updateUnivercity(univercityUpdate);
		
		service.deleteByIdUnivercity((long) 3);
	}

}
