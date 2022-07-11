package controllers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import controllers.dto.DemoDto;
import controllers.dto.DemoDtoResponse;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.DemoService;

import java.util.concurrent.CompletableFuture;

@Singleton
public class DemoController extends Controller {

    private final DemoService demoService;
    private final FormFactory formFactory;

    @Inject
    public DemoController(DemoService demoService, FormFactory formFactory) {
        this.demoService = demoService;
        this.formFactory = formFactory;
    }

    public CompletableFuture<Result> getDemoData(Http.Request request){

        Form<DemoDto> demoDtoForm = formFactory.form(DemoDto.class).bindFromRequest(request);

        DemoDto dto = demoDtoForm.get();

        DemoDtoResponse demoDtoResponse = demoService.displayName(dto);

        return CompletableFuture.completedFuture(ok(Json.toJson(demoDtoResponse)));
    }

}
