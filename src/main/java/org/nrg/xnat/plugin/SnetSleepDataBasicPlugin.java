package org.nrg.xnat.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "snet-plugin", name = "SNET SleepDataBasic", description = "Contains data types for SleepResearchSessionData and psgScanData",
        dataModels = {@XnatDataModel(value = "snet01:SleepResearchSession",
                                     singular = "Sleep Research Session",
                                     plural = "Sleep Research Sessions",
                                     code = "SRS"),
                      @XnatDataModel(value = "snet01:psgScanData",
                                     singular = "PSG Recording",
                                     plural = "PSG Recordings",
                                     code = "PSG")})
public class SnetSleepDataBasicPlugin {
}