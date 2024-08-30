package eni.demoCDCI;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
    public Map<String, String> getInfo() {
        Map<String, String> response = new HashMap<>();
        response.put("name", "DatDo");
        response.put("email", "datdo@campus-eni.fr");
        response.put("Date", LocalDate.now().toString());
        return response;
    }
}
