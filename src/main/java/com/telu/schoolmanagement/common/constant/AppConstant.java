package com.telu.schoolmanagement.common.constant;

import com.telu.schoolmanagement.common.appconfig.AppConfig;

public class AppConstant {
    // add constants here
    public static int REDIS_TTL_IN_SECOND = Integer.parseInt(AppConfig.dotenv.get("REDIS_TTL_IN_SECOND"));
    public static String REDIS_GETALL_FACULTY = "facultyList::all";
}
