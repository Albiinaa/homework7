public class Medic extends Hero {
    private int healPoints;

    public Medic() {
        super(250, 100,"HEALING");
        this.healPoints=60;
    }



    public void increaseExperience(){
      healPoints += healPoints * 0.1;
    }
    @Override
    public void applySuperAbility() {
        System.out.println(" Медик применил суперспособность: "
                + typeOfSuperAbility);
    }
    public int getHealPoints() {
        return healPoints;
    }
}
