public class Warrior extends Hero {
    public Warrior() {
        super(300, 150, "CRITICAL DAMAGE");
    }

    @Override
    public void applySuperAbility() {
        System.out.println(" Воин применил суперспособность: " + typeOfSuperAbility);
    }
}
