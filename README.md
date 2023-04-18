# An Executable Formal Framework for Inter-DSL Collaboration

A Domain-Specific Language (DSL) is used for building models appropriate to specific application domain or specific aspect of the system.  In many cases, a set of models from heterogeneous and independent DSLs are collaboratively combined to specify the same system. This need to define explicit links between the various models and also to manage the collaboration between them.

This directory provides the several assets of our approach for inter-DSL collaboration presented in the following paper accepted at the conference COORDINATION 2023:

- Salim Chehida, Akram Idani, Mario Cortes-Cornax and German Vega " An Executable Formal Framework for Inter-DSL Collaboration", accepted at the conference COORDINATION 2023.

The proposed approach, supported with a formal framework, allows engineers to define how DSLs collaborate with each others. In our approach, the Model-driven engineer specifies the DSLs metamodels and the BPMN models of their collaboration. Then, the metamodels and BPMN diagrams are transformed into B and CSP respectively, while integrating the system properties. Afterwards, the operator can animate the formal specifications while observing the respect of the properties.

We applied the proposed approach to a smart grid case study provided by RTE, the energy transmission company in France. The case study involves two DSLs: the first one, named CM-DSL (Configuration Management DSL), focuses on the management of system configurations assigning to a set of applications various infrastructures. The second one, named SRA-DSL (Security Risk Assessment DSL), is dedicated to security risk assessment. The composition and the collaboration of these DSLs allow to manage configurations while dealing with security concerns.

## 1.  Installation

- Download and install the Eclipse Modeling Framework using the following link (Any recent distribution should work) : <br>
 https://www.eclipse.org/downloads/packages/release/2022-12/r/eclipse-modeling-tools 
- Launch your eclipse and install BPMN2 Modeler, B4MSecure and Meeduse from the following update sites : <br>
  - BPMN2 Modeler:  http://download.eclipse.org/bpmn2-modeler/updates/2020-06/1.5.2  <br>
  - B4MSecure: http://vasco.imag.fr/tools/b4msecure/updates/build <br>
  - Meeduse: http://vasco.imag.fr/tools/meeduse/updates/build <br> 
-> Select "Install New Software..." of the Help menu, then add the update sites URL and complete the installation. <br>
-> See the [Eclipse User Guide](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2Ftasks%2Ftasks-129.htm&cp%3D0_3_17) for instructions on how to install software from update sites.
- Download and install the ProB Animator and Model Checker using the following link: <br>
https://prob.hhu.de/w/index.php?title=Download

## 2.  Modeling DSLs and their Collaboration

### 2.1 Description
In this step, the engineer builds:
- The abstract syntax of each DSL and the metamodel of their composition using EMF-based modelling tool (Ecore, Xtext, Sirius, GMF, etc.).
- Create models (instances) that conform to the DSL metamodels.
  - See the [Eclipse EMF Tutorial](https://www.vogella.com/tutorials/EclipseEMF/article.html) for informations on how to create an Ecore metamodels and models.
- The BPMN diagrams expressing the collaboration between the DSLs using the BPMN2 Modeler.
  - See the [Eclipse BPMN2 Modeler User Guide](https://www.eclipse.org/bpmn2-modeler/documentation/BPMN2ModelerUserGuide-1.0.1.pdf) for informations on how to create BPMN diagrams.

### 2.2 Use case Models

#### 2.2.1 Models code source in GIT

Below the Git links of the models and metamodels from the smart grid use case :

- The EMF metamodel of CM-DSL (Part A of Figure 4 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/CM_DSL/model/cM_DSL.ecore.uml

- The CM-DSL model (Figure 1 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Models/CM_Model/My.cm_dsl

- The EMF metamodel of SRA-DSL (Part B of Figure 4) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/SRA_DSL/model/sRA_DSL.ecore

- The SRA-DSL model (Figure 2 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Models/SRA_Model/My.sra_dsl

- The composition metamodel of SRA-DSL and CM-DSL (Part C of Figure 4) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/Inter_DSL_Collaboration_CM_SRA/model/inter_DSL_Collaboration_CM_SRA.ecore

- The composition model is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Models/comp_CM_SRA/My.inter_dsl_collaboration_cm_sra

- The BPMN model of inter-DSL collaboration (Figure 5 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Modeling/Metamodels/Inter_DSL_Collaboration_CM_SRA/model/collaboration_CM_SRA.bpmn

#### 2.2.2 Open the DSL metamodels and models in Eclipse
- Open Eclipse and choose Import –> Projects from Git (with smart import) 
- Choose the Clone URI option in the Git import wizard and click Next. 
- Confirm the [URI](https://github.com/SalimChehida/Inter-DSL-Collaboration.git), Host and Repository path parameters and click Next. 
- Choose the Git branches to clone from the remote repository and click Next.

## 3. Formal Specification in B language



### 3.1 Description
In this step, the engineer can:
- Generate automatically a formal B specification from each DSL and the metamodel of their composition using the Meeduse framework. 
- Complete manually the execution semantics of the generated machine by specifying the B operations defining actions involved in the collaboration process, and also invariant properties. 
- Inject the models instance of the metamodels into the DSLs B machines.
  - See the [Meeduse User Guide]( http://vasco.imag.fr/tools/meeduse/html/index.html) for more details about the 3 previous steps.
- Specify a CSP model from the BPMN diagram built in the previous section (This mapping is done manually, but work in progress intends to automate this transformation).

### 3.2 Use case B specifications

Below the Git links of the formal specifications generated from the models and metamodels of the smart grid use case :

- The CM-DSL B machine (discussed in Section 4.2 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/cM_DSL.mch

- The SRA-DSL B machine (discussed in Section 4.2 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/sRA_DSL.mch

- DSL_Composition B machine (Figure 6 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/inter_DSL_Collaboration_CM_SRA_main.mch

- The CSP model (Figure 7 in the paper) is available at: <br>
https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/inter_DSL_Collaboration_CM_SRA_main.csp


## 4. Animation and Verification



### 4.1 Description

The B specifications and CSP model generated from the DSL models, metamodels and BPMN diagram are delivered to ProB tool in order to run and check the collaboration process. 

In this step, we use “Guiding B Machines with CSP” feature of ProB to animate step-by-step the operations of DSL_composition B machine. We refer to the CSP||B approach to marry CSP and B such that the execution of a B operation corresponds to an event that can be enabled in CSP, which provides a guidance all along the animation process.

To use this feature of ProB: first open a B Machine, then select "Use Default CSP File" in the "Open Special" submenu of the File menu (you must be in normal user mode to see it).

The CSP file should define a process called "MAIN". This process will be executed in parallel with the B machine. The B machine and the CSP process must synchronise on common events, that is, an operation can only happen in the combined system when it is allowed both by the B and the CSP.

### 4.2 Use case animation scenario

The following Figure presents example of the animation of the [composition B machine](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/inter_DSL_Collaboration_CM_SRA_main.mch) of Figure 6 in the paper guided by the [CSP model](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/inter_DSL_Collaboration_CM_SRA_main.csp) of Figure 7 in the paper. 

- Tu run the animation, Open [composition B machine](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/artefacts-coordination/DSLs_Formal_Specification/inter_DSL_Collaboration_CM_SRA_main.mch), then select File menu/Open Special/Use Default CSP.

![alt text](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/9d0eee89a2931846ae8b9393e1dea550d2151b02/DSLs_Formal_Specification/anim.jpg)

- The History window shows an execution scenario example animated using the ProB tool.    

- The Enabled Operations window lists operations that can be called at this stage and whose execution will satisfy their precondition, and therefore preserve the state invariant. 

- The State Properties window provides the current value of each state variable of the composition machine. 

## 5. Contact 
"SALIM CHEHIDA" salim.chehida@univ-grenoble-alpes.fr
  

