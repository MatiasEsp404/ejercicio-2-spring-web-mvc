package com.talentCamp.springMvc.web.controllers;

import com.talentCamp.springMvc.business.SpringMvcBusinessConfig;
import com.talentCamp.springMvc.web.SpringMvcWebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringMvcBusinessConfig.class, SpringMvcWebConfig.class})
@WebAppConfiguration
public class InventoryControllerTest {

    @Autowired
    private InventoryController controller;

    @Test
    public void testHandleRequestView() {
        ModelAndView modelAndView = controller.handleRequest();
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        @SuppressWarnings("unchecked")
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }

}