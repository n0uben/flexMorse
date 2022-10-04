package fr.iut.flexMorse.traduction;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traduction")
@CrossOrigin
public class TraductionController {

//    Endpoints pour de faux pour les tests front
    @PostMapping("/morse/alphabet")
    public TraductionTexte traductionMorseAlphabet(final @RequestBody TraductionTexte texteATraduire) {
        TraductionTexte traductionTexte = new TraductionTexte("OSKOUR");
        return traductionTexte;
    }
    @PostMapping("/alphabet/morse")
    public TraductionTexte traductionAlphabetMorse(final @RequestBody TraductionTexte texteATraduire) {
        TraductionTexte traductionTexte = new TraductionTexte("... --- ...");
        return traductionTexte;
    }
}
