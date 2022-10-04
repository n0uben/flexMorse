package fr.iut.flexMorse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traduction")
@CrossOrigin
public class TraductionController {

//    Endpoints pour de faux pour les tests front
    @GetMapping("/morse/alphabet")
    public String traductionMorseAlphabet() {
        return "olalala cest le morse vers l'alphabet magnifique traduction";
    }
    @GetMapping("/alphabet/morse")
    public String traductionAlphabetMorse() {
        return "olalala cest l'alphabet vers le morse magnifique traduction";
    }
}
