package src.behavioral.template;

public class Client {

    public static void main(String[] args) {

        System.out.println("开始本地手动发布流程======");
        DeployFlow localDeployFlow = new LocalDeployFlow();
        localDeployFlow.buildFlow();

        System.out.println("********************");
        System.out.println("开始CICD发布流程==========");
        DeployFlow cicdDeployFlow = new CicdDeployFlow();
        cicdDeployFlow.buildFlow();


    }

}
