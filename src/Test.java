public class Test {
    private Boolean testEng;
    private Boolean testSpec;
    private Boolean testKaz;

    public Test() {
    }

    public Test(Boolean testEng, Boolean testSpec, Boolean testKaz) {
        this.testEng = testEng;
        this.testSpec = testSpec;
        this.testKaz = testKaz;
    }

    public void passTestEng(){
        testEng=true;
        System.out.println("Test eng passed!");
    }

    public void passTestSpec(){
        testSpec=true;
        System.out.println("Test spec passed!");
    }

    public void passTestKaz(){
        testKaz=true;
        System.out.println("Test kaz passed!");
    }

    public Boolean getTestEng() {
        return testEng;
    }

    public void setTestEng(Boolean testEng) {
        this.testEng = testEng;
    }

    public Boolean getTestSpec() {
        return testSpec;
    }

    public void setTestSpec(Boolean testSpec) {
        this.testSpec = testSpec;
    }

    public Boolean getTestKaz() {
        return testKaz;
    }

    public void setTestKaz(Boolean testKaz) {
        this.testKaz = testKaz;
    }
}
