package fr.iut.flexMorse.traduction;

import fr.iut.flexMorse.model.TraductionTexte;
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
    public TraductionTexte traductionMorseAlphabet(final @RequestBody TraductionTexte texteATraduire) {
        String texteTraduit = this.traductionService.morseVersAlphabet(texteATraduire.getTexte());
        return new TraductionTexte(texteTraduit);
    }
    @PostMapping("/alphabet/morse")
    public TraductionTexte traductionAlphabetMorse(final @RequestBody TraductionTexte texteATraduire) {
        String texteTraduit = this.traductionService.alphabetVersMorse(texteATraduire.getTexte());
        return new TraductionTexte(texteTraduit);
    }
}
