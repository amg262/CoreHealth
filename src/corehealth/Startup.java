
package corehealth;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class Startup {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        final ImageIcon icon = new ImageIcon("icons/mrt.jpg");
        
        
        final String WINDOW_CONFIG_XML = "spring/mainConfig.xml";
        final String SWIPE_BEAN = "swipeWindow";
        final String COURSE_BEAN = "courseWindow";
        final AbstractApplicationContext context = 
                        new ClassPathXmlApplicationContext(new String[] {WINDOW_CONFIG_XML});
        
        boolean runSwipe = true;
        
        if (runSwipe == true) {
            try {
                SwipeWindow swipeWin = (SwipeWindow)context.getBean(SWIPE_BEAN);
                swipeWin.setVisible(true);
                swipeWin.setIconImage(icon.getImage());
                
            } catch (Exception e){
                throw e;
            }
            
        } else {
            try {
                CourseWindow courseWin = (CourseWindow)context.getBean(COURSE_BEAN);
                courseWin.setVisible(true);
                courseWin.setIconImage(icon.getImage());
            } catch (Exception e){
                throw e;
            }
        }
    }
}
