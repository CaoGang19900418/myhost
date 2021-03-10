import java.util.UUID;

/**
 * 测试
 */
public class TestHello {

    public static void main(String args[]){
        System.out.println("Hello World!! my");
        String randomId = getUUID();
        System.out.println(randomId);
    }

    /**
     * 获取随机32uuid
     * @return
     */
    public static String getUUID(){
        String seqId = UUID.randomUUID().toString().replaceAll("-","");
        return seqId;
    }

}
