package Strategy;

import Strategy.Move.Walk;
import Strategy.Punch.ChokeSlam;
import Strategy.Signature.Spear;
import Strategy.Signature.Tombstone;

public class Client {
    public static void main(String[] args) {
        Fighter undertaker = new Fighter();
        undertaker.setMove(new Walk());
        undertaker.setPunch(new ChokeSlam());
        undertaker.setSignature(new Tombstone());

        undertaker.punch();
        undertaker.move();
        undertaker.signature();

        Fighter kane = new Fighter();
        kane.setMove(new Walk());
        kane.setPunch(new ChokeSlam());
        kane.setSignature(new Spear());

        kane.punch();
        kane.move();
        kane.signature();

    }
}
