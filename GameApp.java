public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());
        
        knight.attack();
        knight.defend();
        System.out.println();
        
        wizard.attack();
        wizard.defend();
        System.out.println();
        
        archer.attack();
        archer.defend();
        System.out.println();
    }
}
