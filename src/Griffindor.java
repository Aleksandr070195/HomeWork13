public class Griffindor extends HogwartsStudents{
   private int nobility;
   private int honor;
    private int bravery;

    public Griffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    private int getInTotalPower(){
        return nobility + honor + bravery;
    }
    public void inComperTo(Griffindor other){
        if (other.getInTotalPower() < this.getInTotalPower()) {
            System.out.println("Мощнее " + this.getName());
        } else if (other.getInTotalPower() > this.getInTotalPower()) {
            System.out.println("Мощнее " + other.getName());
        }
        else {
            System.out.println("студенты равны по мощности");
        }
    }
}
