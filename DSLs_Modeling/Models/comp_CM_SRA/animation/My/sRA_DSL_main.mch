MACHINE sRA_DSL_main
INCLUDES sRA_DSL
OPERATIONS
selectThreats(aSRA, aSubThreats) = PRE aSRA:SRA & aSubThreats:Threat & (aSRA,aSubThreats)/:A_subThreats_sRA THEN AddSubThreats(aSRA, aSubThreats) END ;
computeDefenses(aSRA, theCompDefenses) = PRE aSRA:SRA & theCompDefenses:FIN(Defense) & {aSRA}*theCompDefenses/<:A_compDefenses_sRA THEN SetCompDefenses(aSRA, theCompDefenses) END ;
initSRA(aSRA) = PRE aSRA:SRA THEN UnsetSubThreats(aSRA) ; UnsetCompDefenses(aSRA) END 
END