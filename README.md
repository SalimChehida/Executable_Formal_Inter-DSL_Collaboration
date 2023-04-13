# An Executable Formal Framework for Inter-DSL Collaboration

A Domain-Specific Language (DSL) is used for building models appropriate to specific application domain or specific aspect of the system.  In many cases, a set of models from heterogeneous and independent DSLs are collaboratively combined to specify the same system. This need to define explicit links between the various models and also to manage the collaboration between them.

This directory provides the several assets of our approach for inter-DSL collaboration presented in the following paper accepted at the conference COORDINATION 2023:

- Salim Chehida, Akram Idani, Mario Cortes-Cornax and German Vega " An Executable Formal Framework for Inter-DSL Collaboration", accepted in the conference COORDINATION 2023.

The proposed approach, supported with a formal framework, allows engineers to define how DSLs collaborate with each others. In our approach, the Model-driven engineer specifies the DSLs metamodels and the BPMN models of their collaboration. Then the metamodels and BPMN diagrams are transformed into B and CSP respectively, while integrating the system properties. Afterwards, the operator can animate the formal specifications while observing the respect of the properties.

We applied the proposed approach to a smart grid case study provided by RTE, the energy transmission company in France. The case study involves two DSLs: the first one, named CM-DSL (Configuration Management DSL), focuses on the management of system configurations assigning to a set of applications various infrastructures. The second one named SRA-DSL (Security Risk Assessment DSL), is dedicated to security risk assessment. The composition and the collaboration of these DSLs allow to manage configurations while dealing with security concerns.

## 1.  Modeling DSLs and their Collaboration
In this step, the engineer builds:
- The abstract syntax of each DSL and the metamodel of their composition using EMF-based modelling tool (Ecore, Xtext, Sirius, GMF, etc.).
- The BPMN diagrams expressing the collaboration between the DSLs using the BPMN2 Modeler.

### Requirements
- Download and install the Eclipse Modeling Framework : <br>
 https://www.eclipse.org/downloads/packages/release/2022-12/r/eclipse-modeling-tools 
- Download and install the BPMN2 Modeler Update Sites : <br>
 http://download.eclipse.org/bpmn2-modeler/updates/2020-06/1.5.2

### Use case Models

- The EMF metamodel of CM-DSL (Part A of Figure 4 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/CM_DSL/model/cM_DSL.ecore.uml

- The EMF metamodel of SRA-DSL (Part B of Figure 4) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/SRA_DSL/model/sRA_DSL.ecore

- The composition metamodel of SRA-DSL and CM-DSL (Part C of Figure 4) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/Inter_DSL_Collaboration_CM_SRA/model/inter_DSL_Collaboration_CM_SRA.ecore

- The BPMN model of inter-DSL collaboration (Figure 5 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/Inter_DSL_Collaboration_CM_SRA/model/collaboration_CM_SRA.bpmn
