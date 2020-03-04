package org.nrg.xnat.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@XnatPlugin(value = "snet-plugin", name = "SNET SleepDataBasic", description = "The SnetSleepDataBasicPlugin contains data types for SleepResearchSessionData, psgScanData, psgEDFData and psgRecordData")
public class SnetSleepDataBasicPlugin {
}