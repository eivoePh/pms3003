package cc.stan.raspberry;

/**
 * String帮助类.
 * Created by jhl on 16/3/14.
 */
public class StringHelper {
    /**
     * 将byte转化为Hex显示
     *
     * @param bytes
     * @return Hex显示
     */
    public static String bytesToHex(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bytes) {
            stringBuffer.append(Integer.toHexString(b)).append(" ");
        }
        return stringBuffer.toString();
    }
}
