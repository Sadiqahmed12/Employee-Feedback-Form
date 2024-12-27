package com.employee_feedback_form.Controller;

import com.employee_feedback_form.Entities.FeedbackEntity;
import com.employee_feedback_form.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpFeedbackController {

    @Autowired
    private FeedbackService feedbackService;


    @RequestMapping("/feedback")
    public String feedBack(){
        return "index";
    }

    @RequestMapping("/createfeed")
    public String createFeedback(@ModelAttribute FeedbackEntity feed){
         feedbackService.createFeedback(feed);
         return "saved";

    }
}
