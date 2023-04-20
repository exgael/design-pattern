There is a phew problem with this implementations.

`Code duplication`:

    Everytime we create a new task, we must follow the structure
    We add a private field AuditTrail,
    Constructor injecting AuditTrail obj,
    then the execute method.

`Nothing is enforcing the structure`:

    A new engineer can come, create new tasks which are not following the structure.

`Wich principle can solve this problem?`

    1 - Polymorphism principle which brings us to the strategy pattern.
![Polymorphism uml](/src/behavioral/templateMethode/problem/polymorphism.png?raw=true "strategy pattern uml")
    
    2 - Inheritance which brings us to the templace method pattern.
![Inheritance uml](/src/behavioral/templateMethode/problem/inheritance.png?raw=true "strategy pattern uml")