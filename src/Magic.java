public class Magic extends Hero {

    public Magic() {
        super(200, 80, "BOOST");
    }

    @Override
    public void applySuperAbility() {
        System.out.println(" Маг применил суперспособность: " + typeOfSuperAbility );
    }
}
