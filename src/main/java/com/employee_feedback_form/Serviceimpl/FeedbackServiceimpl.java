package com.employee_feedback_form.Serviceimpl;

import com.employee_feedback_form.Entities.FeedbackEntity;
import com.employee_feedback_form.Repository.FeedbackRepository;
import com.employee_feedback_form.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceimpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepo;
    @Override
    public FeedbackEntity createFeedback(FeedbackEntity feed) {
        FeedbackEntity savedfeed = feedbackRepo.save(feed);
        return savedfeed;
    }
}
