package fr.iut.flexMorse.traduction;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traduction")
@CrossOrigin
public class TraductionController {

    private TraductionService traductionService;

    public TraductionController() {
        this.traductionService = new TraductionService();
    }

//    Endpoints pour de faux pour les tests front
    @PostMapping("/morse/alphabet")
    public TraductionTexte traductionMorseAlphabet(final @RequestBody String texteATraduire) {
        String texteTraduit = this.traductionService.morseVersAlphabet(texteATraduire);
        return new TraductionTexte(texteTraduit);
    }
    @PostMapping("/alphabet/morse")
    public TraductionTexte traductionAlphabetMorse(final @RequestBody String texteATraduire) {
        String texteTraduit = this.traductionService.alphabetVersMorse(texteATraduire);
        return new TraductionTexte(texteTraduit);
    }
}
