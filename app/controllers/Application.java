package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

@org.springframework.stereotype.Controller
public class Application extends Controller {
    /**
     * 
     */
    public Application() {
        System.out.println("xxxxxxxx");
    }



    public Result index() {
        return ok(index.render("Your new application is ready."));
    }



    public Result sync() {
        System.out.println(this);
        return ok("hello world");
    }

}
