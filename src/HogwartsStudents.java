public abstract class HogwartsStudents {
    private final String name;
    private final int magicPower;
    private  final int transgressionDistance;

    public HogwartsStudents(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    private int getTotalPower(){
        return magicPower + transgressionDistance;
    }
    public void compareTo(HogwartsStudents other){
        if (other.getTotalPower() < this.getTotalPower()) {
            System.out.println("Мощнее " + this.getName());
        } else if (other.getTotalPower() > this.getTotalPower()) {
            System.out.println("Мощнее " + other.getName());
        }
        else {
            System.out.println("студенты равны по мощности");
        }

    }

}
