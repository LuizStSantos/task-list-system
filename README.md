
# Task List System

This project is a simple task list management system that allows users to add, remove, view, and complete tasks. It is implemented in Java and provides a basic command-line interface for managing daily tasks.

## Features

- Add tasks with descriptions.
- Remove tasks by their index.
- Mark tasks as completed.
- List all tasks with their completion status.
- User-friendly interaction with easy-to-follow prompts.

## Requirements

- Java 8 or higher

## How to Use

1. **Clone the repository**:

    ```bash
    git clone https://github.com/yourusername/task-list-system.git
    ```

2. **Compile and run**:
   Inside the project directory, compile and run the code with the following commands:

    ```bash
    cd task-list-system
    javac TaskList.java
    java TaskList
    ```

3. **Interact with the system**:

   The system will display a menu where you can choose one of the following options:
    - Add a new task.
    - Remove an existing task by its index.
    - List all tasks (both completed and pending).
    - Mark a task as completed by its index.
    - Exit the system.

### Example of Use
```text
--- Task List ---
1. Add task
2. Remove task
3. List tasks
4. Complete task
5. Exit
Choose an option: 
1
Enter task description: 
Finish Java project
Task added: Finish Java project

--- Task List ---
1. Add task
2. Remove task
3. List tasks
4. Complete task
5. Exit
Choose an option: 
3
0 - [ ] Finish Java project

--- Task List ---
1. Add task
2. Remove task
3. List tasks
4. Complete task
5. Exit
Choose an option: 
4
Enter the index of the task to complete: 
0
Task Finish Java project completed!
```

## Credits
- Author: Luiz Stormorwski dos Santos
- GitHub: [LuizStSantos](https://github.com/LuizStSantos).

## License

This project is licensed under the [MIT License](https://opensource.org/license/mit).
