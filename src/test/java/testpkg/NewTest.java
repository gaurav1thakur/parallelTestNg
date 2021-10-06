package testpkg;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
    private static final Logger log = LogManager.getLogger();

    @BeforeMethod
    public void setThreadName(Method method){
        ThreadContext.put("threadName", method.getName());
    }

    @Test
    public void test1() {
        log.info("This is the first test!");
        log.warn("Something may be wrong, better take a look.");
    }

    @Test
    public void test2() {
        log.info("Here's the second test!");
        log.error("There's a problem, better fix it");
    }
}