package crazywolf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */

public class App {
    private static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        for (int i = 0; i < 1000 * 10000; i++) {
//            if (log.isDebugEnabled()) {
            log.debug("test memery usage" + i);
//            }
        }
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("bye!");
    }
}