package groupId.artifactId.test;

public class TestClassA implements ITestClassA {
    private ITestClassB test;

    public TestClassA(ITestClassB test) {
        this.test = test;
    }
}
