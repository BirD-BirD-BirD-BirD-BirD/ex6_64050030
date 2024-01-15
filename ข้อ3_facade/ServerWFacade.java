//64050030 นาย กิติภูมิ หน่อเนื้อ
public class ServerWFacade {
    public static void main(String[] args){
        ScheduleServerFacade facade = new ScheduleServerFacade(new ScheduleServer());
        facade.start();
        facade.stop();
    }
}
