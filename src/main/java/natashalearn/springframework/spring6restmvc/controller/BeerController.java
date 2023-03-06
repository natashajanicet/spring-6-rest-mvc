package natashalearn.springframework.spring6restmvc.controller;

import lombok.AllArgsConstructor;
import natashalearn.springframework.spring6restmvc.services.BeerService;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;
}
