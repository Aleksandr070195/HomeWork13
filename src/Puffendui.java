public class Puffendui extends HogwartsStudents{
    private final int hadworking;
    private final int loyal;
    private final int hones;

    public Puffendui(String name, int magicPower, int transgressionDistance, int hadworking, int loyal, int hones) {
        super(name, magicPower, transgressionDistance);
        this.hadworking = hadworking;
        this.loyal = loyal;
        this.hones = hones;
    }

    public int getHadworking() {
        return hadworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHones() {
        return hones;
    }

    private int getInTotalPowerA(){
        return hadworking + loyal + hones;
    }
    public void inComperToA(Puffendui other){
        if (other.getInTotalPowerA() < this.getInTotalPowerA()) {
            System.out.println("Мощнее " + this.getName());
        } else if (other.getInTotalPowerA() > this.getInTotalPowerA()) {
            System.out.println("Мощнее " + other.getName());
        }
        else {
            System.out.println("студенты равны по мощности");
        }}}