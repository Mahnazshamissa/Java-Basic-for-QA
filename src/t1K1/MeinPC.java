package t1K1;

public class MeinPC {
    private boolean status;

    public MeinPC() {
    }

    public boolean einschalten() {
        if (this.status) {
            return false;
        } else {
            this.status = true;
            return true;
        }
    }

    public boolean ausschalten() {
        if (!this.status) {
            return false;
        } else {
            this.status = false;
            return true;
        }
    }

    public boolean isStatus() {
        return this.status;
    }
}
