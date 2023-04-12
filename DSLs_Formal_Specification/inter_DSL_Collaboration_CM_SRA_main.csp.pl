:- dynamic parserVersionNum/1, parserVersionStr/1, parseResult/5.
:- dynamic module/4.
'parserVersionStr'('0.6.2.1').
'parseResult'('ok','',0,0,0).
:- dynamic channel/2, bindval/3, agent/3.
:- dynamic agent_curry/3, symbol/4.
:- dynamic dataTypeDef/2, subTypeDef/2, nameType/2.
:- dynamic cspTransparent/1.
:- dynamic cspPrint/1.
:- dynamic pragma/1.
:- dynamic comment/2.
:- dynamic assertBool/1, assertRef/5, assertTauPrio/6.
:- dynamic assertModelCheckExt/4, assertModelCheck/3.
:- dynamic assertLtl/4, assertCtl/4.
'parserVersionNum'([0,11,1,1]).
'parserVersionStr'('CSPM-Frontent-0.11.1.1').
'dataTypeDef'('CONFIGURATION',['constructor'('CONFIGURATION1'),'constructor'('CONFIGURATION2'),'constructor'('CONFIGURATION3')]).
'dataTypeDef'('THREAT',['constructor'('THREAT1'),'constructor'('THREAT2'),'constructor'('THREAT3'),'constructor'('THREAT4'),'constructor'('THREAT5'),'constructor'('THREAT6'),'constructor'('THREAT7'),'constructor'('THREAT8')]).
'dataTypeDef'('DEFENSE',['constructor'('DEFENSE1'),'constructor'('DEFENSE2'),'constructor'('DEFENSE3'),'constructor'('DEFENSE4'),'constructor'('DEFENSE5')]).
'channel'('selectConfig','type'('dotUnitType')).
'channel'('setQoS','type'('dotUnitType')).
'channel'('approveSecureConfig','type'('dotUnitType')).
'channel'('ConfigurationRequestReceived','type'('dotUnitType')).
'channel'('ValidConfigReceived','type'('dotUnitType')).
'channel'('SRARequestReceived','type'('dotUnitType')).
'channel'('DefensesReceived','type'('dotUnitType')).
'channel'('start','type'('dotUnitType')).
'channel'('start_cm','type'('dotUnitType')).
'channel'('start_sra','type'('dotUnitType')).
'channel'('computeDefenses','type'('dotTupleType'(['agent_call'('src_span'(7,48,7,51,465,3),'Set',['DEFENSE'])]))).
'channel'('affectValidDefenses','type'('dotTupleType'(['agent_call'('src_span'(7,48,7,51,465,3),'Set',['DEFENSE'])]))).
'channel'('validateConfig','type'('dotTupleType'(['CONFIGURATION']))).
'channel'('createSecureConfig','type'('dotTupleType'(['CONFIGURATION']))).
'channel'('selectThreat','type'('dotTupleType'(['THREAT']))).
'channel'('initSRA','type'('dotTupleType'(['agent_call'('src_span'(10,19,10,22,585,3),'Set',['THREAT'])]))).
'bindval'('MAIN','prefix'('src_span'(12,8,12,13,605,5),[],'start','val_of'('DSL_COMPOSITION','src_span'(12,17,12,32,614,15)),'src_span'(12,14,12,16,610,24)),'src_span'(12,1,12,32,598,31)).
'bindval'('DSL_COMPOSITION','val_of'('CM_DSL','src_span'(14,19,14,25,649,6)),'src_span'(14,1,14,25,631,24)).
'bindval'('CM_DSL','prefix'('src_span'(16,10,16,18,666,8),[],'start_cm','val_of'('IDENTIFY_CONFIGURATION','src_span'(16,22,16,44,678,22)),'src_span'(16,19,16,21,674,34)),'src_span'(16,1,16,44,657,43)).
'bindval'('IDENTIFY_CONFIGURATION','prefix'('src_span'(19,2,19,30,729,28),[],'ConfigurationRequestReceived','prefix'('src_span'(20,5,20,17,763,12),[],'selectConfig','prefix'('src_span'(20,21,20,27,779,6),[],'setQoS','prefix'('src_span'(20,31,20,45,789,14),['in'(_conf)],'validateConfig','agent_call'('src_span'(21,5,21,25,814,20),'CREATE_SECURE_CONFIG',[_conf]),'src_span'(20,51,21,4,808,37)),'src_span'(20,28,20,30,785,61)),'src_span'(20,18,20,20,775,77)),'src_span'(19,31,20,4,757,111)),'src_span'(18,1,21,31,702,138)).
'agent'('CREATE_SECURE_CONFIG'(_conf2),'prefix'('src_span'(24,2,24,21,874,19),[],'ValidConfigReceived','prefix'('src_span'(25,5,25,23,899,18),['out'(_conf2)],'createSecureConfig','val_of'('SRA_DSL','src_span'(25,32,25,39,926,7)),'src_span'(25,29,25,31,922,16)),'src_span'(24,22,25,4,893,59)),'src_span'(24,2,25,39,874,59)).
'bindval'('SRA_DSL','prefix'('src_span'(27,12,27,21,946,9),[],'start_sra','val_of'('COMPUTE_CONFIGURATION_DEFENSES','src_span'(27,25,27,55,959,30)),'src_span'(27,22,27,24,955,43)),'src_span'(27,1,27,55,935,54)).
'bindval'('COMPUTE_CONFIGURATION_DEFENSES',';'('prefix'('src_span'(30,2,30,20,1027,18),[],'SRARequestReceived','prefix'('src_span'(31,5,31,12,1050,7),['in'(_threats)],'initSRA','repInterleave'(['comprehensionGenerator'(_x,_threats)],'prefix'('src_span'(31,38,31,50,1083,12),['out'(_x)],'selectThreat','skip'('src_span'(31,56,31,60,1101,4)),'src_span'(31,53,31,55,1097,10)),'src_span'(31,28,31,38,1073,10)),'src_span'(31,21,31,23,1065,49)),'src_span'(30,21,31,4,1045,79)),'prefix'('src_span'(32,4,32,19,1111,15),['in'(_defs)],'computeDefenses','agent_call'('src_span'(32,28,32,57,1135,29),'EVALUATE_SECURE_CONFIGURATION',[_defs]),'src_span'(32,25,32,27,1131,44)),'src_span_operator'('no_loc_info_available','src_span'(32,2,32,3,1109,1))),'src_span'(29,1,32,63,992,178)).
'agent'('EVALUATE_SECURE_CONFIGURATION'(_defs2),';'('prefix'('src_span'(35,2,35,18,1234,16),[],'DefensesReceived','prefix'('src_span'(35,22,35,41,1254,19),['out'(_defs2)],'affectValidDefenses','[]'('prefix'('src_span'(36,6,36,25,1285,19),[],'approveSecureConfig','skip'('src_span'(36,29,36,33,1308,4)),'src_span'(36,26,36,28,1304,27)),'skip'('src_span'(36,37,36,41,1316,4)),'src_span_operator'('no_loc_info_available','src_span'(36,34,36,36,1313,2))),'src_span'(35,47,36,4,1278,48)),'src_span'(35,19,35,21,1250,87)),'[]'('val_of'('MAIN','src_span'(36,46,36,50,1325,4)),'skip'('src_span'(36,54,36,58,1333,4)),'src_span_operator'('no_loc_info_available','src_span'(36,51,36,53,1330,2))),'src_span_operator'('no_loc_info_available','src_span'(36,43,36,44,1322,1))),'no_loc_info_available').
'symbol'('CONFIGURATION','CONFIGURATION','src_span'(1,10,1,23,9,13),'Datatype').
'symbol'('CONFIGURATION1','CONFIGURATION1','src_span'(1,26,1,40,25,14),'Constructor of Datatype').
'symbol'('CONFIGURATION2','CONFIGURATION2','src_span'(1,43,1,57,42,14),'Constructor of Datatype').
'symbol'('CONFIGURATION3','CONFIGURATION3','src_span'(1,60,1,74,59,14),'Constructor of Datatype').
'symbol'('THREAT','THREAT','src_span'(2,10,2,16,83,6),'Datatype').
'symbol'('THREAT1','THREAT1','src_span'(2,19,2,26,92,7),'Constructor of Datatype').
'symbol'('THREAT2','THREAT2','src_span'(2,29,2,36,102,7),'Constructor of Datatype').
'symbol'('THREAT3','THREAT3','src_span'(2,39,2,46,112,7),'Constructor of Datatype').
'symbol'('THREAT4','THREAT4','src_span'(2,49,2,56,122,7),'Constructor of Datatype').
'symbol'('THREAT5','THREAT5','src_span'(2,59,2,66,132,7),'Constructor of Datatype').
'symbol'('THREAT6','THREAT6','src_span'(2,69,2,76,142,7),'Constructor of Datatype').
'symbol'('THREAT7','THREAT7','src_span'(2,79,2,86,152,7),'Constructor of Datatype').
'symbol'('THREAT8','THREAT8','src_span'(2,89,2,96,162,7),'Constructor of Datatype').
'symbol'('DEFENSE','DEFENSE','src_span'(3,10,3,17,179,7),'Datatype').
'symbol'('DEFENSE1','DEFENSE1','src_span'(3,20,3,28,189,8),'Constructor of Datatype').
'symbol'('DEFENSE2','DEFENSE2','src_span'(3,31,3,39,200,8),'Constructor of Datatype').
'symbol'('DEFENSE3','DEFENSE3','src_span'(3,42,3,50,211,8),'Constructor of Datatype').
'symbol'('DEFENSE4','DEFENSE4','src_span'(3,53,3,61,222,8),'Constructor of Datatype').
'symbol'('DEFENSE5','DEFENSE5','src_span'(3,64,3,72,233,8),'Constructor of Datatype').
'symbol'('selectConfig','selectConfig','src_span'(5,9,5,21,252,12),'Channel').
'symbol'('setQoS','setQoS','src_span'(5,23,5,29,266,6),'Channel').
'symbol'('approveSecureConfig','approveSecureConfig','src_span'(5,31,5,50,274,19),'Channel').
'symbol'('ConfigurationRequestReceived','ConfigurationRequestReceived','src_span'(6,9,6,37,302,28),'Channel').
'symbol'('ValidConfigReceived','ValidConfigReceived','src_span'(6,39,6,58,332,19),'Channel').
'symbol'('SRARequestReceived','SRARequestReceived','src_span'(6,60,6,78,353,18),'Channel').
'symbol'('DefensesReceived','DefensesReceived','src_span'(6,80,6,96,373,16),'Channel').
'symbol'('start','start','src_span'(6,98,6,103,391,5),'Channel').
'symbol'('start_cm','start_cm','src_span'(6,105,6,113,398,8),'Channel').
'symbol'('start_sra','start_sra','src_span'(6,115,6,124,408,9),'Channel').
'symbol'('computeDefenses','computeDefenses','src_span'(7,9,7,24,426,15),'Channel').
'symbol'('affectValidDefenses','affectValidDefenses','src_span'(7,26,7,45,443,19),'Channel').
'symbol'('Set','Set','src_span'(7,48,7,51,465,3),'BuiltIn primitive').
'symbol'('validateConfig','validateConfig','src_span'(8,9,8,23,486,14),'Channel').
'symbol'('createSecureConfig','createSecureConfig','src_span'(8,25,8,43,502,18),'Channel').
'symbol'('selectThreat','selectThreat','src_span'(9,9,9,21,545,12),'Channel').
'symbol'('initSRA','initSRA','src_span'(10,9,10,16,575,7),'Channel').
'symbol'('MAIN','MAIN','src_span'(12,1,12,5,598,4),'Ident (Groundrep.)').
'symbol'('DSL_COMPOSITION','DSL_COMPOSITION','src_span'(14,1,14,16,631,15),'Ident (Groundrep.)').
'symbol'('CM_DSL','CM_DSL','src_span'(16,1,16,7,657,6),'Ident (Groundrep.)').
'symbol'('IDENTIFY_CONFIGURATION','IDENTIFY_CONFIGURATION','src_span'(18,1,18,23,702,22),'Ident (Groundrep.)').
'symbol'('conf','conf','src_span'(20,46,20,50,804,4),'Ident (Prolog Variable)').
'symbol'('CREATE_SECURE_CONFIG','CREATE_SECURE_CONFIG','src_span'(23,1,23,21,843,20),'Funktion or Process').
'symbol'('conf2','conf','src_span'(23,22,23,26,864,4),'Ident (Prolog Variable)').
'symbol'('SRA_DSL','SRA_DSL','src_span'(27,1,27,8,935,7),'Ident (Groundrep.)').
'symbol'('COMPUTE_CONFIGURATION_DEFENSES','COMPUTE_CONFIGURATION_DEFENSES','src_span'(29,1,29,31,992,30),'Ident (Groundrep.)').
'symbol'('threats','threats','src_span'(31,13,31,20,1058,7),'Ident (Prolog Variable)').
'symbol'('x','x','src_span'(31,28,31,29,1073,1),'Ident (Prolog Variable)').
'symbol'('defs','defs','src_span'(32,20,32,24,1127,4),'Ident (Prolog Variable)').
'symbol'('EVALUATE_SECURE_CONFIGURATION','EVALUATE_SECURE_CONFIGURATION','src_span'(34,1,34,30,1194,29),'Funktion or Process').
'symbol'('defs2','defs','src_span'(34,31,34,35,1224,4),'Ident (Prolog Variable)').