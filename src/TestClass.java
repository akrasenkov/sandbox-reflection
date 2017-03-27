/**
 * Created by senik11 on 23.03.17.
 */
public class TestClass {
    public String field1;
    protected String field2;
    private String field3;

    public TestClass(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public void method1() {
        System.out.println("method1");
    }

    @Invoke("text1")
    private void method2() {
        System.out.println("method2");
    }

    protected void method3() {
        System.out.println("method3");
    }

    @Invoke("text2")
    protected void method4() {
        System.out.println("method4");
    }
}
