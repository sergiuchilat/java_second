package interfaces.models.nested;

public interface IMouse {
    interface IWired {
        int connectWireless();
    }

    interface IUSB{
        int connectUSB();
    }
}
