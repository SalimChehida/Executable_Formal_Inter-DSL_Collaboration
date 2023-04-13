MACHINE inter_DSL_Collaboration_CM_SRA_main
INCLUDES cM_DSL_main, sRA_DSL_main
PROMOTES selectConfig, validateConfig, invalidateConfig, setQoS, selectThreats, computeDefenses, initSRA
SETS COMPOSITION_AS; SECURECONFIGURATION
VARIABLES COMPOSITION, SecureConfiguration, A_sra_cOMPOSITION, A_cm_cOMPOSITION, A_validConfig_secureConfiguration, A_validDefenses_secureConfiguration, A_secureconfiguration_cOMPOSITION
INVARIANT COMPOSITION:FIN(COMPOSITION_AS) & SecureConfiguration:FIN(SECURECONFIGURATION) & A_sra_cOMPOSITION:COMPOSITION+->SRA & A_cm_cOMPOSITION:COMPOSITION+->CM & A_validConfig_secureConfiguration:SecureConfiguration-->Configuration & A_validDefenses_secureConfiguration:SecureConfiguration<->Defense & A_secureconfiguration_cOMPOSITION:SecureConfiguration+->COMPOSITION
INITIALISATION COMPOSITION := {COMPOSITION_AS1} || SecureConfiguration := {} || A_sra_cOMPOSITION := {} || A_cm_cOMPOSITION := {} || A_validConfig_secureConfiguration := {} || A_validDefenses_secureConfiguration := {} || A_secureconfiguration_cOMPOSITION := {}
OPERATIONS
createSecureConfig(aSecureConfiguration) = PRE aSecureConfiguration:SecureConfiguration THEN skip END ;
affectValidConfig(aSecureConfiguration) = PRE aSecureConfiguration:SecureConfiguration THEN skip END ;
affectValidDefenses(aSecureConfiguration) = PRE aSecureConfiguration:SecureConfiguration THEN skip END ;
approveSecureConfig(aSecureConfiguration) = PRE aSecureConfiguration:SecureConfiguration THEN skip END ;
disproveSecureConfig(aSecureConfiguration) = PRE aSecureConfiguration:SecureConfiguration THEN skip END ;
checkSecureConfig(aSecureConfiguration) = PRE aSecureConfiguration:SecureConfiguration THEN skip END 
CONSTANTS COMPOSITION_AS1
PROPERTIES
COMPOSITION_AS1:COMPOSITION_AS & card({COMPOSITION_AS1})=1 & card(COMPOSITION_AS)>=1 & card({COMPOSITION_AS1})=1 & COMPOSITION_AS/={}
END