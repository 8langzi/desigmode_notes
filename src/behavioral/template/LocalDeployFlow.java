package src.behavioral.template;

public class LocalDeployFlow extends DeployFlow{
    @Override
    public void pullCodeFromGitlab() {
        System.out.println("手动拉代码到本地");
    }

    @Override
    public void compaileAndPackage() {
        System.out.println("在本地电脑编译");
    }

    @Override
    public void copyToTestServer() {
        System.out.println("手动上传到测试服务器");
    }

    @Override
    public void testing() {
        System.out.println("手动测试");
    }
}
