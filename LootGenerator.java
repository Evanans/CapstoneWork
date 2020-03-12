import java.util.Random;
import java.util.Scanner;
class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static Random rand = new Random();
  public static int roll  =  rand.nextInt(5);
  public static int item  = 0;
  public static String[][] entryTable = new String[6][5];
  public static String[][] magicTable  = new String[4][6];

  public static void main(String[] args) {
    parseRoll();
      System.out.println(roll);
        entryTable[0][0] = "Nothing";
        entryTable[0][1] = "5 Gold";
        entryTable[0][2] = "10 Gold";
        entryTable[0][3] = "15 Gold";
        entryTable[0][4] = "20 Gold";
        entryTable[1][0] = "Nothing";
        entryTable[1][1] = "10 Gold";
        entryTable[1][2] = "30 Gold Worth of Paintings";
        entryTable[1][3] = "50 Gold in Gems";
        entryTable[1][4] = "70 Silver Pieces";
        entryTable[2][0] = "10 Gold";
        entryTable[2][1] = "50 Gold in Gems";
        entryTable[2][2] = "75 Gold in Gems";
        entryTable[2][3] = "Common Magic item";
        entryTable[2][4] = "Common Magic item";
        entryTable[3][0] = "30 Gold in Paintings";
        entryTable[3][1] = "100 Gold in Rare Texts";
        entryTable[3][2] = "Common Magic Item";
        entryTable[3][3] = "Common Magic Item";
        entryTable[3][4] = "Uncommon Magic Item";
        entryTable[4][0] = "40 Gold pieces";
        entryTable[4][1] = "60 Gold pieces";
        entryTable[4][2] = "Common Magic item";
        entryTable[4][3] = "Uncommon Magic item";
        entryTable[4][4] = "Rare Magic item";
        entryTable[5][0] = "50 Gold in Paintings";
        entryTable[5][1] = "120 Gold in Gems";
        entryTable[5][2] = "Uncommon Magic Item";
        entryTable[5][3] = "Rare Magic item";
        entryTable[5][4] = "Very Rare Magic Item";
        magicTable[0][0] = "Potion of Hill giant Strength";
        magicTable[0][1] = "Lesser Health Potion";
        magicTable[0][2] = "+1 weapon of Dm Choice";
        magicTable[0][3] = "Armor of Gleaming";
        magicTable[0][4] = "1st level spell Scroll";
        magicTable[0][5] = "Staff of Flowers";
        magicTable[1][0] = "Staff of the Adder";
        magicTable[1][1] = "Wand of Missles";
        magicTable[1][2] = "Bag of Holding";
        magicTable[1][3] = "Mithral Armor";
        magicTable[1][4] = "+1 Shield";
        magicTable[1][5] = "+1 Ammunition";
        magicTable[2][0] = "Wand of Fireballs or LightningBolts";
        magicTable[2][1] = "+1 Armor";
        magicTable[2][2] = "Dragon slayer or Giant Slayer";
        magicTable[2][3] = "Dimensional Shackles";
        magicTable[2][4] = "Robe of Eyes";
        magicTable[2][5] = "Sun Blade";
        magicTable[3][0] = "Dancing Sword";
        magicTable[3][1] = "+3 Weapon";
        magicTable[3][2] = "Belt of Fire Frost or Stone giant Strength";
        magicTable[3][3] = "Attribute Tome";
        magicTable[3][4] = "Attribute Manual";
      
        System.out.println(entryTable[parseScan(scan())][item]);
  }
  public static void parseRoll(){
    switch(roll){
      case 0:
      System.out.println("roll was 0");
      item = 0;
      break;
      case 1:
      System.out.println("roll was 1");
      item = 0;
      break;
      case 2:
      System.out.println("roll was 2");
      item = 1;
      break;
      case 3:
      System.out.println("roll was 3");
      item = 2;
      break;
      case 4:
      System.out.println("roll was 4");
      item = 3;
      break;
      case 5:
      System.out.println("roll was 5");
      item = 4;
      break;
    }

  }
  public static int scan(){
    System.out.println("enter your challenge rating");
    while(scanner.hasNextInt()){
    int input = scanner.nextInt();
    return input;
    }
    scanner.close();
    return 0;
  }
  public static int parseScan(int a){
    if(a <= 2){
      System.out.println("your loot table is table 0");
      return 0;
    } else if( a > 2 & a <= 6){
      System.out.println("your loot table is table 1");
      return 1;
    } else if( a > 6 & a <= 10){
      System.out.println("your loot table is table 2");
      return 2;
    } else if ( a > 10 & a <=14){
      System.out.println("your loot table is table 3");
      return 3;
    } else if (a > 14 & a <= 18){
      System.out.println("your loot table is table 4");
      return 4;
    } else if( a > 18){
      System.out.println("your loot table is table 5");
      return 5;
    }
    else{
      System.out.println("invalid input recieved default loot table sent");
      return 0;
    }
    }
    /*public static String returnInput(){
      int scanReturn = parseScan(scan());
      if((scanReturn == 0) || (scanReturn == 1)){
      return entryTable[parseScan(scan())][item];
      }else{
         return entryTable[parseScan(scan())][item];
      }
    }*/
  }
  