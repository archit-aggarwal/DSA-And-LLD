package Strategy.Signature;

public class Tombstone implements ISignature {

    @Override
    public void signatureMove() {
        System.out.println("Tombstone Move");
    }
}