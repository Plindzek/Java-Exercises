/**
 * 
 */
package Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Adam
 *
 */
public class TestSLF4J {

    /**
     * @param a
     */
    public static void main(String[] args) {

	Logger logger = LoggerFactory.getLogger(TestSLF4J.class);
	logger.info("Wiadomość testowa");
	logger.info(logger.getClass().getName());
    }

}
