public class Archer implements Type {
    
    public void performAttack() {
        AttackStrategy attackStrategy = new ShootArrow();
        attackStrategy.attack();
    }
    
    public void performDefense() {
        DefenseStrategy defenseStrategy = new Shield();
        defenseStrategy.defend();
    }
}