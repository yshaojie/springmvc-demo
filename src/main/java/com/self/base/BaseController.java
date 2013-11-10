package  com.self.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller 抽象类，所有Controller都必须继承该类
 * User: guodan
 * Date: 10/15/13
 * Time: 11:53 AM
 */
public abstract class BaseController { 
    protected final Logger logger = LoggerFactory.getLogger(getClass());

}
