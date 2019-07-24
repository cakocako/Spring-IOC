package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theWizard")
public class Dumbeldore implements WizardInterface{

    private OutfitInterface outfit;

    @Autowired
    public Dumbeldore(OutfitInterface theOutfit) {
        outfit = theOutfit;
    }


    @Override
    public String giveAdvice() {
        return "Fortunately it's dark. I've never blushed so much since Madam Pomfrey told me she found my new lovely earmuffs";
    }

    @Override
    public String changeDress() {
        return outfit.color();
    }

}