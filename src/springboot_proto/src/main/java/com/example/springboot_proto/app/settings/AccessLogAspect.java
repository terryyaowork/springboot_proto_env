package com.example.springboot_proto.app.settings;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;

@Aspect
@Component
public class AccessLogAspect {

        private static final Logger logger = LoggerFactory.getLogger(AccessLogAspect.class);

        @Pointcut("execution(* com.example.springboot_proto.controller..*(..))")
        public void controllerMethods() {
                // Pointcut to match all controller methods
        }

        @Before("controllerMethods()")
        public void logBeforeControllerMethod() {
                HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                                .currentRequestAttributes()).getRequest();
                logger.info("Incoming request: {} {} from IP: {}", request.getMethod(), request.getRequestURI(),
                                request.getRemoteAddr());
        }
}
