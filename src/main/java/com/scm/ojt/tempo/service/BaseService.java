package com.scm.ojt.tempo.service;

import act.Act;
import org.osgl.mvc.annotation.Catch;

/**
 * Created by Yoyok_T on 24/08/2018.
 */
public class BaseService {
    @Catch(value = IllegalStateException.class, priority = 1)
    public void logIllegalState(Throwable throwable) {
        Act.LOGGER.info("EXCEPTION %s", throwable);
    }
}
