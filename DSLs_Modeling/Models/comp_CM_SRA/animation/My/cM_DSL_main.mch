MACHINE cM_DSL_main
INCLUDES cM_DSL
OPERATIONS
selectConfig(aCM, aSelectConf) = PRE aCM:CM & aSelectConf:Configuration & {(aCM,aSelectConf)}/<:A_selectConf_cM & (A_selectConf_cM~)[{aSelectConf}]={} THEN SetSelectConf(aCM, aSelectConf) END ;
validateConfig(aConfiguration) = PRE aConfiguration:Configuration THEN SetIsValid(aConfiguration, TRUE) END ;
invalidateConfig(aConfiguration) = PRE aConfiguration:Configuration THEN SetIsValid(aConfiguration, FALSE) END ;
setQoS(aConfiguration, aQoS) = PRE aConfiguration:Configuration & aQoS:REAL THEN SetQoS(aConfiguration, aQoS) END 
END