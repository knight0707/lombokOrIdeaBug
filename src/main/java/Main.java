
import java.lang.reflect.Constructor;

/**
 * @author yeweigen
 * @date 20/07/2022 16:02
 */
public class Main {

  public static void main(String args[]) throws Exception {
    Class clazz = Report.class;
    Constructor constructor = clazz.getDeclaredConstructor();
    Object report = constructor.newInstance();
    System.out.println(((Report) report).data.getData());
  }

}
