package vinePapaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.stream.Collectors;

@Controller
public class BisericaController {

    @Autowired
    public BisericaRepository bisericaRepository;

    @PostMapping("/adauga")
    @ResponseStatus(HttpStatus.OK)
    public void adaugaBiserica(@RequestBody Biserica biserica) {
        System.out.println(biserica.nume);
        bisericaRepository.save(biserica);
    }

    @GetMapping("/toateBisericile")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getAllBiserica() {
        String toate = bisericaRepository.findAll()
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
        return ResponseEntity.ok(toate);
    }
}
