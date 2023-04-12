MACHINE 
	inter_DSL_Collaboration_CM_SRA_main
INCLUDES
 	cM_DSL_main, sRA_DSL_main

PROMOTES
	selectConfig, validateConfig,  setQoS, 
    	selectThreat, computeDefenses, initSRA

SETS
	
	COMPOSITION_AS;
	SECURECONFIGURATION

DEFINITIONS
    sumDefCost(sc) == SIGMA def . (def : validDefenses[{sc}] | costDef(def))

CONSTANTS
	COMPOSITION_AS1

PROPERTIES
	
	
	COMPOSITION_AS1 : COMPOSITION_AS &
	card({COMPOSITION_AS1}) = 1 &
	COMPOSITION_AS /= {} 

VARIABLES
	
        COMPOSITION,
	SecureConfiguration,
        sra,
	cm,
	validConfig,
	validDefenses,
	secureConfigs,
	isValidSecConf,

	maxQoS,
	relativeCost,

	theSecConf

INVARIANT

	COMPOSITION : FIN(COMPOSITION_AS) &
	SecureConfiguration : FIN(SECURECONFIGURATION) &

	sra : COMPOSITION --> SRA &
	cm : COMPOSITION --> CM &
	validConfig : SecureConfiguration --> Configuration &
	validDefenses : SecureConfiguration <-> Defense &
	secureConfigs : SecureConfiguration +-> COMPOSITION &
	
	isValidSecConf : SecureConfiguration --> BOOL &
	maxQoS : SecureConfiguration --> REAL &
	relativeCost : SecureConfiguration --> REAL &
	
	theSecConf : SECURECONFIGURATION & 
	
	(
	    theSecConf : SecureConfiguration & isValidSecConf(theSecConf) = TRUE  
	       => 
	       sumDefCost(theSecConf) + QoS(validConfig(theSecConf)) <= maxQoS(theSecConf)
	       & sumDefCost(theSecConf) <= relativeCost(theSecConf) * QoS(validConfig(theSecConf)) 
	       & validDefenses[{theSecConf}] /= {}
    	)

INITIALISATION
	
	COMPOSITION := {COMPOSITION_AS1} ||
	SecureConfiguration := {} ||

	sra := {(COMPOSITION_AS1 |-> SRA_AS1)} ||
	cm := {(COMPOSITION_AS1 |-> CM_AS1)} ||
	validConfig := {} ||
	validDefenses := {} ||
	secureConfigs := {} ||
	isValidSecConf := {} ||
	maxQoS := {} ||
	relativeCost := {}  ||

	
	theSecConf :: SECURECONFIGURATION 

OPERATIONS

	createSecureConfig(aConfig, qos, cost) = 
	PRE	
		aConfig : Configuration & isValid(aConfig) = TRUE 
		& qos : REAL & qos : {2.0, 3.0, 4.0}
		& cost : REAL & cost : {0.3, 0.5, 0.6}
	THEN 
	    ANY sc WHERE
	        sc : SECURECONFIGURATION & sc /: SecureConfiguration
	    THEN
	        SecureConfiguration := SecureConfiguration \/ {sc} ||
	        validConfig(sc) := aConfig || 
	        isValidSecConf := isValidSecConf \/ {(sc |-> FALSE)} || 
		    maxQoS(sc) := qos ||
		    relativeCost(sc) := cost ||
	        theSecConf := sc
	    END
	END;


	affectValidDefenses(theDefenses) = 
	PRE	
		theDefenses <: Defense	& theDefenses /= {}
		& theSecConf : SecureConfiguration
		& isValidSecConf(theSecConf) = FALSE
	THEN 
		validDefenses := ({theSecConf} <<| validDefenses) \/ ({theSecConf} * theDefenses)
	END;

	approveSecureConfig = 
	PRE	
	    	theSecConf : SecureConfiguration
	    	& isValidSecConf(theSecConf) = FALSE 
	    	& sumDefCost(theSecConf) + QoS(validConfig(theSecConf)) <= maxQoS(theSecConf) 
	    	& sumDefCost(theSecConf) <= relativeCost(theSecConf) * QoS(validConfig(theSecConf)) 
	    	& validDefenses[{theSecConf}] /= {}
	THEN 
		isValidSecConf(theSecConf) := TRUE
	END

END
