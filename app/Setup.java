import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import play.Application;
import play.GlobalSettings;

/*****************************************************************************
 * 金徽防窜货系统
 *****************************************************************************
 * Setup.java
 *----------------------------------------------------------------------------
 * (C) 沈阳八维时空科技发展
 *     SHENYANG EIGHTSPACE TECHNOLOGY DEVELOPMENT CO.,LTD.  2014
 *----------------------------------------------------------------------------
 * Version    Date       By            Comment
 * 1.0        2014年6月25日    Frank       新建
 *****************************************************************************/

/**
 * FIXME 此处填写类的描述信息
 * 
 * @author Frank
 * @date 2014年6月25日
 * @since 1.0
 */
public class Setup extends GlobalSettings {
    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");;



    /*
     * (non-Javadoc)
     * 
     * @see play.GlobalSettings#onStart(play.Application)
     */
    @Override
    public void onStart(Application arg0) {

    }



    /*
     * (non-Javadoc)
     * 
     * @see play.GlobalSettings#getControllerInstance(java.lang.Class)
     */
    @Override
    public <A> A getControllerInstance(Class<A> clazz) throws Exception {
        return ctx.getBean(clazz);
    }
}
