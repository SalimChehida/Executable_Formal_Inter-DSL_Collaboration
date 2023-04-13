MACHINE sRA_DSL
DEFINITIONS
END_OF_GENERATED_DEFINITIONS_FOR == sRA_DSL;
SETS SRA_AS; THREAT; DEFENSE; ENTRY; SECPOLICY
VARIABLES SRA, Threat, Defense, Entry, SecPolicy, AND, Or, NOT, A_threat_sRA, A_defense_sRA, A_compDefenses_sRA, A_subThreats_sRA, A_defenses_entry, A_threats_entry, A_entry_sRA, A_entry_aND, A_entry_or, A_entry_nOT, nameSRAM, nameTh, nameDef, costDef
INVARIANT SRA:FIN(SRA_AS) & Threat:FIN(THREAT) & Defense:FIN(DEFENSE) & Entry:FIN(ENTRY) & SecPolicy:FIN(SECPOLICY) & AND<:Entry & Or<:Entry & NOT<:Entry & A_threat_sRA:Threat+->SRA & A_defense_sRA:Defense+->SRA & A_compDefenses_sRA:SRA<->Defense & A_subThreats_sRA:SRA<->Threat & A_defenses_entry:Entry<->Defense & A_threats_entry:Entry<->Threat & A_entry_sRA:SRA>+>Entry & A_entry_aND:Entry+->AND & A_entry_or:Entry+->Or & A_entry_nOT:NOT>+>Entry & nameSRAM:SRA+->STRING & nameTh:Threat+->STRING & nameDef:Defense+->STRING & costDef:Defense+->REAL & Or/\AND={} & Or/\NOT={} & AND/\NOT={}
INITIALISATION SRA := {SRA_AS1} || Threat := {THREAT1,THREAT2,THREAT3,THREAT4,THREAT5,THREAT6,THREAT7,THREAT8} || Defense := {DEFENSE1,DEFENSE2,DEFENSE3,DEFENSE4,DEFENSE5} || Entry := {ENTRY1,ENTRY2,ENTRY3,ENTRY4,ENTRY5,ENTRY6,ENTRY7,ENTRY8,ENTRY9,ENTRY10,ENTRY11,ENTRY12,ENTRY13,ENTRY14,ENTRY15,ENTRY16} || SecPolicy := {} || AND := {ENTRY2,ENTRY5,ENTRY8,ENTRY11,ENTRY14} || Or := {ENTRY1,ENTRY4,ENTRY6,ENTRY10,ENTRY13,ENTRY16} || NOT := {ENTRY3,ENTRY7,ENTRY9,ENTRY12,ENTRY15} || A_threat_sRA := {} || A_defense_sRA := {} || A_compDefenses_sRA := {} || A_subThreats_sRA := {} || A_defenses_entry := {} || A_threats_entry := {} || A_entry_sRA := {} || A_entry_aND := {} || A_entry_or := {} || A_entry_nOT := {} || nameSRAM := {(SRA_AS1,"RTE sec model")} || nameTh := {(THREAT1,"T1"),(THREAT2,"T2"),(THREAT3,"T3"),(THREAT4,"T4"),(THREAT5,"T5"),(THREAT6,"T6"),(THREAT7,"T7"),(THREAT8,"T8")} || nameDef := {(DEFENSE1,"D1"),(DEFENSE2,"D2"),(DEFENSE3,"D3"),(DEFENSE4,"D4"),(DEFENSE5,"D5")} || costDef := {(DEFENSE1,0.4),(DEFENSE2,0.1),(DEFENSE3,0.3),(DEFENSE4,0.05),(DEFENSE5,0.01)}
OPERATIONS
SRA_NEW(aSRA) = PRE aSRA:SRA_AS & aSRA/:SRA THEN SRA := SRA\/{aSRA} END ;
Threat_NEW(aThreat) = PRE aThreat:THREAT & aThreat/:Threat THEN Threat := Threat\/{aThreat} END ;
Defense_NEW(aDefense) = PRE aDefense:DEFENSE & aDefense/:Defense THEN Defense := Defense\/{aDefense} END ;
SecPolicy_NEW(aSecPolicy) = PRE aSecPolicy:SECPOLICY & aSecPolicy/:SecPolicy THEN SecPolicy := SecPolicy\/{aSecPolicy} END ;
AND_NEW(aAND) = PRE aAND:ENTRY & aAND/:Entry THEN AND := AND\/{aAND} || Entry := Entry\/{aAND} END ;
Or_NEW(aOr) = PRE aOr:ENTRY & aOr/:Entry THEN Or := Or\/{aOr} || Entry := Entry\/{aOr} END ;
NOT_NEW(aNOT) = PRE aNOT:ENTRY & aNOT/:Entry THEN NOT := NOT\/{aNOT} || Entry := Entry\/{aNOT} END ;
SRA_Free(aSRA) = PRE aSRA:SRA THEN SRA := SRA-{aSRA} || A_threat_sRA := A_threat_sRA|>>{aSRA} || A_defense_sRA := A_defense_sRA|>>{aSRA} || A_compDefenses_sRA := {aSRA}<<|A_compDefenses_sRA || A_subThreats_sRA := {aSRA}<<|A_subThreats_sRA || A_entry_sRA := {aSRA}<<|A_entry_sRA || nameSRAM := {aSRA}<<|nameSRAM END ;
Threat_Free(aThreat) = PRE aThreat:Threat THEN Threat := Threat-{aThreat} || A_threat_sRA := {aThreat}<<|A_threat_sRA || A_subThreats_sRA := A_subThreats_sRA|>>{aThreat} || A_threats_entry := A_threats_entry|>>{aThreat} || nameTh := {aThreat}<<|nameTh END ;
Defense_Free(aDefense) = PRE aDefense:Defense THEN Defense := Defense-{aDefense} || A_defense_sRA := {aDefense}<<|A_defense_sRA || A_compDefenses_sRA := A_compDefenses_sRA|>>{aDefense} || A_defenses_entry := A_defenses_entry|>>{aDefense} || nameDef := {aDefense}<<|nameDef || costDef := {aDefense}<<|costDef END ;
SecPolicy_Free(aSecPolicy) = PRE aSecPolicy:SecPolicy THEN SecPolicy := SecPolicy-{aSecPolicy} END ;
AND_Free(aAND) = PRE aAND:AND THEN AND := AND-{aAND} || Entry := Entry-{aAND} || A_defenses_entry := {aAND}<<|A_defenses_entry || A_threats_entry := {aAND}<<|A_threats_entry || A_entry_sRA := A_entry_sRA|>>{aAND} || A_entry_aND := {aAND}<<|A_entry_aND|>>{aAND} || A_entry_or := {aAND}<<|A_entry_or || A_entry_nOT := A_entry_nOT|>>{aAND} END ;
Or_Free(aOr) = PRE aOr:Or THEN Or := Or-{aOr} || Entry := Entry-{aOr} || A_defenses_entry := {aOr}<<|A_defenses_entry || A_threats_entry := {aOr}<<|A_threats_entry || A_entry_sRA := A_entry_sRA|>>{aOr} || A_entry_aND := {aOr}<<|A_entry_aND || A_entry_or := {aOr}<<|A_entry_or|>>{aOr} || A_entry_nOT := A_entry_nOT|>>{aOr} END ;
NOT_Free(aNOT) = PRE aNOT:NOT THEN NOT := NOT-{aNOT} || Entry := Entry-{aNOT} || A_defenses_entry := {aNOT}<<|A_defenses_entry || A_threats_entry := {aNOT}<<|A_threats_entry || A_entry_sRA := A_entry_sRA|>>{aNOT} || A_entry_aND := {aNOT}<<|A_entry_aND || A_entry_or := {aNOT}<<|A_entry_or || A_entry_nOT := {aNOT}<<|(A_entry_nOT|>>{aNOT}) END ;
result <-- GetThreat(aSRA) = PRE aSRA:SRA & aSRA:ran(A_threat_sRA) THEN result := (A_threat_sRA~)[{aSRA}] END ;
result <-- GetDefense(aSRA) = PRE aSRA:SRA & aSRA:ran(A_defense_sRA) THEN result := (A_defense_sRA~)[{aSRA}] END ;
result <-- GetCompDefenses(aSRA) = PRE aSRA:SRA & aSRA:dom(A_compDefenses_sRA) THEN result := A_compDefenses_sRA[{aSRA}] END ;
result <-- GetSubThreats(aSRA) = PRE aSRA:SRA & aSRA:dom(A_subThreats_sRA) THEN result := A_subThreats_sRA[{aSRA}] END ;
result <-- SRA_GetEntry(aSRA) = PRE aSRA:SRA & aSRA:dom(A_entry_sRA) THEN result := A_entry_sRA(aSRA) END ;
result <-- GetDefenses(aEntry) = PRE aEntry:Entry & aEntry:dom(A_defenses_entry) THEN result := A_defenses_entry[{aEntry}] END ;
result <-- GetThreats(aEntry) = PRE aEntry:Entry & aEntry:dom(A_threats_entry) THEN result := A_threats_entry[{aEntry}] END ;
result <-- AND_GetEntry(aAND) = PRE aAND:AND & aAND:ran(A_entry_aND) THEN result := (A_entry_aND~)[{aAND}] END ;
result <-- Or_GetEntry(aOr) = PRE aOr:Or & aOr:ran(A_entry_or) THEN result := (A_entry_or~)[{aOr}] END ;
result <-- NOT_GetEntry(aNOT) = PRE aNOT:NOT & aNOT:dom(A_entry_nOT) THEN result := A_entry_nOT(aNOT) END ;
SetThreat(aSRA, theThreat) = PRE aSRA:SRA & theThreat:FIN(Threat) & theThreat*{aSRA}/<:A_threat_sRA & !added.(added:theThreat => A_threat_sRA[{added}]={}) THEN A_threat_sRA := A_threat_sRA|>>{aSRA}\/theThreat*{aSRA} END ;
SetDefense(aSRA, theDefense) = PRE aSRA:SRA & theDefense:FIN(Defense) & theDefense*{aSRA}/<:A_defense_sRA & !added.(added:theDefense => A_defense_sRA[{added}]={}) THEN A_defense_sRA := A_defense_sRA|>>{aSRA}\/theDefense*{aSRA} END ;
SetCompDefenses(aSRA, theCompDefenses) = PRE aSRA:SRA & theCompDefenses:FIN(Defense) & {aSRA}*theCompDefenses/<:A_compDefenses_sRA THEN A_compDefenses_sRA := {aSRA}<<|A_compDefenses_sRA\/{aSRA}*theCompDefenses END ;
SetSubThreats(aSRA, theSubThreats) = PRE aSRA:SRA & theSubThreats:FIN(Threat) & {aSRA}*theSubThreats/<:A_subThreats_sRA THEN A_subThreats_sRA := {aSRA}<<|A_subThreats_sRA\/{aSRA}*theSubThreats END ;
SRA_SetEntry(aSRA, aEntry) = PRE aSRA:SRA & aEntry:Entry & {(aSRA,aEntry)}/<:A_entry_sRA & (A_entry_sRA~)[{aEntry}]={} THEN A_entry_sRA := {aSRA}<<|A_entry_sRA\/{(aSRA,aEntry)} END ;
SetDefenses(aEntry, theDefenses) = PRE aEntry:Entry & theDefenses:FIN(Defense) & {aEntry}*theDefenses/<:A_defenses_entry THEN A_defenses_entry := {aEntry}<<|A_defenses_entry\/{aEntry}*theDefenses END ;
SetThreats(aEntry, theThreats) = PRE aEntry:Entry & theThreats:FIN(Threat) & {aEntry}*theThreats/<:A_threats_entry THEN A_threats_entry := {aEntry}<<|A_threats_entry\/{aEntry}*theThreats END ;
AND_SetEntry(aAND, theEntry) = PRE aAND:AND & theEntry:FIN(Entry) & theEntry*{aAND}/<:A_entry_aND & !added.(added:theEntry => A_entry_aND[{added}]={}) THEN A_entry_aND := A_entry_aND|>>{aAND}\/theEntry*{aAND} END ;
Or_SetEntry(aOr, theEntry) = PRE aOr:Or & theEntry:FIN(Entry) & theEntry*{aOr}/<:A_entry_or & !added.(added:theEntry => A_entry_or[{added}]={}) THEN A_entry_or := A_entry_or|>>{aOr}\/theEntry*{aOr} END ;
NOT_SetEntry(aNOT, aEntry) = PRE aNOT:NOT & aEntry:Entry & {(aNOT,aEntry)}/<:A_entry_nOT & (A_entry_nOT~)[{aEntry}]={} THEN A_entry_nOT := {aNOT}<<|A_entry_nOT\/{(aNOT,aEntry)} END ;
UnsetThreat(aSRA) = PRE aSRA:SRA THEN A_threat_sRA := A_threat_sRA|>>{aSRA} END ;
UnsetDefense(aSRA) = PRE aSRA:SRA THEN A_defense_sRA := A_defense_sRA|>>{aSRA} END ;
UnsetCompDefenses(aSRA) = PRE aSRA:SRA THEN A_compDefenses_sRA := {aSRA}<<|A_compDefenses_sRA END ;
UnsetSubThreats(aSRA) = PRE aSRA:SRA THEN A_subThreats_sRA := {aSRA}<<|A_subThreats_sRA END ;
SRA_UnsetEntry(aSRA) = PRE aSRA:SRA THEN A_entry_sRA := {aSRA}<<|A_entry_sRA END ;
UnsetDefenses(aEntry) = PRE aEntry:Entry THEN A_defenses_entry := {aEntry}<<|A_defenses_entry END ;
UnsetThreats(aEntry) = PRE aEntry:Entry THEN A_threats_entry := {aEntry}<<|A_threats_entry END ;
AND_UnsetEntry(aAND) = PRE aAND:AND THEN A_entry_aND := A_entry_aND|>>{aAND} END ;
Or_UnsetEntry(aOr) = PRE aOr:Or THEN A_entry_or := A_entry_or|>>{aOr} END ;
NOT_UnsetEntry(aNOT) = PRE aNOT:NOT THEN A_entry_nOT := {aNOT}<<|A_entry_nOT END ;
AddThreat(aSRA, aThreat) = PRE aSRA:SRA & aThreat:Threat & (aThreat,aSRA)/:A_threat_sRA & A_threat_sRA[{aThreat}]={} THEN A_threat_sRA := A_threat_sRA\/{(aThreat,aSRA)} END ;
AddDefense(aSRA, aDefense) = PRE aSRA:SRA & aDefense:Defense & (aDefense,aSRA)/:A_defense_sRA & A_defense_sRA[{aDefense}]={} THEN A_defense_sRA := A_defense_sRA\/{(aDefense,aSRA)} END ;
AddCompDefenses(aSRA, aCompDefenses) = PRE aSRA:SRA & aCompDefenses:Defense & (aSRA,aCompDefenses)/:A_compDefenses_sRA THEN A_compDefenses_sRA := A_compDefenses_sRA\/{(aSRA,aCompDefenses)} END ;
AddSubThreats(aSRA, aSubThreats) = PRE aSRA:SRA & aSubThreats:Threat & (aSRA,aSubThreats)/:A_subThreats_sRA THEN A_subThreats_sRA := A_subThreats_sRA\/{(aSRA,aSubThreats)} END ;
AddDefenses(aEntry, aDefenses) = PRE aEntry:Entry & aDefenses:Defense & (aEntry,aDefenses)/:A_defenses_entry THEN A_defenses_entry := A_defenses_entry\/{(aEntry,aDefenses)} END ;
AddThreats(aEntry, aThreats) = PRE aEntry:Entry & aThreats:Threat & (aEntry,aThreats)/:A_threats_entry THEN A_threats_entry := A_threats_entry\/{(aEntry,aThreats)} END ;
AND_AddEntry(aAND, aEntry) = PRE aAND:AND & aEntry:Entry & (aEntry,aAND)/:A_entry_aND & A_entry_aND[{aEntry}]={} THEN A_entry_aND := A_entry_aND\/{(aEntry,aAND)} END ;
Or_AddEntry(aOr, aEntry) = PRE aOr:Or & aEntry:Entry & (aEntry,aOr)/:A_entry_or & A_entry_or[{aEntry}]={} THEN A_entry_or := A_entry_or\/{(aEntry,aOr)} END ;
RemoveThreat(aSRA, aThreat) = PRE aSRA:SRA & aThreat:Threat & (aThreat,aSRA):A_threat_sRA THEN A_threat_sRA := A_threat_sRA-{(aThreat,aSRA)} END ;
RemoveDefense(aSRA, aDefense) = PRE aSRA:SRA & aDefense:Defense & (aDefense,aSRA):A_defense_sRA THEN A_defense_sRA := A_defense_sRA-{(aDefense,aSRA)} END ;
RemoveCompDefenses(aSRA, aCompDefenses) = PRE aSRA:SRA & aCompDefenses:Defense & (aSRA,aCompDefenses):A_compDefenses_sRA THEN A_compDefenses_sRA := A_compDefenses_sRA-{(aSRA,aCompDefenses)} END ;
RemoveSubThreats(aSRA, aSubThreats) = PRE aSRA:SRA & aSubThreats:Threat & (aSRA,aSubThreats):A_subThreats_sRA THEN A_subThreats_sRA := A_subThreats_sRA-{(aSRA,aSubThreats)} END ;
SRA_RemoveEntry(aSRA, aEntry) = PRE aSRA:SRA & aEntry:Entry & (aSRA,aEntry):A_entry_sRA THEN A_entry_sRA := A_entry_sRA-{(aSRA,aEntry)} END ;
RemoveDefenses(aEntry, aDefenses) = PRE aEntry:Entry & aDefenses:Defense & (aEntry,aDefenses):A_defenses_entry THEN A_defenses_entry := A_defenses_entry-{(aEntry,aDefenses)} END ;
RemoveThreats(aEntry, aThreats) = PRE aEntry:Entry & aThreats:Threat & (aEntry,aThreats):A_threats_entry THEN A_threats_entry := A_threats_entry-{(aEntry,aThreats)} END ;
AND_RemoveEntry(aAND, aEntry) = PRE aAND:AND & aEntry:Entry & (aEntry,aAND):A_entry_aND THEN A_entry_aND := A_entry_aND-{(aEntry,aAND)} END ;
Or_RemoveEntry(aOr, aEntry) = PRE aOr:Or & aEntry:Entry & (aEntry,aOr):A_entry_or THEN A_entry_or := A_entry_or-{(aEntry,aOr)} END ;
NOT_RemoveEntry(aNOT, aEntry) = PRE aNOT:NOT & aEntry:Entry & (aNOT,aEntry):A_entry_nOT THEN A_entry_nOT := A_entry_nOT-{(aNOT,aEntry)} END ;
result <-- GetNameSRAM(aSRA) = PRE aSRA:SRA & aSRA:dom(nameSRAM) THEN result := nameSRAM(aSRA) END ;
result <-- GetNameTh(aThreat) = PRE aThreat:Threat & aThreat:dom(nameTh) THEN result := nameTh(aThreat) END ;
result <-- GetNameDef(aDefense) = PRE aDefense:Defense & aDefense:dom(nameDef) THEN result := nameDef(aDefense) END ;
result <-- GetCostDef(aDefense) = PRE aDefense:Defense & aDefense:dom(costDef) THEN result := costDef(aDefense) END ;
SetNameSRAM(aSRA, aNameSRAM) = PRE aSRA:SRA & aNameSRAM:STRING THEN nameSRAM := {aSRA}<<|nameSRAM\/{(aSRA,aNameSRAM)} END ;
SetNameTh(aThreat, aNameTh) = PRE aThreat:Threat & aNameTh:STRING THEN nameTh := {aThreat}<<|nameTh\/{(aThreat,aNameTh)} END ;
SetNameDef(aDefense, aNameDef) = PRE aDefense:Defense & aNameDef:STRING THEN nameDef := {aDefense}<<|nameDef\/{(aDefense,aNameDef)} END ;
SetCostDef(aDefense, aCostDef) = PRE aDefense:Defense & aCostDef:REAL THEN costDef := {aDefense}<<|costDef\/{(aDefense,aCostDef)} END ;
UnsetNameSRAM(aSRA) = PRE aSRA:SRA THEN nameSRAM := {aSRA}<<|nameSRAM END ;
UnsetNameTh(aThreat) = PRE aThreat:Threat THEN nameTh := {aThreat}<<|nameTh END ;
UnsetNameDef(aDefense) = PRE aDefense:Defense THEN nameDef := {aDefense}<<|nameDef END ;
UnsetCostDef(aDefense) = PRE aDefense:Defense THEN costDef := {aDefense}<<|costDef END ;
RemoveNameSRAM(aSRA, aNameSRAM) = PRE aSRA:SRA & aNameSRAM:STRING & {(aSRA,aNameSRAM)}<:nameSRAM THEN nameSRAM := nameSRAM-{(aSRA,aNameSRAM)} END ;
RemoveNameTh(aThreat, aNameTh) = PRE aThreat:Threat & aNameTh:STRING & {(aThreat,aNameTh)}<:nameTh THEN nameTh := nameTh-{(aThreat,aNameTh)} END ;
RemoveNameDef(aDefense, aNameDef) = PRE aDefense:Defense & aNameDef:STRING & {(aDefense,aNameDef)}<:nameDef THEN nameDef := nameDef-{(aDefense,aNameDef)} END ;
RemoveCostDef(aDefense, aCostDef) = PRE aDefense:Defense & aCostDef:REAL & {(aDefense,aCostDef)}<:costDef THEN costDef := costDef-{(aDefense,aCostDef)} END 
CONSTANTS ENTRY1, ENTRY2, ENTRY3, ENTRY4, ENTRY5, ENTRY6, ENTRY7, ENTRY8, ENTRY9, ENTRY10, ENTRY11, ENTRY12, ENTRY13, ENTRY14, ENTRY15, ENTRY16, DEFENSE1, DEFENSE2, DEFENSE3, DEFENSE4, DEFENSE5, THREAT1, THREAT2, THREAT3, THREAT4, THREAT5, THREAT6, THREAT7, THREAT8, SRA_AS1
PROPERTIES
SRA_AS1:SRA_AS & card({SRA_AS1})=1 & card(SRA_AS)>=1 & THREAT1:THREAT & THREAT2:THREAT & THREAT3:THREAT & THREAT4:THREAT & THREAT5:THREAT & THREAT6:THREAT & THREAT7:THREAT & THREAT8:THREAT & card({THREAT1,THREAT2,THREAT3,THREAT4,THREAT5,THREAT6,THREAT7,THREAT8})=8 & card(THREAT)>=8 & DEFENSE1:DEFENSE & DEFENSE2:DEFENSE & DEFENSE3:DEFENSE & DEFENSE4:DEFENSE & DEFENSE5:DEFENSE & card({DEFENSE1,DEFENSE2,DEFENSE3,DEFENSE4,DEFENSE5})=5 & card(DEFENSE)>=5 & ENTRY1:ENTRY & ENTRY2:ENTRY & ENTRY3:ENTRY & ENTRY4:ENTRY & ENTRY5:ENTRY & ENTRY6:ENTRY & ENTRY7:ENTRY & ENTRY8:ENTRY & ENTRY9:ENTRY & ENTRY10:ENTRY & ENTRY11:ENTRY & ENTRY12:ENTRY & ENTRY13:ENTRY & ENTRY14:ENTRY & ENTRY15:ENTRY & ENTRY16:ENTRY & card({ENTRY1,ENTRY2,ENTRY3,ENTRY4,ENTRY5,ENTRY6,ENTRY7,ENTRY8,ENTRY9,ENTRY10,ENTRY11,ENTRY12,ENTRY13,ENTRY14,ENTRY15,ENTRY16})=16 & card(ENTRY)>=16 & card({SRA_AS1})=1 & SRA_AS/={} & card({THREAT1,THREAT2,THREAT3,THREAT4,THREAT5,THREAT6,THREAT7,THREAT8})=8 & card(THREAT)>=8 & card({DEFENSE1,DEFENSE2,DEFENSE3,DEFENSE4,DEFENSE5})=5 & card(DEFENSE)>=5 & card({ENTRY1,ENTRY2,ENTRY3,ENTRY4,ENTRY5,ENTRY6,ENTRY7,ENTRY8,ENTRY9,ENTRY10,ENTRY11,ENTRY12,ENTRY13,ENTRY14,ENTRY15,ENTRY16})=16 & card(ENTRY)>=16
END