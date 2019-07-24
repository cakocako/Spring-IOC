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
        return "A wizard is never late, Frodo Baggins, nor in advance, he arrives precisely at the scheduled time.";
    }

    @Override
    public String changeDress() {
        return outfit.color();
    }
    
}