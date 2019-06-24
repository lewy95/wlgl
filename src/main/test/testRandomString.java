import cn.xzxy.lewy.util.RandomStringUtil;
import org.junit.Test;

public class testRandomString {

    @Test
    public void testGetCode(){
        RandomStringUtil rs = new RandomStringUtil();
        String randomString = rs.getRandomCode(8,0);
        System.out.println(randomString);
    }

}
