public class Kogtevram extends HogwartsStudents {
    private final int smart;
    private final int wise;
    private final int witty;
    private final int fullOfCreativity;

    public Kogtevram(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }
    private int getInTotalPowerA(){
        return smart + wise + witty + fullOfCreativity;
    }
    public void inComperToB(Kogtevram other){
        if (other.getInTotalPowerA() < this.getInTotalPowerA()) {
            System.out.println("Мощнее " + this.getName());
        } else if (other.getInTotalPowerA() > this.getInTotalPowerA()) {
            System.out.println("Мощнее " + other.getName());
        }
        else {
            System.out.println("студенты равны по мощности");
        }}}
