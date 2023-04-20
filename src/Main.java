public class Main {
    public static void main(String[] args) {
        Griffindor garriPotter = new Griffindor("Garri Potter", 25, 21, 15, 9, 7);
        Griffindor hermioneGranger = new Griffindor("Hermione Granger", 21, 19, 14, 8, 5);
        Griffindor ronWeasley = new Griffindor("Ron Weasley", 20, 18, 12, 7, 3);
        garriPotter.inComperTo(ronWeasley);
        hermioneGranger.inComperTo(ronWeasley);
        ronWeasley.inComperTo(garriPotter);

        Puffendui zachariahSmith = new Puffendui("Zachariah Smith", 26, 14, 21, 15, 3);
        Puffendui cedricDiggory = new Puffendui("Cedric Diggory", 27, 15, 22, 13,9);
        Puffendui justinFinchFletchley = new Puffendui("Justin Finch-Fletchley", 25, 13, 14,5, 4);
        zachariahSmith.inComperToA(cedricDiggory);
        cedricDiggory.inComperToA(justinFinchFletchley);
        justinFinchFletchley.inComperToA(zachariahSmith);


        Kogtevram zhouChang = new Kogtevram("Zhou Chang", 24, 19, 18, 15,9, 4);
        Kogtevram padmaPatil = new Kogtevram("Padma Patil", 23, 20,19, 14,8,5);
        Kogtevram marcusBelby = new Kogtevram("Marcus Belby", 25,18,20,13, 10, 6);
        zhouChang.inComperToB(padmaPatil);
        padmaPatil.inComperToB(marcusBelby);
        marcusBelby.inComperToB(zhouChang);

        Slizerin dracoMalfoy = new Slizerin("Draco Malfoy", 24, 20, 14, 13, 9, 8, 3);
        Slizerin grahamMontagu = new Slizerin("Graham Montagu", 23, 18,15, 12, 7, 9, 4);
        Slizerin gregoryGoyle = new Slizerin("Gregory Goyle", 22, 19, 16,11, 8, 7,5);
        dracoMalfoy.inComperToC(grahamMontagu);
        grahamMontagu.inComperToC(gregoryGoyle);
        gregoryGoyle.inComperToC(dracoMalfoy);
        garriPotter.compareTo(dracoMalfoy);
    }

}