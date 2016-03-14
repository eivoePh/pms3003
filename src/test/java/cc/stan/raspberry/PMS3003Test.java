package cc.stan.raspberry;

import org.junit.Test;

/**
 * PMS3003
 * Created by jhl on 16/3/14.
 */
public class PMS3003Test {

    @Test
    public void getData() throws InterruptedException {
        PMS3003 pms3003 = new PMS3003();
        pms3003.getData();
    }
}
