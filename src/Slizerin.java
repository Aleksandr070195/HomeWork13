public class Slizerin extends HogwartsStudents{
    private final int cunning;
    private final int determination;
    private final int ambitions;
    private final int resourcefulness;
    private final int lustForPower;

    public Slizerin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambitions, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitions = ambitions;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    private int getInTotalPowerA(){
        return cunning + determination + ambitions + resourcefulness + lustForPower;
    }
    public void inComperToC(Slizerin other){
        if (other.getInTotalPowerA() < this.getInTotalPowerA()) {
            System.out.println("Мощнее " + this.getName());
        } else if (other.getInTotalPowerA() > this.getInTotalPowerA()) {
            System.out.println("Мощнее " + other.getName());
        }
        else {
            System.out.println("студенты равны по мощности");
        }}}
