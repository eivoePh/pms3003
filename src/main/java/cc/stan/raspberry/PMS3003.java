package cc.stan.raspberry;

import com.pi4j.io.serial.Serial;
import com.pi4j.io.serial.SerialDataEvent;
import com.pi4j.io.serial.SerialDataListener;
import com.pi4j.io.serial.SerialFactory;

/**
 * PMS3003
 * Created by jhl on 16/3/14.
 */
public class PMS3003 {

    private static int comPort = 9600;
    private static Serial serial = SerialFactory.createInstance();

    public PMS3003() {
    }

    /**
     * 获取Data
     *
     * @return 返回字符串
     * @throws InterruptedException
     */
    public String getData() throws InterruptedException {

        serial.addListener(new SerialDataListener() {
            @Override
            public void dataReceived(SerialDataEvent event) {
                byte bytes[] = event.getData().getBytes();
                if (bytes.length < 24)
                    return;
                System.out.printf(StringHelper.bytesToHex(bytes));
            }
        });
        serial.open(Serial.DEFAULT_COM_PORT, comPort);
        while (true) {
            Thread.sleep(5000);
        }
    }
}
