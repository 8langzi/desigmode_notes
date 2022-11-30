package src.behavioral.template;

public abstract class DeployFlow {

    public final void buildFlow(){
        pullCodeFromGitlab();
        compaileAndPackage();
        copyToTestServer();
        testing();
        copyToRemoteServer();
        startApp();
    }

    public abstract void pullCodeFromGitlab();

    public abstract void compaileAndPackage();

    public abstract void copyToTestServer();

    public abstract void testing();

    public void copyToRemoteServer(){
        System.out.println("统一自动上传 启动App包到对应线上服务器");
    }

    public void startApp(){
        System.out.println("统一自动 启动线上App");
    }


}
