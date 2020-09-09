package interfaces.models.nested;

public class Input implements IMouse.IWired, IMouse.IUSB {
    @Override
    public int connectUSB() {
        return 0;
    }

    @Override
    public int connectWireless() {
        return 0;
    }
}
