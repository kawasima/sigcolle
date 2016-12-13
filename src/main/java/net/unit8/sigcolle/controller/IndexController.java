package net.unit8.sigcolle.controller;

import enkan.data.HttpResponse;
import kotowari.component.TemplateEngine;

import javax.inject.Inject;

public class IndexController {
    @Inject
    TemplateEngine templateEngine;

    public HttpResponse index() {
        return templateEngine.render("index");
    }
}
