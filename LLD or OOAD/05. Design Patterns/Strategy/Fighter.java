package Strategy;

import Strategy.Move.IMove;
import Strategy.Punch.IPunch;
import Strategy.Signature.ISignature;

public class Fighter {
    private IMove move;
    private IPunch punch;
    private ISignature signature;

    public IMove getMove() {
        return move;
    }

    public void setMove(IMove move) {
        this.move = move;
    }

    public IPunch getPunch() {
        return punch;
    }

    public void setPunch(IPunch punch) {
        this.punch = punch;
    }

    public ISignature getSignature() {
        return signature;
    }

    public void setSignature(ISignature signature) {
        this.signature = signature;
    }

    public void move() {
        move.move();
    }

    public void punch() {
        punch.punch();
    }

    public void signature() {
        signature.signatureMove();
    }
}
