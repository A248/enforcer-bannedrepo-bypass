package repobypass.consumer;

import repobypass.dependency.Dependency;

public class Consumer {
    public void execute() {
        new Dependency().hello();
    }
}
