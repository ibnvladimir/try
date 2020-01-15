package su.ibn.homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import su.ibn.homeWork.domain.Country;
import su.ibn.homeWork.repositories.CountryRepo;

import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private CountryRepo countryRepo;


    @GetMapping("/")
    public String main (Map<String, Object> model) {
        Iterable<Country> countries = countryRepo.findAll();
        model.put("countries", countries);
        return "main";
    }

    @PostMapping("/")
    public String add (@RequestParam String name, Map<String, Object> model) {
        if (name != null && !name.isEmpty()) {
            Country country = new Country(name);
            countryRepo.save(country);
        }

        Iterable<Country> countries = countryRepo.findAll();
        model.put("countries", countries);

        return "main";
    }

}
