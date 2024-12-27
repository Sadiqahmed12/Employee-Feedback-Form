package com.employee_feedback_form.Service;

import com.employee_feedback_form.Entities.FeedbackEntity;
import org.springframework.stereotype.Service;

@Service
public interface FeedbackService {
    public FeedbackEntity createFeedback(FeedbackEntity feed);
}
