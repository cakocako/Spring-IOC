package fr.wildcodeschool.thewizardproject.models;

public class Dumbeldore implements WizardInterface{

    private Outfit myOutfit;

    public Dumbeldore(Outfit theOutfit) {
        myOutfit = theOutfit;
    }


    @Override
    public String giveAdvice() {
        return "Heureusement qu’il fait nuit. Je n’ai jamais autant rougi depuis le jour où Madame Pomfresh m’a dit qu’elle trouvait mes nouveaux cache-oreilles ravissants";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.changeDress();
    }

}