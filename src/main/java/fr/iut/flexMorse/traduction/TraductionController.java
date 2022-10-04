package fr.iut.flexMorse.traduction;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traduction")
@CrossOrigin
public class TraductionController {

//    Endpoints pour de faux pour les tests front
    @GetMapping("/morse/alphabet")
    public TraductionTexte traductionMorseAlphabet() {
        TraductionTexte texteTraduit = new TraductionTexte("olalala cest le morse vers l'alphabet magnifique traduction");
        return texteTraduit;
    }
    @GetMapping("/alphabet/morse")
    public TraductionTexte traductionAlphabetMorse() {
        TraductionTexte texteTraduit = new TraductionTexte("olalala cest l'alphabet vers le morse magnifique traduction");
        return texteTraduit;
    }
}
