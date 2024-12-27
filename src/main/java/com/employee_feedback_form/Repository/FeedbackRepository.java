package com.employee_feedback_form.Repository;

import com.employee_feedback_form.Entities.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<FeedbackEntity,Long> {
}
