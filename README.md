# An Executable Formal Framework for Inter-DSL Collaboration

A Domain-Specific Language (DSL) is used for building models appropriate to specific application domain or specific aspect of the system.  In many cases, a set of models from heterogeneous and independent DSLs are collaboratively combined to specify the same system. This need to define explicit links between the various models and also to manage the collaboration between them.

This directory provides the several assets of our approach for inter-DSL collaboration presented in the following paper accepted at the conference COORDINATION 2023:

- Salim Chehida, Akram Idani, Mario Cortes-Cornax and German Vega " An Executable Formal Framework for Inter-DSL Collaboration", accepted at the conference COORDINATION 2023.

The proposed approach, supported with a formal framework, allows engineers to define how DSLs collaborate with each others. In our approach, the Model-driven engineer specifies the DSLs metamodels and the BPMN models of their collaboration. Then the metamodels and BPMN diagrams are transformed into B and CSP respectively, while integrating the system properties. Afterwards, the operator can animate the formal specifications while observing the respect of the properties.

We applied the proposed approach to a smart grid case study provided by RTE, the energy transmission company in France. The case study involves two DSLs: the first one, named CM-DSL (Configuration Management DSL), focuses on the management of system configurations assigning to a set of applications various infrastructures. The second one named SRA-DSL (Security Risk Assessment DSL), is dedicated to security risk assessment. The composition and the collaboration of these DSLs allow to manage configurations while dealing with security concerns.

## 1.  Modeling DSLs and their Collaboration

### 1.1 Requirements
- Download and install the Eclipse Modeling Framework using the following link (Any recent distribution should work) : <br>
 https://www.eclipse.org/downloads/packages/release/2022-12/r/eclipse-modeling-tools 
- Launch your eclipse and install BPMN2 Modeler from the following update sites : <br>
 http://download.eclipse.org/bpmn2-modeler/updates/2020-06/1.5.2  <br>
 See the [Eclipse User Guide](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2Ftasks%2Ftasks-129.htm&cp%3D0_3_17) for instructions on how to install software from update sites.
 
 ### 1.2 Description
In this step, the engineer builds:
- The abstract syntax of each DSL and the metamodel of their composition using EMF-based modelling tool (Ecore, Xtext, Sirius, GMF, etc.).
- The BPMN diagrams expressing the collaboration between the DSLs using the BPMN2 Modeler.


### 1.3 Use case Models

- The EMF metamodel of CM-DSL (Part A of Figure 4 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/CM_DSL/model/cM_DSL.ecore.uml

- The EMF metamodel of SRA-DSL (Part B of Figure 4) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/SRA_DSL/model/sRA_DSL.ecore

- The composition metamodel of SRA-DSL and CM-DSL (Part C of Figure 4) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/Inter_DSL_Collaboration_CM_SRA/model/inter_DSL_Collaboration_CM_SRA.ecore

- The BPMN model of inter-DSL collaboration (Figure 5 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/Inter_DSL_Collaboration_CM_SRA/model/collaboration_CM_SRA.bpmn

## 2. Formal Specification in B language

### 2.1 Requirements
- Launch your eclipse and install B4MSecure and Meeduse from the following update sites : <br>
 - B4MSecure: http://vasco.imag.fr/tools/b4msecure/updates/build
 - Meeduse: http://vasco.imag.fr/tools/meeduse/updates/build

### 2.2 Description
In this step, the engineer can:
- Generate automatically a formal B specification from each DSL and the metamodel of their composition using the Meeduse framework. See the [Meeduse User Guide]( http://vasco.imag.fr/tools/meeduse/html/index.html) for more details.
- Complete manually the execution semantics of the generated machine by specifying the B operations defining actions involved in the collaboration process. See the [Meeduse User Guide]( http://vasco.imag.fr/tools/meeduse/html/index.html) for more details.
- Specify a CSP model from the BPMN diagram built in the previous section (this mapping is done manually. Work in progress intends to automate this transformation).

### 2.3 Use case B specifications

- The CM-DSL B machine (discussed in Section 4.2 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/cM_DSL.mch

- The SRA-DSL B machine (discussed in Section 4.2 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/sRA_DSL.mch

- DSL_Composition B machine (Figure 6 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/inter_DSL_Collaboration_CM_SRA_main.mch

- The CSP model (Figure 7 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/inter_DSL_Collaboration_CM_SRA_main.csp

