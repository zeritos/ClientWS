package rest; 
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import org.springframework.boot.CommandLineRunner; 
import org.springframework.boot.SpringApplication; 
import org.springframework.web.client.RestTemplate; 

public class App implements CommandLineRunner { 
	
	private static final Logger log = LoggerFactory.getLogger(App.class); 
	
	public static void main(String args[])	{ 
		SpringApplication.run(App.class); 
	} 
	
	public void run(String... args) throws Exception { 
		RestTemplate restTemplate = new RestTemplate(); 
		Response response = restTemplate.getForObject( "http://services.groupkt.com/country/get/iso2code/IN", Response.class); 
		log.info("==== RESTful API Response using Spring RESTTemplate START ======="); 
		log.info(response.toString()); 
		log.info("==== RESTful API Response using Spring RESTTemplate END ======="); 
	} 
}