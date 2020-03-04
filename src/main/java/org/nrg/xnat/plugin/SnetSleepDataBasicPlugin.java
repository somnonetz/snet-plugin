package org.nrg.xnat.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "snet-plugin", name = "SNET SleepDataBasic", description = "The SnetSleepDataBasicPlugin contains data types for SleepResearchSessionData, psgScanData, psgEDFData and psgRecordData",
        dataModels = {@XnatDataModel(value = "snet01:SleepResearchSession",
                                       singular = "Sleep Research Session",
                                       plural = "Sleep Research Session",
                                       code = "SRS"),
                      @XnatDataModel(value = "snet01:psgScanData",
                                       singular = "PSG Recording",
                                       plural = "PSG Recordings",
                                       code = "PSG"),
                      @XnatDataModel(value = "snet01:psgEDFData",
                                       singular = "EDF Recording",
                                       plural = "EDF Recordings",
                                       code = "EDF"),
                      @XnatDataModel(value = "snet01:psgRecordData",
                                       singular = "EDF Channel",
                                       plural = "EDF Channels",
                                       code = "CHA")})
public class SnetSleepDataBasicPlugin {
}