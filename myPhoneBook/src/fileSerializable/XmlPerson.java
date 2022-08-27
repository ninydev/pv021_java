package fileSerializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class XmlPerson
{
    private String name;
    private int age;
    private double height;
    private boolean married;
}
