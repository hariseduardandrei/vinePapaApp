package vinePapaApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BisericaController {

    List<Biserica> biserici = ArhivaDeBiserici.getBiserici();

    @GetMapping("/text/{month}")
    public String getTextForAlexa(@PathVariable("month") String month) {

        List<Biserica> bisericiForMonth = new ArrayList<>();

        for (Biserica biserica : biserici) {
            if (biserica.lunaDeVizita.equals(month)) {
                bisericiForMonth.add(biserica);
            }
        }

        String text;

        if (bisericiForMonth.isEmpty()) {
            text = "There are no churches for mr Pope on " + month;
        } else {
            text = "In " + month + " the pope is going to visit ";
        }

        for (Biserica biserica : bisericiForMonth) {
            text = text + biserica.nume + " " + biserica.tipReligie + " church, ";
        }

        text += "\n";
        return text;
    }

    @GetMapping("/biserici/{month}")
    public List<Biserica> getBisericiForMonth(@PathVariable String month) {

        List<Biserica> bisericiForMonth = new ArrayList<>();

        for (Biserica biserica : biserici) {
            if (biserica.lunaDeVizita.equals(month)) {
                bisericiForMonth.add(biserica);
            }
        }

        return bisericiForMonth;
    }
}
