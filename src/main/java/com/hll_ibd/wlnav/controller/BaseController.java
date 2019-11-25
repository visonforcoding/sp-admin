package com.hll_ibd.wlnav.controller;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

class BaseController {

    public String render(String template, Map<String, Object> context) {

        PebbleEngine engine = new PebbleEngine.Builder().build();
        PebbleTemplate compiledTemplate = engine.getTemplate("templates/" + template);
        Writer writer = new StringWriter();

        try {
            compiledTemplate.evaluate(writer, context);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String output = writer.toString();
        return output;

    }

}