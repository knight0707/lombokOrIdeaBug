import java.util.Objects;
import lombok.Data;

/**
 * @author yeweigen
 * @date 20/07/2022 16:02
 */
@Data
public class Report extends Base {

  private Long id;

  public Value data;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Value getData() {
    data = new Value();
    data.setData("find bug");
    return data;
  }

  public void setData(Value data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Report)) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(getId(), report.getId()) && Objects
        .equals(getData(), report.getData());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getData());
  }
}
