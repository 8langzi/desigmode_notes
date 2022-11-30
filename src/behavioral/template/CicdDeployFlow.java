package src.behavioral.template;

public class CicdDeployFlow extends DeployFlow{
    @Override
    public void pullCodeFromGitlab() {
        System.out.println("持续集成服务器将代码拉到节点服务器");
    }

    @Override
    public void compaileAndPackage() {
        System.out.println("自动编译&打包");
    }

    @Override
    public void copyToTestServer() {
        System.out.println("自动将包copy到测试环境服务器");
    }

    @Override
    public void testing() {
        System.out.println("执行自动化测试");
    }
}
