package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface{

    private Outfit myOutfit;

    public Gandalf(Outfit theOutfit) {
        myOutfit = theOutfit;
    }

    @Override
    public String giveAdvice() {
        return "Un magicien n'est jamais en retard, Frodon Sacquet, ni en avance d'ailleurs, il arrive précisément à l'heure prévue.";
    }

    @Override
    public String changeDress() {
        return this.myOutfit.changeDress();
    }
    
}