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
        return "Heureusement qu’il fait nuit. Je n’ai jamais autant rougi depuis le jour où Madame Pomfresh m’a dit qu’elle trouvait mes nouveaux cache-oreilles ravissants";
    }

    @Override
    public String changeDress() {
        return outfit.color();
    }

}