package controllers;

import com.google.common.collect.Lists;
import model.TodoTask;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class TodosAjaxController extends Controller {

    @BodyParser.Of(BodyParser.Json.class)
    public static Result getTodos() {
        return ok(Json.toJson(getFakeTodos()));
    }

    private static List<TodoTask> getFakeTodos() {
        TodoTask t1 = new TodoTask().withTitle("Todo 1").withDescription("This is a todo !");
        TodoTask t2 = new TodoTask().withTitle("Todo 2").withDescription("Another todo ...");
        return Lists.newArrayList(t1, t2);
    }

}
