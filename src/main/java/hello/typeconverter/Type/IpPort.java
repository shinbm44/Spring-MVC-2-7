package hello.typeconverter.Type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class IpPort {

    private String Ip;
    private int Port;

    public IpPort(String ip, int Port) {
        Ip = ip;
        this.Port = Port;
    }
}
