/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c7e1;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ro.telacad.j4c7e1.config.RootConfig;
import ro.telacad.j4c7e1.config.WebConfig;

/**
 *
 * @author student
 */
public class ProjectAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    
}
