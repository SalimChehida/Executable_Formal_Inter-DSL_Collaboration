# An Executable Formal Framework for Inter-DSL Collaboration

A Domain-Specific Language (DSL) is used for building models appropriate to specific application domain or specific aspect of the system.  In many cases, a set of models from heterogeneous and independent DSLs are collaboratively combined to specify the same system. This need to define explicit links between the various models and also to manage the collaboration between them.

This directory provides the several assets of our approach for inter-DSL collaboration presented in the following paper accepted at the conference COORDINATION 2023:

- Salim Chehida, Akram Idani, Mario Cortes-Cornax and German Vega " An Executable Formal Framework for Inter-DSL Collaboration", accepted at the conference COORDINATION 2023.

The proposed approach, supported with a formal framework, allows engineers to define how DSLs collaborate with each others. In our approach, the Model-driven engineer specifies the DSLs metamodels and the BPMN models of their collaboration. Then, the metamodels and BPMN diagrams are transformed into B and CSP respectively, while integrating the system properties. Afterwards, the operator can animate the formal specifications while observing the respect of the properties.

We applied the proposed approach to a smart grid case study provided by RTE, the energy transmission company in France. The case study involves two DSLs: the first one, named CM-DSL (Configuration Management DSL), focuses on the management of system configurations assigning to a set of applications various infrastructures. The second one, named SRA-DSL (Security Risk Assessment DSL), is dedicated to security risk assessment. The composition and the collaboration of these DSLs allow to manage configurations while dealing with security concerns.

## 1.  Installation

- Download and install the Eclipse Modeling Framework (EMF) using the following link (Any recent distribution should work) : <br>
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
In this step, the engineer can:
- 1) Build the abstract syntax of each DSL and the metamodel of their composition using EMF-based modelling tool (Ecore, Xtext, Sirius, GMF, etc.).
  - EcoreTools provide a wizard setting up your Ecore project. Click on File->New->Others... and then select Ecore Modeling Project.
  - Give a name for the project and the DSL metamodel. A subfolder named model will be created. It includes two files (.ecore) and (.aird).
  - Open the (.aird) file (for the graphical representation) and start the design using the Palette at the right the IDE windows (add classes, relations, etc.).
  - The following Figure presents example of the specification of SRA DSL metamodel from our use case with the EcoreTools. 
  
   ![alt text](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/58459f7db3d6bf7576d632f61a02c27168282608/DSLs_Modeling/metamodels.jpg)
  
  - The DSL concepts are represented by a metamodel. The different meta-classes (eg. SRA) of the metamodel are characterized by a set of attributes (eg. nameSRAM) and operations (eg. selectThreat), related by a set of associations (eg. defenses).
  - See the [Eclipse EMF Tutorial](https://www.vogella.com/tutorials/EclipseEMF/article.html) for informations on how to create an Ecore metamodels.


- 2) Create models (instances) that conform to the DSL metamodels.
  - Launch a "runtime" of an "Eclipse application" (A standardized model to describe diagram elements, which separates between the semantic (domain) and notation (diagram) elements.). <br> 
  -> In the Ecore Project, click Run Application (the "play" icon) in the toolbar or select Run › Run in the menu. <br> 
  -> Use the EcoreTools wizard to create a model instance of the built DSL metamodel. Click on File->New->Others->Example EMF Model Creation Wizards... and then select the DSL model.
  
  - In the following Figure, we give example of creating SRA DSL model from our use case. 
  
   ![alt text](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/1fa37765d23e4834a4ecf907840999576b5e3e75/DSLs_Modeling/models.jpg)

  - Use right click in root metaclass (eg. SRA) to create new child (eg. Threat or Defense)
  
  - See the [Eclipse EMF Tutorial](https://www.vogella.com/tutorials/EclipseEMF/article.html) for informations on how to create an Ecore models.

- 3) Specify the BPMN diagrams expressing the collaboration between the DSLs using the BPMN2 Modeler.
  - In the Ecore Project, use the EcoreTools wizard to create a BPMN2 diagram. Click on File->New->Others->BPMN2 ... and then select Generic BPMN 2.0 Diagram.
  - Open the BPMN diagram and start the design using the Palette at the right of the IDE windows (add lanes, tasks, etc.). <br>
  -> In our approach, we use the notion of BPMN pool, which is the graphical representation of a participant in a collaboration, to group operations of each DSL, including the composition metamodel. We represent an atomic action specifying one metamodel operation by a BPMN task and we use expanded subprocess to represent a grouping of tasks. BPMN sequence flows are used to represent the sequence of actions in the context of a DSL (inside the Pool), while message flows are used to represent the inter-pool communication. Gateways (exclusive or parallel) model the control flow in each DSL. 
  
   - In the following Figure, we give example of creating a BPMN collaboration model of SRA DSL and CM DSL from our use case. 
   
    ![alt text](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/29ebb0c5823c63f6831af9b608e0390ea9730238/DSLs_Modeling/bpmn.jpg)
   
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
- Confirm the URI (https://github.com/SalimChehida/Inter-DSL-Collaboration.git), Host and Repository path parameters and click Next. 
- Choose the Git branches to clone from the remote repository and click Next.

## 3. Formal Specification in B language



### 3.1 Description
In this step, the engineer can:
- 1) Generate automatically a formal B specification from each DSL and the metamodel of their composition using the Meeduse framework. 
  - Right click on your metamodel (Ecore file (.ecore)) and select "Meeduse: Extract B models".
  - In the following, we generate a B specification from SRA DSL metamodel.
  
   ![alt text](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/2876ff25c30d06f5021953bf052f40d893194cc0/DSLs_Formal_Specification/genB.jpg)
  
  - Three files are extracted: sRA_DSL.ecore.uml (an extraction of a UML model from the ECore file), sRA_DSL.ecore.bmethod (an instance of a B meta-model, extracted from the UML model), and  sRA_DSL.mch (a B specfication defining the static semantics of your DSL represented by sets, variables and typing invariants that define the structural features of the metamodel).

- 2) Complete manually the execution semantics of the generated machine by specifying the B operations defining actions involved in the collaboration process, and also invariant properties. 
  - Create in folder "model", a new file named sRA_DSL_main.mch. It is important to keep the files inside folder "model". They must be located in the same folder as the Ecore file.
  - File "sRA_DSL_main.mch" defines the operational semantics of the DSL. The following specifies the operations : selectThreat, computeDefenses, and initSRA.
 
  ![alt text](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/f85f6d44fd7d3755d856948b3dd49054e751286b/DSLs_Formal_Specification/operation.jpg)

- 3) Inject the models instance of the metamodels into the DSLs B machines.

  - Launch runtime Eclipse.  
  - Right click on the root object of your model (object SRA) and select execute model then abstract behaviour.  
  - Select "Generated injected machine" then click Finish. This will generate the final machine with the valuation of the B abstract sets and the initialisation of B variables.  
    ![alt text](https://github.com/SalimChehida/Inter-DSL-Collaboration/blob/148b58d638469dcebd376ab1400fde76cbae0a01/DSLs_Formal_Specification/inject.jpg)
  
  - See the [Meeduse User Guide](http://vasco.imag.fr/tools/meeduse/html/index.html) for more details about the 3 previous steps.

- 4) Specify a CSP model from the BPMN diagram built in the previous section (This mapping is done manually, but work in progress intends to automate this transformation).
  - In CSP, a process represents an independent entity that performs a sequence of events, which is similar to the notion of pool in BPMN. Communication
between processes is ensured via channels, that may or not transmit data flows; we use then this notion to represent exchanged messages between pools as well
as atomic tasks of the BPMN model.
  - To transform the BPMN collaboration model we first transform pools leading to independent CSP processes, and then we produce a
main process to synchronize them being guided by the messages exchanged by the pools. Note that by convention, processes are named in uppercase
and channels in lowercase. 
  - The used CSP constructs are: <br> 
Process ::= SKIP /* terminating process */<br> 
| ch -> Process /* simple action prefix where ch is a channel */<br> 
| Process ; Process /* sequential composition */<br> 
| Process [] Process /* external choice */<br> 

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
  

