package Prototype;

public class Client {
    public static void main(String[] args) throws Exception {
        NPC firstNPC = new NPC("100.0", "75.0", "Male");

        System.out.println(firstNPC);

        NPC secondNPC = (NPC) (firstNPC.clone());
        System.out.println(secondNPC);

        NPC thirdNpc = (NPC) (firstNPC.clone());
        System.out.println(thirdNpc);

        // Address Comparison: False
        System.out.println(firstNPC == secondNPC);
        System.out.println(thirdNpc == secondNPC);
    }
}

