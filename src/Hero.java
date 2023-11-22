public abstract class Hero implements HavingSuperAbility{
   int health;
   int damage;
   String typeOfSuperAbility;

    public Hero(int health, int damage, String typeOfSuperAbility) {
        this.health = health;
        this.damage = damage;
        this.typeOfSuperAbility = typeOfSuperAbility;
    }
}
