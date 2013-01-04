package com.github.jknack.handlebars;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URI;

import org.junit.Test;

import com.github.jknack.handlebars.io.ClassTemplateLoader;

public class Issue95 {

  @Test
  public void issue95() throws IOException {
    TemplateLoader loader = new ClassTemplateLoader("/issue95");

    Handlebars handlebars = new Handlebars(loader);
    handlebars.setAllowInifiteLoops(true);
    Template template = handlebars.compile(URI.create("hbs/start"));
    assertNotNull(template);
  }
}