package com.scm.ojt.tempo.service;

import act.controller.Controller;
import org.osgl.http.H;
import org.osgl.logging.LogManager;
import org.osgl.logging.Logger;
import org.osgl.mvc.annotation.ResponseContentType;

/**
 * Created by Yoyok_T on 24/08/2018.
 */
@ResponseContentType(H.MediaType.JSON)
@Controller("/timesheet")
public class TimesheetService extends BaseService {
    private static Logger logger = LogManager.get(EmployeeService.class);
}
