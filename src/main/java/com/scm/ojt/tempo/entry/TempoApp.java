package com.scm.ojt.tempo.entry;

import act.Act;
import osgl.version.Version;

/**
 * Created by Yoyok_T on 24/08/2018.
 */
public class TempoApp {

    private static final String APP_NAME = "Tempo App";
    private static final String SCAN_PACKAGE = "com.scm.ojt.tempo.service";
    private static final String PACKAGE_NAME = "com.scm.ojt.tempo";
    private static final String ARTIFACT = "tempo";
    private static final String VERSION = "1.0-SNAPSHOT";
    private static final String BUILDNUMBER = "1.0";

    public static void main(String[] args) throws Exception {
        Act.start(
                APP_NAME,
                SCAN_PACKAGE,
                new Version(
                        PACKAGE_NAME,
                        ARTIFACT,
                        VERSION,
                        BUILDNUMBER
                )
        );
    }
}
