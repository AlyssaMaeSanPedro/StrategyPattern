public class Knight implements Type {
 
    public void performAttack() {
        AttackStrategy attackStrategy = new SwingSword();
        attackStrategy.attack();
    }
    
    public void performDefense() {
        DefenseStrategy[] defenseStrategies = {new Shield(), new Dodge(), new CreateMagic()};
        for (DefenseStrategy defenseStrategy : defenseStrategies) {
            defenseStrategy.defend();
        }
    }
}