package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Gandalf implements WizardInterface{

    private OutfitInterface outfit;

    public Gandalf(OutfitInterface theOutfit) {
        outfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        return "Un magicien n'est jamais en retard, Frodon Sacquet, ni en avance d'ailleurs, il arrive précisément à l'heure prévue.";
    }

    @Override
    public String changeDress() {
        return outfit.color();
    }
    
}