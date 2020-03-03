import java.util.Arrays;    
import java.util.Scanner;

/**
 * Main
 */
public class Game {

    public static void main(String[] args) {
        World world = new World(20, 10);
        Character player = new Character("Tauri", CharacterType.PLAYER, "X");
        Character enemy = new Character(5, 5, "Sipsik", CharacterType.MONSTER, "o");
        Character npc = new Character(3, 3, "Helper", CharacterType.NPC, "N");
        //Item[] itemList = new Item[5];
        //ItemList[0] = new Item("Saabas", ItemType.WEAPON, 1,5)


        world.addCharacters(Arrays.asList(
            enemy,
            npc, 
            player
            ));

        Scanner scanner = new Scanner(System.in);

        String input = "";

        world.render();
        while(!input.equals("end")){
            input = scanner.nextLine();

            if (input.equals("")){
                player.move();
            } else if (input.equals("u")){
                player.changeDirection(Direction.UP);
            } else if (input.equals("d")){
                player.changeDirection(Direction.DOWN);
            } else if (input.equals("l")){
                player.changeDirection(Direction.LEFT);
            } else if (input.equals("r")){
                player.changeDirection(Direction.RIGHT);
            }

            if (player.x == npc.x && player.y == npc.y){
                enemy.isVisible = enemy. isVisible == true ? false : true;
            }

            world.render();
        }

    }
}