public class ScheduleServerFacade implements IScheduleServerFacade{
    private ScheduleServer scheduleServer;

    public ScheduleServerFacade(ScheduleServer scheduleServer){
        this.scheduleServer = scheduleServer;
    }

    public void start(){
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
    }  

    public void stop(){
        System.out.println("After work done.........");
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }

}
