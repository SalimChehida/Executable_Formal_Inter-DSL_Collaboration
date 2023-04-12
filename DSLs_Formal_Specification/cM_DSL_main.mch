MACHINE 
 cM_DSL_main

INCLUDES
 cM_DSL

OPERATIONS
	selectConfig(aCM,aSelectedConf) = 
	PRE	aCM : CM &
		aSelectedConf : Configuration &
		{(aCM |-> aSelectedConf)} /<: selectedConf
		
	THEN 
	           SetSelectedConf(aCM,aSelectedConf)
	END;

	vConfig <-- validateConfig(aConfiguration) = 
	PRE
		aConfiguration : Configuration 
		& aConfiguration : ran(selectedConf)
	THEN 
		SetIsValid(aConfiguration, TRUE) ||
		vConfig := aConfiguration
	END;

	setQoS(aConfiguration,aQoS) = 
	PRE	aConfiguration : Configuration &
		aQoS : REAL &
		aConfiguration : ran(selectedConf)
		
	THEN 
		SetQoS(aConfiguration,aQoS)
	END


END
