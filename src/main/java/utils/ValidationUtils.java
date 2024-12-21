package utils;

import jakarta.validation.ConstraintViolation;
import java.util.Set;

public class ValidationUtils {
    public static StringBuilder formatValidationErrors(Set<ConstraintViolation<?>> constraintViolations) {
        StringBuilder violations = new StringBuilder("Erros de validação:\n");
        for(ConstraintViolation<?> violation: constraintViolations) {
            violations.append("- ").append(violation.getMessage()).append("\n");
        }
        
        return violations;
    }
}
