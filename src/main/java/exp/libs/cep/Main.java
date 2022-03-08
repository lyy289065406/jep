package exp.libs.cep;

public class Main {

    /**
     * 无效的入口类
     * @param args 无效的入参
     */
    public static void main(String[] args) {
        System.out.println("因官方没有把 cep-3.4.0.jar 发布到 Maven");
        System.out.println("故本项目重新对其编译并发布到 sonatype 中央仓库");
        System.out.println("但源码已无法编译，故直接把 *.class 放到 resources");
        System.out.println("使编译好的文件直接打到 jar 包中");
    }
}
