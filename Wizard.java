public class Wizard implements Type {

    public void performAttack() {
        AttackStrategy attackStrategy = new CastSpell();
        attackStrategy.attack();
    }
    
    public void performDefense() {
        DefenseStrategy defenseStrategy = new CreateMagic();
        defenseStrategy.defend();
    }
}