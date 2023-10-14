package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models.Address;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models.Candidate;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.repositories.AddressRepository;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.repositories.CandidateRepository;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class WwwLab5Week0620014641VoNguyenThanhTuApplication {

	public static void main(String[] args) {
		SpringApplication.run(WwwLab5Week0620014641VoNguyenThanhTuApplication.class, args);
	}

	@Autowired
	private CandidateRepository candidateRepository;

	@Autowired
	private AddressRepository addressRepository;

//	@Bean
	CommandLineRunner initData(){
		return args -> {
			Random rnd =new Random();
			for (int i = 1; i < 1000; i++) {
				Address add = new Address(rnd.nextInt(1,1000)+"","Quang Trung","HCM",
						rnd.nextInt(70000,80000)+"", CountryCode.VN );
				addressRepository.save(add);
				Candidate can=new Candidate("Name #"+i,
						LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),
						add,
						rnd.nextLong(1111111111L,9999999999L)+"",
						"email_"+i+"@gmail.com");
				candidateRepository.save(can);
				System.out.println("Added: " +can);
			}
		};
	}


}
