MACHINE 
sRA_DSL_main

INCLUDES
sRA_DSL

OPERATIONS
	selectThreat(aSubThreats, aSRA) = 
	PRE	
		aSubThreats : Threat & aSRA : SRA 	& (aSRA |-> aSubThreats) /: subThreats
	THEN
		AddSubThreats(aSRA,aSubThreats) 
	END;

	de <-- computeDefenses = 
	ANY theCompDefenses,aSRA WHERE
		aSRA : SRA & theCompDefenses : FIN(Defense) & ({aSRA} * theCompDefenses ) /<: compDefenses
	THEN 
		SetCompDefenses(aSRA,theCompDefenses) ||
		de := theCompDefenses
	END;

	th <-- initSRA = 
	ANY	aSRA WHERE
		aSRA : SRA
		
	THEN 
		UnsetSubThreats(aSRA) ;
		UnsetCompDefenses(aSRA) ;
		th :: POW(dom(threats))
	END
END
